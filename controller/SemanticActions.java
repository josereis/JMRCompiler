package controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.rmi.CORBA.Util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import utils.Utils;
import grammar.*;
import grammar.JMRCompilerParser.AtribContext;
import grammar.JMRCompilerParser.BoolContext;
import grammar.JMRCompilerParser.ComandosContext;
import grammar.JMRCompilerParser.FuncaoContext;
import grammar.JMRCompilerParser.Lista_parametrosContext;
import grammar.JMRCompilerParser.ParametroContext;
import models.*;

public class SemanticActions extends JMRCompilerBaseListener {
	private int addressMemoryFree = 0;
	private GenerationOfCode generationOfCode;
	private String nameFunction = "";
	private PilhaIteracao iteracoes = new PilhaIteracao();
	private boolean isDeclaredFunction = false, isMain = true, isReturn = false, isIfElse = false, isFor = false, isBreak = false;
	private Map<String, ObjectSymbolTable> symbolTable = new HashMap<String, ObjectSymbolTable>();
    
	public GenerationOfCode getGenerationOfCode() {
		return generationOfCode;
	}

	public void setGenerationOfCode(GenerationOfCode generationOfCode) {
		this.generationOfCode = generationOfCode;
	}
	
    public boolean getIsDeclaredFunction() {
    	return isDeclaredFunction;
    }
    
    public boolean getIsMain() {
    	return isMain;
    }
    
    public String getNameFunction() {
    	return nameFunction;
    }
    
    public void setIsDeclaredFunction(boolean isFunction) {
		this.isDeclaredFunction = isFunction;
	}

	public int getAddressMemoryFree() {
		return addressMemoryFree;
	}

	public void setAddressMemoryFree(int addressMemoryFree) {
		this.addressMemoryFree = addressMemoryFree;
	}
	
    public Map<String, ObjectSymbolTable> getSymbolTable() {
        return symbolTable;
    }

	public void setSymbolTable(Map<String, ObjectSymbolTable> symbolTable) {
        this.symbolTable = symbolTable;
    }

	public void enterPrograma(JMRCompilerParser.ProgramaContext ctx) {
		if(!Utils.isReservedWord(ctx.ID().getText())) { // verifica se o nome para o programa é uma palavra reservada
			generationOfCode.setProgramName(ctx.ID().getText());
			generationOfCode.generateFileJasmin(); // inicializa o arquivo '.j' para escrita do codigo de três endereços referente ao programa
			generationOfCode.initHeader(); // insere codigo de header do programa
		} else
			System.out.println("ERRO: o nome usado para identificação do programa consiste em uma palavra reservada");
    }
	
	public void exitPrograma(JMRCompilerParser.ProgramaContext ctx) {
		generationOfCode.closeFile(); // Finaliza objeto que será responsavel pela geração de codigo
	}
	
	/**
	 * @description SALVA AS VARIAVEIS DECLARADAS NA TABELA DE SIMBOLOS
	 */
	public void enterDecVars(JMRCompilerParser.DecVarsContext ctx) {
		for(TerminalNode id: ctx.listaIDs().ID()) {
			// verifica se consiste em uma palavra reservada
			if(!Utils.isReservedWord(id.getText())) {
				// verifica se ID já pertence a tabela de simbolos
				if(!symbolTable.containsKey(id.getText())) {
					Variable variable = new Variable(Utils.VARIABLE, addressMemoryFree++);
					
					variable.setType(ctx.tipo.type);
					variable.setValueObject(null);
					// verifica o escopo da variavel, ou seja, verifica se é local ou global
					if(isDeclaredFunction) { // caso a daclaração esteja sendo feita dentro de uma função, o que categoriza a variavel como local
						addressMemoryFree--;
						variable.setMemoryAddress(-1);
						variable.setScope(Variable.LOCAL);
						String nameFunction = ctx.parent.getChild(1).getText();
						
						ObjectSymbolTable function = symbolTable.get(nameFunction);
						// verifica se realmente trata-se de uma função e se o id nao foi declarado nesta função
						if((function instanceof Function) && !((Function)function).isDeclaredId(id.getText())) {
							((Function)function).addLocalVariable(id.getText(), variable);
						}
					} else
						symbolTable.put(id.getText(), variable);
				} else
					System.out.println("ERRO (linha: " + id.getSymbol().getLine() + "): ID usado para indentificação da variavel já foi usado.");
				
				
			} else
				System.out.println("ERRO (linha: " + id.getSymbol().getLine() +"): o ID usado para identificação da variavel consiste em uma palavra reservada");
				
		}
	}
	
	public void exitDecVars(JMRCompilerParser.DecVarsContext ctx) {
		
	}
	
	/**
	 * @description: SALVA AS CONSTANTES NA TABELA DE SIMBOLOS
	 */
	public void enterDecConsts(JMRCompilerParser.DecConstsContext ctx) {
		// verifica se o id é ou não uma palavra reservada
		if(!Utils.isReservedWord(ctx.ID().getText())) {
			// verifica id ja foi declarado e pertence a tabela de simbolos
			if(!symbolTable.containsKey(ctx.ID().getText())) {
				Constant constant = new Constant(Utils.CONSTANT, addressMemoryFree++);
				
				if((ctx.tipo().type == Utils.FLOAT)&&(ctx.valor().value instanceof Integer)) {
					constant.setType(Utils.FLOAT);
					constant.setValueObject((float)((int)ctx.valor().value));
				} else if(((ctx.tipo().type == Utils.INT)&&(ctx.valor().value instanceof Integer)) || ((ctx.tipo().type == Utils.STRING)&&(ctx.valor().value instanceof String)) || ((ctx.tipo().type == Utils.BOOL)&&(ctx.valor().value instanceof Boolean))) {
					constant.setType(ctx.tipo().type);
					constant.setValueObject(ctx.valor().value);
				} else {
					System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): o valor passado é incompativel com o tipo declarado para a constante.");
					addressMemoryFree--;
					
					return;
				}
				
				symbolTable.put(ctx.ID().getText(), constant);
			} else
				System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID usado para indentificação da constante já foi usado.");
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): o ID usado para identificação da constante consiste em uma palavra reservada");
	}
	
	public void exitDecConsts(JMRCompilerParser.DecConstsContext ctx) {
		
	}
	
	/**
	 * @description: SALVA AS FUNÇÕES DECLARADAS NA TABELA DE SIMBOLOS
	 */
	public void enterDecFuncs(JMRCompilerParser.DecFuncsContext ctx) {
		// verifica se id é ou não uma palavra reservada
		if(!Utils.isReservedWord(ctx.ID().getText())) {
			// verifica se id ja foi declarado (pertence a tabela de simbolos)
			if(!symbolTable.containsKey(ctx.ID().getText())) {
				this.isReturn = true; // habilita uso do return
				this.isDeclaredFunction = true;
				this.nameFunction = ctx.ID().getText();
				
				// cria a função
				Function function = new Function(Utils.FUNCTION, addressMemoryFree++);
				
				function.setType(ctx.tipoF().type);
				// verifica se possui ou não algum parametro (são opicionais)
				if(ctx.lista_parametros() != null) {
					for(ParametroContext parametro: ctx.lista_parametros().parametro()) {
						if(!function.getParameters().containsKey(parametro.ID().getText())) {
							Parameter p = new Parameter(Utils.PARAMETER, -1);
							
							p.setType(parametro.tipo().type);
							function.addParameter(parametro.ID().getText(), p);
						} else
							System.out.println("ERRO: o id do parametro ja foi declarado na funcao.");
					}
				}
				generationOfCode.generationHeaderFunction(this.nameFunction);
			} else
				System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID usado para indentificação da função já foi usado.");
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): o ID usado para identificação da função consiste em uma palavra reservada");
	}
	
	public void exitDecFuncs(JMRCompilerParser.DecFuncsContext ctx) {
		this.isReturn = false;
		this.isDeclaredFunction = false;
		
		generationOfCode.generationFooterFunction(this.nameFunction);
		this.nameFunction = "";
	}
	
	private void enterReturnComand(JMRCompilerParser.ComandosContext ctx) {
		if(isReturn) {
			int typeFunction = symbolTable.get(nameFunction).getType(), typeBool = Utils.verifyctBoolType(ctx.bool(), this);
			if(typeBool == typeFunction) {
				if(typeFunction==Utils.INT && typeBool==Utils.FLOAT) {
					generationOfCode.coercaoIntToFloat();
				} else {
					// codigo sem coercao
				}
			} else
				System.out.println("ERRO: tipo de retorno incompativel com o tipo definido na função");
		} else
			System.out.println("ERRO: return sendo usado fora do escopo de uma função.");
	}
	
	public void enterComandos(JMRCompilerParser.ComandosContext ctx) {
		if(ctx.getChild(0).getText().equals("return")) {
			enterReturnComand(ctx); // trata o comando de retorno
		} else if(ctx.getChild(0).getText().equals("if")) {
			if(Utils.verifyctBoolType((BoolContext) ctx.getChild(2), this)==Utils.BOOL) {	
				if(ctx.getChildCount() >= 8) { // caso seja o comando if_else
					isIfElse = true;
					generationOfCode.generationInitIfElseCode();
				} else {
					generationOfCode.generationInitIfCode();
				}
			} else
				System.out.println("ERRO: tipos incompativeis na comparação do if");
		} else if(ctx.getChild(0).getText().equals("for")) {
			isFor = true;
			isBreak = true;
			
			AtribContext atribContext = (AtribContext) ctx.getChild(6);
			
			ArrayList<ComandosContext> comandos = new ArrayList<ComandosContext>();
			for(int i = 9; i < ctx.getChildCount()-1; i++) {
				comandos.add((ComandosContext) ctx.getChild(i));
			}
			
			int qf = ctx.getChildCount() - 1;
			for(int i = qf; i > 5; i--) {
				ctx.removeLastChild();
			}
			
			for(ComandosContext c: comandos) {
				ctx.addChild(c);
			}
			ctx.addChild(atribContext);
		}
	}
	
	public void exitComandos(JMRCompilerParser.ComandosContext ctx) {
		if(ctx.getParent().getChild(0).getText().equals("if") && ctx.getParent().getChildCount()>=8 && isIfElse) {	
			isIfElse = false;
			generationOfCode.generationSaltoInternoIfElse();
		} else {
			if(ctx.getChild(0).getText().equals("return")) {
				enterReturnComand(ctx); // trata o comando de retorno
			} else if(ctx.getChild(0).getText().equals("if")) {
				if(ctx.getChildCount() >= 8) { // caso seja o comando if_else
					generationOfCode.generationFinalIfElseCode();
				} else {
					generationOfCode.generationFinalIfCode();
				}
			} else if(ctx.getChild(0).getText().equals("for")) {
				isBreak = false;
				generationOfCode.generationFinalFor();
			}
		}
	}
	
	/**
	 * @description: TRATAMENTO DO BLOCO MAIN
	 */
	public void enterMain(JMRCompilerParser.MainContext ctx) {
		this.isMain = true;
		generationOfCode.initHeaderMain();
		generationOfCode.loadConstant();
	}
	
	public void exitMain(JMRCompilerParser.MainContext ctx) {
		isMain = false;
		generationOfCode.endMain();
	}
	
	/**
	 * @description: TRATAMENTO DA REALIZAÇÃO DO COMANDO READ
	 */
	public void enterRead(JMRCompilerParser.ReadContext ctx) {
		// para verificar todos os ids passados para a leitura
		for(TerminalNode id: ctx.listaIDs2().ID()) {
			if(!(symbolTable.get(id.getText()) instanceof Constant) && !(symbolTable.get(id.getText()) instanceof Function)) {
				ObjectSymbolTable object = null;
				if(!isMain && ((Function) symbolTable.get(nameFunction)).isDeclaredId(id.getText())) {
					object = ((Function) symbolTable.get(nameFunction)).objectVariableOrParameter(id.getText());
				} else if(symbolTable.containsKey(id.getText())){
					object = symbolTable.get(id.getText());
				} else
					System.out.println("ERRO (linha:" + id.getSymbol().getLine() + "): id especificado não corresponde a uma variavel declarada.");
				
				generationOfCode.generationRead(object.getType(), object.getMemoryAddress());
			} else
				System.out.println("ERRO (linha:" + id.getSymbol().getLine() + "): id especificado consiste em uma constante, ou função, e seu valor não pode ser alterado.");
		}
	}
	
	 public void exitRead(JMRCompilerParser.ReadContext ctx) {
		 
	 }
	
	/**
	 * @description: TRATAMENTO DA REALIZAÇÃO DO COMANDO PRINT
	 */
	public void enterPrint(JMRCompilerParser.PrintContext ctx) {
		for(JMRCompilerParser.BoolContext obj: ctx.bool()) {
			generationOfCode.initGenerationPrint(); // inicializa o codigo para print de uma expressão
			
			generationOfCode.execPrint(Utils.verifyctBoolType(obj, this)); // chama função de print de acordo com o tipo passado
		}
		generationOfCode.printNewLine();
	}
	
	public void exitPrint(JMRCompilerParser.PrintContext ctx) {
		
	}
	
	/**
	 * @description: TRATAMENTO DA REALIZAÇÃO DO COMANDO DE ATRIBUIÇÃO
	 */
	public void enterAtrib(JMRCompilerParser.AtribContext ctx) {
		// verifica se realmente trata-se de uma variavel (ou parametro, caso esteja no escopo de uma variavel local)
		if(symbolTable.get(ctx.ID().getText()).getTypeObjectSimbolTable() != Utils.CONSTANT) {
			ObjectSymbolTable object = null;
			
			// verifica se está em uma função que não se trata do main
			if(isDeclaredFunction) {
				Function function = ((Function)symbolTable.get(nameFunction));
				// verificar se trata-se de um parametro ou variavel local
				if(function.isDeclaredId(ctx.ID().getText())) {
					object = function.objectVariableOrParameter(ctx.ID().getText());
				} else if(symbolTable.containsKey(ctx.ID().getText())) { // caso não seja uma variavel local, verifica se consiste em uma variavel global
					object = symbolTable.get(ctx.ID().getText());
				}
			} else
				object = symbolTable.get(ctx.ID().getText());
			 
			if(object != null) {
				String op = ctx.getChild(1).getText(); // guarda o operador de atribuição da regra
				if(op.equals("=")) {
					int typeExprBool = Utils.verifyctBoolType((JMRCompilerParser.BoolContext) ctx.getChild(2), this);
					
					if(object.getType()==typeExprBool) {
						generationOfCode.variableSalve(typeExprBool, object.getMemoryAddress()); // salva variavel na memoria
					} else if(object.getType()==Utils.FLOAT && typeExprBool==Utils.INT) {
						generationOfCode.variableSalveCoercaoIntToFloat(object.getMemoryAddress()); // salvar variavel, porem deve-se fazer a coerção de tipos de inteiro para real
					} else
						System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): tipos incompativeis para realização da atribuição");
				} else {
					if(object.getType()==Utils.INT || object.getType()==Utils.FLOAT) {
						if(op.equals("++")) {
							// atribuição de incremento (pensar em como avaliar com real ou inteiro para faze a atribuição de maneira correta).
							generationOfCode.incremento(object.getType(), object.getMemoryAddress());
						} else {
							// atribuição de decremento (pensar em como avaliar com real ou inteiro para faze a atribuição de maneira correta).
							generationOfCode.decremento(object.getType(), object.getMemoryAddress());
						}
					} else
						System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): tipo incompativel para operação de atribuição (ou ++ ou --).");
				}
			} else
				System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID não declarado.");
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID informado identifica uma constante, e portanto seu valor não pode ser alterado");
	}
	
	public void exitAtrib(JMRCompilerParser.AtribContext ctx) {
		if(ctx.getParent().getChild(0).getText().equals("for") && isFor) {
			isFor = false;
			generationOfCode.generationInitForCode();
			if(Utils.verifyctBoolType((BoolContext) ctx.getParent().getChild(4), this)==Utils.BOOL) {
				generationOfCode.generationTestForCode();
			} else {
				// erro
			}
			
		}
	}
	
	public SemanticActions(String sourceFileDirectory) {
		this.generationOfCode = new GenerationOfCode(symbolTable, sourceFileDirectory);
	}
    
}

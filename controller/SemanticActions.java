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
		if(!Utils.isReservedWord(ctx.ID().getText())) { // verifica se o nome para o programa � uma palavra reservada
			generationOfCode.setProgramName(ctx.ID().getText());
			generationOfCode.generateFileJasmin(); // inicializa o arquivo '.j' para escrita do codigo de tr�s endere�os referente ao programa
			generationOfCode.initHeader(); // insere codigo de header do programa
		} else
			System.out.println("ERRO: o nome usado para identifica��o do programa consiste em uma palavra reservada");
    }
	
	public void exitPrograma(JMRCompilerParser.ProgramaContext ctx) {
		generationOfCode.closeFile(); // Finaliza objeto que ser� responsavel pela gera��o de codigo
	}
	
	/**
	 * @description SALVA AS VARIAVEIS DECLARADAS NA TABELA DE SIMBOLOS
	 */
	public void enterDecVars(JMRCompilerParser.DecVarsContext ctx) {
		for(TerminalNode id: ctx.listaIDs().ID()) {
			// verifica se consiste em uma palavra reservada
			if(!Utils.isReservedWord(id.getText())) {
				// verifica se ID j� pertence a tabela de simbolos
//				if(!symbolTable.containsKey(id.getText())) {
//					Variable variable = new Variable(Utils.VARIABLE, addressMemoryFree++);
//					
//					variable.setType(ctx.tipo().type);
//					// verifica o escopo da variavel, ou seja, verifica se � local ou global
//					if(isDeclaredFunction) { // caso a daclara��o esteja sendo feita dentro de uma fun��o, o que categoriza a variavel como local
//						addressMemoryFree--;
//						variable.setScope(Variable.LOCAL); // adiciona escopo da variavel
//						Function function = (Function) symbolTable.get(nameFunction);
//						
//						// verifica se o id nao foi declarado nesta fun��o
//						if(!((Function)function).isDeclaredId(id.getText())) {
//							((Function)function).addLocalVariable(id.getText(), variable);
//						}
//					} else
//						symbolTable.put(id.getText(), variable);
//				} else
//					System.out.println("ERRO (linha: " + id.getSymbol().getLine() + "): ID usado para indentifica��o da variavel j� foi usado.");
				
				Variable variable = new Variable(Utils.VARIABLE, -1);
				if(isDeclaredFunction) {
					Function function = (Function) symbolTable.get(nameFunction);
					if(function!=null && !function.isDeclaredId(id.getText())) {
						variable.setScope(Variable.LOCAL);
						function.addLocalVariable(id.getText(), variable);
					} else {
						System.out.println("ERRO (linha: " + id.getSymbol().getLine() +"): o ID usado para identifica��o da variavel no escopo da fun��o "+ nameFunction +" ja foi declarado.");
					}					
				} else {
					if(!symbolTable.containsKey(id.getText())) {
						variable.setScope(Variable.GLOBAL);
						variable.setMemoryAddress(addressMemoryFree++);
						
						// adiciona a variavel a tabela de simbolos
						symbolTable.put(id.getText(), variable);
					} else {
						System.out.println("ERRO (linha: " + id.getSymbol().getLine() +"): o ID usado para identifica��o ja foi declarado.");
					}
				}
			} else {
				System.out.println("ERRO (linha: " + id.getSymbol().getLine() +"): o ID usado para identifica��o da variavel consiste em uma palavra reservada");
			}
		}
	}
	
	public void exitDecVars(JMRCompilerParser.DecVarsContext ctx) {
		
	}
	
	/**
	 * @description: SALVA AS CONSTANTES NA TABELA DE SIMBOLOS
	 */
	public void enterDecConsts(JMRCompilerParser.DecConstsContext ctx) {
		// verifica se o id � ou n�o uma palavra reservada
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
					System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): o valor passado � incompativel com o tipo declarado para a constante.");
					addressMemoryFree--;
					
					return;
				}
				
				symbolTable.put(ctx.ID().getText(), constant);
			} else
				System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID usado para indentifica��o da constante j� foi usado.");
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): o ID usado para identifica��o da constante consiste em uma palavra reservada");
	}
	
	public void exitDecConsts(JMRCompilerParser.DecConstsContext ctx) {
		
	}
	
	/**
	 * @description: SALVA AS FUN��ES DECLARADAS NA TABELA DE SIMBOLOS
	 */
	public void enterDecFuncs(JMRCompilerParser.DecFuncsContext ctx) {
		// verifica se id � ou n�o uma palavra reservada
		if(!Utils.isReservedWord(ctx.ID().getText())) {
			// verifica se id ja foi declarado (pertence a tabela de simbolos)
			if(!symbolTable.containsKey(ctx.ID().getText())) {
				this.isReturn = true;
				this.isDeclaredFunction = true;
				this.nameFunction = ctx.ID().getText();
				
				// cria nova fun�ao que deve ser persistida na tabela de simbolos
				Function function = new Function(Utils.FUNCTION, -1);
				
				// verifica e seta os parametros para a fun��o, casos existam
				for(ParametroContext p: ctx.lista_parametros().parametro()) {
					// incializa a entidade que representa um parametro
					Parameter parameter = new Parameter(Utils.PARAMETER, -1);
					parameter.setType(p.tipo().type); // seta o tipo do parametro
					// adiciona o parametro a funcao
					function.addParameter(p.ID().getText(), parameter);
				}				
				// salva fun��o na tabela de simbolos
				symbolTable.put(nameFunction, function);
				
				// chamo fun��o para gera��o de codigo intermediario para cabe�alho de fun��o
			} else
				System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): o ID usado para identifica��o da fun��o ja foi declarado e ja pertence a tabela de simbolos.");
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): o ID usado para identifica��o da fun��o consiste em uma palavra reservada");
	}
	
	public void exitDecFuncs(JMRCompilerParser.DecFuncsContext ctx) {
		this.isReturn = false;
		this.isDeclaredFunction = false;
		Function function = (Function) symbolTable.get(nameFunction);
		
		generationOfCode.generationFooterFunction(function.getType()); this.nameFunction = "";
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
				System.out.println("ERRO: tipo de retorno incompativel com o tipo definido na fun��o");
		} else
			System.out.println("ERRO: return sendo usado fora do escopo de uma fun��o.");
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
				System.out.println("ERRO: tipos incompativeis na compara��o do if");
		} else if(ctx.getChild(0).getText().equals("for")) {
			isFor = true;
			isBreak = true;
			
			AtribContext atribContext = (AtribContext) ctx.getChild(6);
			
			ArrayList<ComandosContext> comandos = new ArrayList<ComandosContext>();
			for(int i = 9; i < ctx.getChildCount()-1; i++) {
				comandos.add((ComandosContext) ctx.getChild(i));
			}
			
			int qf = ctx.getChildCount() - 1;
			for(int i = qf; i > qf-5; i--) {
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
	 * @description: TRATAMENTO DA REALIZA��O DO COMANDO READ
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
					System.out.println("ERRO (linha:" + id.getSymbol().getLine() + "): id especificado n�o corresponde a uma variavel declarada.");
				
				generationOfCode.generationRead(object.getType(), object.getMemoryAddress());
			} else
				System.out.println("ERRO (linha:" + id.getSymbol().getLine() + "): id especificado consiste em uma constante, ou fun��o, e seu valor n�o pode ser alterado.");
		}
	}
	
	 public void exitRead(JMRCompilerParser.ReadContext ctx) {
		 
	 }
	
	/**
	 * @description: TRATAMENTO DA REALIZA��O DO COMANDO PRINT
	 */
	public void enterPrint(JMRCompilerParser.PrintContext ctx) {
		for(JMRCompilerParser.BoolContext obj: ctx.bool()) {
			generationOfCode.initGenerationPrint(); // inicializa o codigo para print de uma express�o
			
			generationOfCode.execPrint(Utils.verifyctBoolType(obj, this)); // chama fun��o de print de acordo com o tipo passado
		}
		generationOfCode.printNewLine();
	}
	
	public void exitPrint(JMRCompilerParser.PrintContext ctx) {
		
	}
	
	/**
	 * @description: TRATAMENTO DA REALIZA��O DO COMANDO DE ATRIBUI��O
	 */
	public void enterAtrib(JMRCompilerParser.AtribContext ctx) {
		// verifica se realmente trata-se de uma variavel (ou parametro, caso esteja no escopo de uma variavel local)
		if(symbolTable.get(ctx.ID().getText()).getTypeObjectSimbolTable() != Utils.CONSTANT) {
			ObjectSymbolTable object = null;
			
			// verifica se est� em uma fun��o que n�o se trata do main
			if(isDeclaredFunction) {
				Function function = ((Function)symbolTable.get(nameFunction));
				// verificar se trata-se de um parametro ou variavel local
				if(function.isDeclaredId(ctx.ID().getText())) {
					object = function.objectVariableOrParameter(ctx.ID().getText());
				} else if(symbolTable.containsKey(ctx.ID().getText())) { // caso n�o seja uma variavel local, verifica se consiste em uma variavel global
					object = symbolTable.get(ctx.ID().getText());
				}
			} else
				object = symbolTable.get(ctx.ID().getText());
			 
			if(object != null) {
				String op = ctx.getChild(1).getText(); // guarda o operador de atribui��o da regra
				if(op.equals("=")) {
					int typeExprBool = Utils.verifyctBoolType((JMRCompilerParser.BoolContext) ctx.getChild(2), this);
					
					if(object.getType()==typeExprBool) {
						generationOfCode.variableSalve(typeExprBool, object.getMemoryAddress()); // salva variavel na memoria
					} else if(object.getType()==Utils.FLOAT && typeExprBool==Utils.INT) {
						generationOfCode.variableSalveCoercaoIntToFloat(object.getMemoryAddress()); // salvar variavel, porem deve-se fazer a coer��o de tipos de inteiro para real
					} else
						System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() +"): tipos incompativeis para realiza��o da atribui��o");
				} else {
					if(object.getType()==Utils.INT || object.getType()==Utils.FLOAT) {
						if(op.equals("++")) {
							// atribui��o de incremento (pensar em como avaliar com real ou inteiro para faze a atribui��o de maneira correta).
							generationOfCode.incremento(object.getType(), object.getMemoryAddress());
						} else {
							// atribui��o de decremento (pensar em como avaliar com real ou inteiro para faze a atribui��o de maneira correta).
							generationOfCode.decremento(object.getType(), object.getMemoryAddress());
						}
					} else
						System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): tipo incompativel para opera��o de atribui��o (ou ++ ou --).");
				}
			} else
				System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID n�o declarado.");
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID informado identifica uma constante, e portanto seu valor n�o pode ser alterado");
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

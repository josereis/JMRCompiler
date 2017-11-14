package semantica;


import java.util.HashMap;
import java.util.Map;

import javax.rmi.CORBA.Util;

import org.antlr.v4.runtime.tree.TerminalNode;
import utils.Utils;
import grammar.*;
import models.*;

public class AcoesSemanticas extends JMRCompilerBaseListener {
	
	private String nameProgramer = "";
	private int addressMemoryFree = 0;
	private boolean isFunction = false, isMain = true;
	private Map<String, ObjectSymbolTable> symbolTable = new HashMap<String, ObjectSymbolTable>();
    
    public boolean getIsFunction() {
    	return isFunction;
    }
    
    public void setIsFunction(boolean isFunction) {
		this.isFunction = isFunction;
	}
    
    public String getNameProgramer() {
		return nameProgramer;
	}

	public void setNameProgramer(String nameProgramer) {
		this.nameProgramer = nameProgramer;
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
			nameProgramer = ctx.ID().getText();
		} else
			System.out.println("ERRO: o nome usado para identifica��o do programa consiste em uma palavra reservada");
    }
	
	public void exitPrograma(JMRCompilerParser.ProgramaContext ctx) {
		// Finaliza objeto que ser� responsavel pela gera��o de codigo
	}
	
	/**
	 * @description SALVA AS VARIAVEIS DECLARADAS NA TABELA DE SIMBOLOS
	 */
	public void enterDecVars(JMRCompilerParser.DecVarsContext ctx) {
		for(TerminalNode id: ctx.listaIDs().ID()) {
			// verifica se consiste em uma palavra reservada
			if(!Utils.isReservedWord(id.getText())) {
				// verifica se ID j� pertence a tabela de simbolos
				if(!symbolTable.containsKey(id.getText())) {
					Variable variable = new Variable(Utils.VARIABLE, addressMemoryFree++);
					
					variable.setType(ctx.tipo.type);
					variable.setScope(Variable.GLOBAL);
					variable.setValueObject(null);
					// verifica o escopo da variavel, ou seja, verifica se � local ou global
					if(isFunction) { // caso a daclara��o esteja sendo feita dentro de uma fun��o, o que categoriza a variavel como local
						String nameFunction = ctx.parent.getChild(1).getText();
						
						ObjectSymbolTable function = symbolTable.get(nameFunction);
						// verifica se realmente trata-se de uma fun��o e se o id nao foi declarado nesta fun��o
						if((function instanceof Function) && !((Function)function).isDeclaredId(id.getText())) {
							((Function)function).addLocalVariable(id.getText(), variable);
						}
					} else
						symbolTable.put(id.getText(), variable);
				} else
					System.out.println("ERRO (linha: " + id.getSymbol().getLine() + "): ID usado para indentifica��o da variavel j� foi usado.");
				
				
			} else
				System.out.println("ERRO (linha: " + id.getSymbol().getLine() +"): o ID usado para identifica��o da variavel consiste em uma palavra reservada");
				
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
		
	}
	
	public void exitDecFuncs(JMRCompilerParser.DecFuncsContext ctx) {
		
	}
	
	/**
	 * @description: TRATAMENTO DA REALIZA��O DO COMANDO DE ATRIBUI��O
	 */
	public void enterAtrib(JMRCompilerParser.AtribContext ctx) {
		// verifica se realmente trata-se de uma variavel
		if(symbolTable.get(ctx.ID().getText()).getTypeObjectSimbolTable() == Utils.VARIABLE) {
			
		} else
			System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): ID informado n�o representa uma variavel");
	}
	
	public void exitAtrib(JMRCompilerParser.AtribContext ctx) {
		
	}
    
}

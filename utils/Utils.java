package utils;

import java.awt.Container;

import controller.SemanticActions;
import grammar.JMRCompilerParser;
import grammar.JMRCompilerParser.FuncaoContext;
import models.Constant;
import models.Function;
import models.ObjectSymbolTable;
import models.Parameter;
import models.Variable;

public class Utils {
	public static final int VOID = 0, INT = 1, FLOAT = 2, STRING = 3, BOOL = 4, ERROTYPE = -1;
	public static final int VARIABLE = 1, CONSTANT = 2, FUNCTION = 3, PARAMETER = 4;
	
	private static String [] reservedWords = {"Class", "Main", "Int", "Float", "Str", "Bool", "Void", "final", "if", "else", "for", "break", "return", "print", "read" };
	
	public static boolean isReservedWord(String id) {
		for(String word: reservedWords) {
			if(word.equals(id))
				return true;
		}

		return false;
	}
	
	public static int verifyctBoolType(JMRCompilerParser.BoolContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // se a quantidade de filhos da regra é igual a 1, implica que a regra 'bool' deriva na regra 'join'
			return verifyctJoinType((JMRCompilerParser.JoinContext) ctx.getChild(0), semanticActions);
		} else { // caso contrario, é necessario avaliar as outras duas expressões, verificar se tratam-se de atributos booleanos e realizar a operação de 'or'
			if(verifyctBoolType((JMRCompilerParser.BoolContext) ctx.getChild(0), semanticActions)==BOOL && verifyctJoinType((JMRCompilerParser.JoinContext) ctx.getChild(2), semanticActions)==BOOL) {
				semanticActions.getGenerationOfCode().or();
				
				return BOOL;
			} else
				System.out.println("ERRO: tipos incompativeis para a realização do comando OR.");
		}
		
		return ERROTYPE;
	}
	
	public static int verifyctJoinType(JMRCompilerParser.JoinContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // se a quantidade de filhos da regra é igual a 1, implica que a regra 'join' deriva na regra 'rel' (rel - operações relacionais)
			return verifyctRelType((JMRCompilerParser.RelContext) ctx.getChild(0), semanticActions);
		} else {
			if(verifyctJoinType((JMRCompilerParser.JoinContext) ctx.getChild(0), semanticActions)==BOOL && verifyctRelType((JMRCompilerParser.RelContext) ctx.getChild(2), semanticActions)==BOOL) {
				semanticActions.getGenerationOfCode().and();
				
				return BOOL;
			} else
				System.out.println("ERRO: tipos incompativeis para a realização do comando AND.");
		}
		
		return ERROTYPE;
	}
	
	public static int verifyctRelType(JMRCompilerParser.RelContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) {
			return verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(0), semanticActions);
		} else {
			int typeEq1 = verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(0), semanticActions);
			int typeEq2 = verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(2), semanticActions);
			
			if((typeEq1==INT || typeEq1==FLOAT)&&(typeEq2==INT || typeEq2==FLOAT)) {
				String op = ctx.getChild(1).getText();
				if(typeEq1==FLOAT || typeEq2==FLOAT) {	
					switch (op) {
						case "<": semanticActions.getGenerationOfCode().menor(FLOAT);
							break;
						case "<=": semanticActions.getGenerationOfCode().menorIgual(FLOAT);
							break;
						case ">": semanticActions.getGenerationOfCode().maior(FLOAT);
							break;
						case ">=": semanticActions.getGenerationOfCode().maiorIgual(FLOAT);
							break;
						default:
							break;
					}
				} else {
					switch (op) {
					case "<": semanticActions.getGenerationOfCode().menor(INT);
						break;
					case "<=": semanticActions.getGenerationOfCode().menorIgual(INT);
						break;
					case ">": semanticActions.getGenerationOfCode().maior(INT);
						break;
					case ">=": semanticActions.getGenerationOfCode().maiorIgual(INT);
						break;
					default:
						break;
				}
				}
				return BOOL;
			} else
				System.out.println("ERRO: tipos incompativeis para realização da verificações relacionas (<=, <, >=, >).");
		}
		
		
		return ERROTYPE;
	}
	
	public static int verifyctEqualityType(JMRCompilerParser.EqualityContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em expr
			return verifyctExprType((JMRCompilerParser.ExprContext) ctx.getChild(0), semanticActions);
		} else {
			int typeEquality = verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(0), semanticActions);
			int	typeExpr = verifyctExprType((JMRCompilerParser.ExprContext) ctx.getChild(2), semanticActions);
			
			if((typeExpr==INT || typeExpr==FLOAT)&&(typeEquality==INT || typeEquality==FLOAT)) {
				if(ctx.getChild(1).getText().equals("==")) {
					if(typeExpr==typeEquality) {
						semanticActions.getGenerationOfCode().igualdade(typeExpr);
					} else {
						if(typeExpr==INT) {
							// converte typeExpr para real
							semanticActions.getGenerationOfCode().converteOper1Float(semanticActions.getAddressMemoryFree(), semanticActions.getNameFunction());
							semanticActions.getGenerationOfCode().igualdade(FLOAT);
						} else {
							// converte typeEquality para real
							semanticActions.getGenerationOfCode().coercaoIntToFloat();
							semanticActions.getGenerationOfCode().igualdade(FLOAT);
						}
					}
				} else {
					if(typeExpr==typeEquality) {
						semanticActions.getGenerationOfCode().desigualdade(typeExpr);
					} else {
						if(typeExpr==INT) {
							// converte typeExpr para real
							semanticActions.getGenerationOfCode().converteOper1Float(semanticActions.getAddressMemoryFree(), semanticActions.getNameFunction());
							semanticActions.getGenerationOfCode().desigualdade(FLOAT);
						} else {
							// converte typeEquality para real
							semanticActions.getGenerationOfCode().coercaoIntToFloat();
							semanticActions.getGenerationOfCode().desigualdade(FLOAT);
						}
					}
				}
				
				return BOOL;
			} else
					System.out.println("ERRO: tipos incompativeis para realização da comparação de igualdade (== ; !=)");
		}
		
		return ERROTYPE;
	}
	
	public static int verifyctExprType(JMRCompilerParser.ExprContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em Termo
			return verifyctTermoType((JMRCompilerParser.TermContext) ctx.getChild(0), semanticActions);
		} else { // possui operador
			int typeExpr = verifyctExprType((JMRCompilerParser.ExprContext)ctx.getChild(0), semanticActions);
			int typeTerm = verifyctTermoType((JMRCompilerParser.TermContext) ctx.getChild(2), semanticActions);
			
			if(ctx.getChild(1).getText().equals("+")) {
				if((typeExpr==INT || typeExpr==FLOAT)&&(typeTerm==INT || typeTerm==FLOAT)) {
					if(typeExpr==FLOAT || typeTerm==FLOAT) {
						if(typeExpr == FLOAT)
							semanticActions.getGenerationOfCode().converteOper1Float(semanticActions.getAddressMemoryFree(), semanticActions.getNameFunction());
						else
							semanticActions.getGenerationOfCode().coercaoIntToFloat();
						
						// faz adição
						semanticActions.getGenerationOfCode().adicaoFloat();
							
						return FLOAT;
					} else {
						semanticActions.getGenerationOfCode().adicaoInteira();

						return INT;
					}
				} else
					System.out.println("ERRO: tipos incompativeis para realização da soma.");
			} else { // Trata da operação de subtração
				if((typeExpr==INT || typeExpr==FLOAT)&&(typeTerm==INT || typeTerm==FLOAT)) {
					if(typeExpr==FLOAT || typeTerm==FLOAT) {
						if(typeExpr == FLOAT)
							semanticActions.getGenerationOfCode().converteOper1Float(semanticActions.getAddressMemoryFree(), semanticActions.getNameFunction());
						else
							semanticActions.getGenerationOfCode().coercaoIntToFloat();
						
						// faz adição
						semanticActions.getGenerationOfCode().subFloat();
						
						return FLOAT;
					} else {
						semanticActions.getGenerationOfCode().subInteira();
						
						return INT;
					}
				} else
					System.out.println("ERRO: tipos incompativeis para realização da subtração.");
			}
		}
		
		return ERROTYPE;
	}
	
	public static int verifyctTermoType(JMRCompilerParser.TermContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em Unary
			return verifyctUnaryType((JMRCompilerParser.UnaryContext) ctx.getChild(0), semanticActions);
		} else { // possui operador
			int typeTermo = verifyctTermoType((JMRCompilerParser.TermContext)ctx.getChild(0), semanticActions);
			int typeUnary = verifyctUnaryType((JMRCompilerParser.UnaryContext) ctx.getChild(2), semanticActions);
			
			
			
			if(ctx.getChild(1).getText().equals("*")) {
				if((typeTermo==INT || typeTermo==FLOAT)&&(typeUnary==INT || typeUnary==FLOAT)) {
					if(typeTermo==FLOAT || typeUnary==FLOAT) {
						if(typeTermo == FLOAT)
							semanticActions.getGenerationOfCode().converteOper1Float(semanticActions.getAddressMemoryFree(), semanticActions.getNameFunction());
						else
							semanticActions.getGenerationOfCode().coercaoIntToFloat();
						
						semanticActions.getGenerationOfCode().multFloat();
						
						return FLOAT;
					} else {
						semanticActions.getGenerationOfCode().multInteira();
						return INT;
					}
				} else
					System.out.println("ERRO: tipos incompativeis para realização da multiplicação.");
			} else { // Trata da operação de divisão
				if((typeTermo==INT || typeTermo==FLOAT)&&(typeUnary==INT || typeUnary==FLOAT)) {
					if(typeTermo==FLOAT || typeUnary==FLOAT) {
						if(typeTermo == FLOAT)
							semanticActions.getGenerationOfCode().converteOper1Float(semanticActions.getAddressMemoryFree(), semanticActions.getNameFunction());
						else
							semanticActions.getGenerationOfCode().coercaoIntToFloat();
						
						semanticActions.getGenerationOfCode().divFloat();
						
						return FLOAT;
					} else {
						semanticActions.getGenerationOfCode().divInteira();
						
						return INT;
					}
				} else
					System.out.println("ERRO: tipos incompativeis para realização da divisão.");
			}
		}
		
		return ERROTYPE;
	}
	
	public static int verifyctUnaryType(JMRCompilerParser.UnaryContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em fator
			return verifyctFatorType((JMRCompilerParser.FactorContext) ctx.getChild(0), semanticActions);
		} else {
			int type = verifyctFatorType((JMRCompilerParser.FactorContext) ctx.getChild(1), semanticActions);
			if(ctx.getChild(0).getText().equals("!")) {
				if(type == BOOL) {
					semanticActions.getGenerationOfCode().notBool();
					
					return BOOL;
				} else {
					return ERROTYPE;
				}
			} else {
				switch (type) {
					case INT: {semanticActions.getGenerationOfCode().minus(type); return INT;}
					case FLOAT: {semanticActions.getGenerationOfCode().minus(type); return FLOAT;}
					
					default:
						return ERROTYPE;
				}
			}
		}
	}
	
	public static int verifyctFatorType(JMRCompilerParser.FactorContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 3) { // trata-se de uma expressão -> '(' bool ')'
			return verifyctBoolType((JMRCompilerParser.BoolContext) ctx.getChild(1), semanticActions);
		} else if(ctx.getChild(0) instanceof JMRCompilerParser.FuncaoContext) { // trata-se da chamada de função
			ObjectSymbolTable func = semanticActions.getSymbolTable().get(((FuncaoContext) ctx.getChild(0)).ID().getText());
			if(func!=null && func.getTypeObjectSimbolTable()==Utils.FUNCTION) {
				semanticActions.setIsDeclaredFunction(true);
				semanticActions.setNameFunction(((FuncaoContext) ctx.getChild(0)).ID().getText());
				
				if(((FuncaoContext) ctx.getChild(0)).bool().size()>0 && (((FuncaoContext) ctx.getChild(0)).bool().size()==((Function)func).getParameters().size())) {
					int i = 0;
				} else
					System.out.println("ERRO(linha: "+ ctx.ID().getSymbol().getLine() +"): quantidade de parametros passados incompativel com a quantidade de paramentros declarados na funcao");
				
				return func.getType();
			} else {
				System.out.println("ERRO(linha: "+ ctx.ID().getSymbol().getLine() +"): não corresponde a uma chamada de função");
			}
		} else if(ctx.getChild(0) instanceof JMRCompilerParser.ValorContext) {
			switch (((JMRCompilerParser.ValorContext) ctx.getChild(0)).type) {
				case INT: {
					semanticActions.getGenerationOfCode().ldc(((JMRCompilerParser.ValorContext) ctx.getChild(0)).value);
					
					return INT;
				}
				case BOOL: {
					if((boolean)((JMRCompilerParser.ValorContext) ctx.getChild(0)).value) {
						semanticActions.getGenerationOfCode().ldc(1);
					} else {
						semanticActions.getGenerationOfCode().ldc(0);
					}
					
					return BOOL;
				}
				case FLOAT: {
					semanticActions.getGenerationOfCode().ldc(((JMRCompilerParser.ValorContext) ctx.getChild(0)).value);
					
					return FLOAT;
				}
				case STRING: {
					semanticActions.getGenerationOfCode().ldc(((JMRCompilerParser.ValorContext) ctx.getChild(0)).value);
					
					return STRING;
				}
	
				default: return -1;
			}
		} else { // trata-se de uma ID
			ObjectSymbolTable object = null;
			if(semanticActions.getIsMain() && !semanticActions.getIsDeclaredFunction()) { // verifica se o escopo é global (podendo ser uma constante ou variavel
				if(semanticActions.getSymbolTable().containsKey(ctx.getChild(0).getText())) {
					object = semanticActions.getSymbolTable().get(ctx.getChild(0).getText());
					
					semanticActions.getGenerationOfCode().loadVariable(object.getType(), object.getMemoryAddress());
					
					if(object.getTypeObjectSimbolTable() == CONSTANT) {
						return ((Constant)object).getType();
					} else if(object.getTypeObjectSimbolTable() == VARIABLE) {
						return ((Variable)object).getType();
					}
				} else
					System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): o id não corresponde a uma variavel ou constante declarado.");
				
			} else { // trata-se de escopo local
				Function func = ((Function) semanticActions.getSymbolTable().get(semanticActions.getNameFunction()));
				if(func.isDeclaredId(ctx.getChild(0).getText())) { // verifica se trata-se de um parametro ou variavel local
					object = func.objectVariableOrParameter(ctx.getChild(0).getText());
					if(object.getTypeObjectSimbolTable() == PARAMETER)
						return ((Parameter) object).getType();
					else
						return ((Variable) object).getType();
				} else if(semanticActions.getSymbolTable().containsKey(ctx.getChild(0).getText())) {
					object = semanticActions.getSymbolTable().get(ctx.getChild(0).getText());
					
					if(object.getTypeObjectSimbolTable() == CONSTANT) {
						return ((Constant)object).getType();
					} else if(object.getTypeObjectSimbolTable() == VARIABLE) {
						return ((Variable)object).getType();
					}
				} else
					System.out.println("ERRO (linha: " + ctx.ID().getSymbol().getLine() + "): o id não corresponde a uma variavel ou constante declarado.");
			}
		}
		
		return ERROTYPE;
	}
	
}

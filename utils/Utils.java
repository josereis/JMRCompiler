package utils;

import java.awt.Container;

import controller.SemanticActions;
import grammar.JMRCompilerParser;
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
				return BOOL;
			} else
				System.out.println("ERRO: tipos incompativeis para a realização do comando OR.");
		}
		
		return -1;
	}
	
	public static int verifyctJoinType(JMRCompilerParser.JoinContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // se a quantidade de filhos da regra é igual a 1, implica que a regra 'join' deriva na regra 'rel' (rel - operações relacionais)
			return verifyctRelType((JMRCompilerParser.RelContext) ctx.getChild(0), semanticActions);
		} else {
			if(verifyctJoinType((JMRCompilerParser.JoinContext) ctx.getChild(0), semanticActions)==BOOL && verifyctRelType((JMRCompilerParser.RelContext) ctx.getChild(2), semanticActions)==BOOL) {
				return BOOL;
			} else
				System.out.println("ERRO: tipos incompativeis para a realização do comando AND.");
		}
		
		return -1;
	}
	
	public static int verifyctRelType(JMRCompilerParser.RelContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) {
			return verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(0), semanticActions);
		} else {
			int typeEq1 = verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(0), semanticActions);
			int typeEq2 = verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(2), semanticActions);
			
			if((typeEq1==INT || typeEq1==FLOAT)&&(typeEq2==INT || typeEq2==FLOAT)) {
				String op = ctx.getChild(1).getText();
				
				switch (op) {
					case "<":
						break;
					case "<=":
						break;
					case ">":
						break;
					case ">=":
						break;

					default:
						break;
				}
				
				return BOOL;
			} else
				System.out.println("ERRO: tipos incompativeis para realização da verificações relacionas (<=, <, >=, >).");
		}
		
		
		return -1;
	}
	
	public static int verifyctEqualityType(JMRCompilerParser.EqualityContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em expr
			return verifyctExprType((JMRCompilerParser.ExprContext) ctx.getChild(0), semanticActions);
		} else {
			int typeEquality = verifyctEqualityType((JMRCompilerParser.EqualityContext) ctx.getChild(0), semanticActions);
			int	typeExpr = verifyctExprType((JMRCompilerParser.ExprContext) ctx.getChild(2), semanticActions);
			
			if((typeExpr==INT || typeExpr==FLOAT)&&(typeEquality==INT || typeEquality==FLOAT)) {
				if(ctx.getChild(1).getText().equals("==")) {
					// tratar verificação de igualdade
				} else {
					// tratar verificação de diferença
				}
				
				return BOOL;
			} else
					System.out.println("ERRO: tipos incompativeis para realização da comparação de igualdade (== ; !=)");
		}
		
		return -1;
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
						return FLOAT;
					} else {
						return INT;
					}
				} else
					System.out.println("ERRO: tipos incompativeis para realização da soma.");
			} else { // Trata da operação de subtração
				if((typeExpr==INT || typeExpr==FLOAT)&&(typeTerm==INT || typeTerm==FLOAT)) {
					if(typeExpr==FLOAT || typeTerm==FLOAT) {
						return FLOAT;
					} else {
						return INT;
					}
				} else
					System.out.println("ERRO: tipos incompativeis para realização da subtração.");
			}
		}
		
		return -1;
	}
	
	public static int verifyctTermoType(JMRCompilerParser.TermContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em Unary
			return verifyctUnaryType((JMRCompilerParser.UnaryContext) ctx.getChild(0), semanticActions);
		} else { // possui operador
			int typeTermo = verifyctTermoType((JMRCompilerParser.TermContext)ctx.getChild(0), semanticActions);
			int typeUnary = verifyctUnaryType((JMRCompilerParser.UnaryContext) ctx.getChild(2), semanticActions);
			
			if(ctx.getChild(1).getText().equals("*")) {
				if(typeTermo == typeUnary && (typeTermo == INT || typeTermo == FLOAT)) {
					return typeTermo;
				} else if(typeTermo == INT && typeUnary == FLOAT) {
					return typeUnary;
				} else if(typeTermo == FLOAT && typeUnary == INT) {
					return typeTermo;
				} else {
					return -1;
				}
			} else { // Trata da operação de divisão
				if(typeTermo == typeUnary && (typeTermo == INT || typeTermo == FLOAT)) {
					return typeTermo;
				} else if(typeTermo == INT && typeUnary == FLOAT) {
					return typeUnary;
				} else if(typeTermo == FLOAT && typeUnary == INT) {
					return typeTermo;
				} else {
					return -1;
				}
			}
		}
	}
	
	public static int verifyctUnaryType(JMRCompilerParser.UnaryContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 1) { // deriva em fator
			return verifyctFatorType((JMRCompilerParser.FactorContext) ctx.getChild(0), semanticActions);
		} else {
			int type = verifyctFatorType((JMRCompilerParser.FactorContext) ctx.getChild(0), semanticActions);
			if(ctx.getChild(0).getText().equals("!")) {
				if(type == BOOL) {
					return BOOL;
				} else {
					return -1;
				}
			} else {
				switch (type) {
				case INT: return INT;
				case FLOAT: return FLOAT;
				default:
					return -1;
				}
			}
		}
	}
	
	public static int verifyctFatorType(JMRCompilerParser.FactorContext ctx, SemanticActions semanticActions) {
		if(ctx.getChildCount() == 3) { // trata-se de uma expressão -> '(' bool ')'
			return verifyctBoolType((JMRCompilerParser.BoolContext) ctx.getChild(1), semanticActions);
		} else if(ctx.getChild(0) instanceof JMRCompilerParser.FuncaoContext) { // trata-se da chamada de função
			Function func = ((Function) semanticActions.getSymbolTable().get(semanticActions.getNameFunction()));
			
			return func.getType();
		} else if(ctx.getChild(0) instanceof JMRCompilerParser.ValorContext) {
			switch (((JMRCompilerParser.ValorContext) ctx.getChild(0)).type) {
				case INT: return INT;
				case BOOL: return BOOL;
				case FLOAT: return FLOAT;
				case STRING: return STRING;
	
				default: return -1;
			}
		} else { // trata-se de uma ID
			ObjectSymbolTable object = null;
			if(semanticActions.getIsMain()) { // verifica se o escopo é global (podendo ser uma constante ou variavel
				if(semanticActions.getSymbolTable().containsKey(ctx.getChild(0).getText())) {
					object = semanticActions.getSymbolTable().get(ctx.getChild(0).getText());
					
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
		
		return -1;
	}
	
}

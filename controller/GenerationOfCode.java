package controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

import models.Constant;
import models.ObjectSymbolTable;
import utils.Utils;

/**
 * 
 * @author José Reis R Santiago
 *
 */
public class GenerationOfCode {
	private PrintWriter filePrint;
	private String programName, sourceFileDirectory;
	private Map<String, ObjectSymbolTable> symbolTable;
	
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	
	private int numberLocalsVariables() {
		int qnt = 0;
		
		for(ObjectSymbolTable obj: symbolTable.values()) {
			if(obj.getTypeObjectSimbolTable()==Utils.CONSTANT || obj.getTypeObjectSimbolTable()==Utils.VARIABLE) {
				qnt++;
			}
		}
		
		return qnt;
	}
	
	private String typeObject(int type) {
		switch (type) {
			case Utils.INT: return "I";
			case Utils.BOOL: return "I";
			case Utils.FLOAT: return "F";
			case Utils.STRING: return "Ljava/lang/String;";
			
			default: return "";
		}
	}
	
	public void closeFile() {
		this.filePrint.close();
	}
	
	public void initHeader() {
		filePrint.println(".class public " + programName);
		filePrint.println(".super java/lang/Object\n");
	}
	
	public void initHeaderMain() {
		filePrint.println(".method public static main([Ljava/lang/String;)V");
		filePrint.println(".limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.");
		filePrint.println(".limit locals " + (numberLocalsVariables() + 1) + "\n");
		
	}
	
	public void endMain() {
		filePrint.println("\ngetstatic java/lang/System/in Ljava/io/InputStream;\t; pausa para finalizar com enter.\n"
				+ "invokevirtual java/io/InputStream/read()I\n"
				+ "invokevirtual java/io/InputStream/read()I\n"
				+ "\nreturn\n\n"
				+ ".end method\n");
	}
	
	/**
	 * Método responsavel por gerar o arquivo onde será salvo o codigo de três endereços
	 * referente a programa passado em linguagem de alto nivel.
	 */
	public void generateFileJasmin() {
		try {
			filePrint = new PrintWriter(sourceFileDirectory + programName + ".j"); // .j -> extenção para biblioteca jasmin
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * FUNÇÃO RESPONSAVEL POR CARREGAR CONSTANTES
	 */
	private void declaresConstant(Object value) {
		filePrint.println("ldc " + value + "\t; carregando constante");
	}
	
	// trata o valor literal de uma varialvel ou constante booleana, ou seja, verifica constante "1" para true e "0" pra false
	public void loadConstantBool(boolean value) {
		if(value)
			filePrint.println("ldc " + 1);
		else
			filePrint.println("ldc " + 0);
	}
	
	public void loadConstant() {
		for(ObjectSymbolTable object: symbolTable.values()) {
			if(object instanceof Constant) {
				if(object.getType()==Utils.BOOL) {
					loadConstantBool((boolean) ((Constant) object).getValueObject());
				} else
					declareConstant(((Constant) object).getValueObject());
			}
			
			variableSalve(object.getType(), object.getMemoryAddress()); // salva a constante como uma variavel local do main
		}
	}
	
	/**
	 * FUNÇÕES PARA PESSITIR/SALVAR AS VARIAVEIS
	 */
	
	public void storeInteger(int address) {
		filePrint.println("istore " + address);
	}
	
	public void storeFloat(int address) {
		filePrint.println("fstore " + address);
	}
	
	public void storeString(int address) {
		filePrint.println("astore " + address);
	}
	
	public void storeBoolean(int address) {
		filePrint.println("istore " + address);
	}
	
	private void coercaoIntToFloat() {
			filePrint.println("i2f");
	}
	
	public void variableSalveCoercaoIntToFloat(int address) {
		coercaoIntToFloat();
		storeFloat(address);
	}
	
	public void variableSalve(int type, int address) {
		switch (type) {
			case Utils.INT:
				storeInteger(address);
				break;
			case Utils.FLOAT:
				storeFloat(address);
				break;
			case Utils.STRING:
				storeString(address);
				break;
			case Utils.BOOL:
				storeBoolean(address);
				break;
	
			default:
				break;
		}
	}
	
	public void loadInteger(int address) {
		filePrint.println("iload " + address);
	}
	
	public void loadFloat(int address) {
		filePrint.println("fload " + address);
	}
	
	public void loadString(int address) {
		filePrint.println("aload " + address);
	}
	
	public void loadBoolean(int address) {
		filePrint.println("iload " + address);
	}
	
	/**
	 * FUNÇÕES DE IMPRESSÃO DE VALORES
	 */
	
	public void initGenerationPrint() {
		filePrint.println("\ngetstatic java/lang/System/out Ljava/io/PrintStream;");
	}
	
	private void printInteger() {
		filePrint.println("invokevirtual java/io/PrintStream/print(I)V\n");
	}
	
	private void printFloat() {
		filePrint.println("invokevirtual java/io/PrintStream/print(F)V\n");
	}
	
	private void printString() {
		filePrint.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n");
	}
	
	public void printNewLine() {
		initGenerationPrint();
		filePrint.println("ldc \"\"");
		printString();
		
	}
	
	public void execPrint(int type) {
		switch (type) { // falta adicionar o print de valores booleanos
			case Utils.INT: printInteger();
				break;
			case Utils.FLOAT: printFloat();
				break;
			case Utils.STRING: printString();
				break;
			default:
				break;
		}
	}
	
	/**
	 * 
	 * @param value -> valor a ser carregado como constante, podendo ser um valor inteiro, real ou string
	 */
	public void declareConstant(Object value) {
		filePrint.println("ldc " + value + "\t; carregar constante");
	}
	
	public void generationConstructFinalRead() {
		filePrint.println("\n.method public <init>()V\t; construtor para as leituras\n"
				+ ".limit stack 1\n"
                + ".limit locals 1\n"
                + ".var 0 is this LP1; from Label0 to Label1\n"
                + "\n"
                + "Label0:\n"
                + "	aload_0\n"
                + "	invokespecial java/lang/Object/<init>()V\n"
                + "Label1:\n"
                + "	return\n"
                + "\n"
                + ".end method");
	}
	
	
	/**
	 * 
	 * @param symbolTable
	 * @param sourceFileDirectory
	 */
	public GenerationOfCode(Map<String, ObjectSymbolTable> symbolTable, String sourceFileDirectory) {
		this.symbolTable = symbolTable;
		this.sourceFileDirectory = sourceFileDirectory;
	}
}

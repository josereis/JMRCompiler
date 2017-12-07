package controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

import grammar.JMRCompilerBaseListener;
import grammar.JMRCompilerParser;
import grammar.JMRCompilerParser.BoolContext;
import grammar.JMRCompilerParser.JoinContext;
import models.Constant;
import models.Function;
import models.ObjectSymbolTable;
import models.Parameter;
import models.PilhaLabels;
import utils.Utils;

/**
 * 
 * @author José Reis R Santiago
 *
 */
public class GenerationOfCode {
	private int labels = 0;
	private PrintWriter filePrint;
	private String programName, sourceFileDirectory;
	private Map<String, ObjectSymbolTable> symbolTable;
	private boolean codeReadInt = false, codeReadFloat = false, codeReadString = false;
	private PilhaLabels labelsFor = new PilhaLabels(), labelsIf = new PilhaLabels(), labelsIfE = new PilhaLabels();
	
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
			case Utils.VOID: return "V";
			case Utils.FLOAT: return "F";
			case Utils.STRING: return "Ljava/lang/String;";
			
			default: return "";
		}
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
	
	public void closeFile() {
		this.filePrint.close();
	}
	
	public void initHeader() {
		filePrint.println(".class public " + programName);
		filePrint.println(".super java/lang/Object\n");
	}
	
	public void initHeaderMain() {
		filePrint.println(".method public static main([Ljava/lang/String;)V");
		filePrint.println("	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.");
		filePrint.println("	.limit locals " + (numberLocalsVariables()) + "\n");
		
	}
	
	public void endMain() {
		filePrint.println("\n	return\n"
						+ ".end method\n"
						);
		
		if(codeReadInt)
			generatedFunctionReadInt();
		
		if(codeReadFloat)
			generatedFunctionReadFloat();
		
		if(codeReadString)
			generatedFunctionReadString();
	}
	
	/**
	 * FUNÇÃO RESPONSAVEL POR CARREGAR CONSTANTES
	 */
	private void declaresConstant(Object value) {
		filePrint.println("	ldc " + value + "\t; carregando constante");
	}
	
	// trata o valor literal de uma varialvel ou constante booleana, ou seja, verifica constante "1" para true e "0" pra false
	public void loadConstantBool(boolean value) {
		if(value)
			filePrint.println("	ldc " + 1);
		else
			filePrint.println("	ldc " + 0);
	}
	
	public void loadConstant() {
		for(ObjectSymbolTable object: symbolTable.values()) {
			if(object instanceof Constant) {
				if(object.getType()==Utils.BOOL) {
					loadConstantBool((boolean) ((Constant) object).getValueObject());
				} else
					declareConstant(((Constant) object).getValueObject());
			}
			
//			variableSalve(object.getType(), object.getMemoryAddress()); // salva a constante como uma variavel local do main
		}
	}
	
	/**
	 * FUNÇÕES PARA PESSITIR/SALVAR AS VARIAVEIS
	 */
	
	public void storeInteger(int address) {
		filePrint.println("	istore " + address);
	}
	
	public void storeFloat(int address) {
		filePrint.println("	fstore " + address);
	}
	
	public void storeString(int address) {
		filePrint.println("	astore " + address);
	}
	
	public void storeBoolean(int address) {
		filePrint.println("	istore " + address);
	}
	
	public void coercaoIntToFloat() {
			filePrint.println("	i2f");
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
		filePrint.println(" iload " + address);
	}
	
	public void loadFloat(int address) {
		filePrint.println(" fload " + address);
	}
	
	public void loadString(int address) {
		filePrint.println(" aload " + address);
	}
	
	public void loadBoolean(int address) {
		filePrint.println(" iload " + address);
	}
	
	public void loadVariable(int type, int address) {
		switch (type) {
			case Utils.INT: loadInteger(address);
				break;
			case Utils.FLOAT: loadFloat(address);
				break;
			case Utils.STRING: loadString(address);
				break;
			case Utils.BOOL: loadBoolean(address);
				break;
			default:
				break;
		}
	}
	
	/**
	 * FUNÇÕES DE IMPRESSÃO DE VALORES
	 */
	
	public void initGenerationPrint() {
		filePrint.println("\n	getstatic java/lang/System/out Ljava/io/PrintStream;");
	}
	
	private void printInteger() {
		filePrint.println("	invokevirtual java/io/PrintStream/print(I)V\n");
	}
	
	private void printFloat() {
		filePrint.println("	invokevirtual java/io/PrintStream/print(F)V\n");
	}
	
	private void printString() {
		filePrint.println("	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n");
	}
	
	public void printNewLine() {
		initGenerationPrint();
		filePrint.println("	ldc \"\"");
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
		filePrint.println("	ldc " + value + "\t; carregar constante");
	}
	
	private void generatedFunctionReadInt() {
		filePrint.println(".method public static read()I\n"
						+ "	.limit stack 3 ; tamanho maximo da pilha\n"
						+ "	.limit locals 1 ; numero maximo de variaveis locais ao metodo\n\n"
						+ "	; inicio da função de entrada\n"
						+ "	new java/util/Scanner\n"
						+ "	dup ; duplica topo da pinlha\n"
						+ "	getstatic java/lang/System/in Ljava/io/InputStream;\n"
						+ "	invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n"
						+ "	astore 0\n"
						+ "	aload 0\n"
						+ "	invokevirtual java/util/Scanner/nextInt()I\n\n"
						+ "	ireturn\n"
						+ ".end method\n"
				);
	}
	
	private void generatedFunctionReadFloat() {
		filePrint.println("\n.method public static readReal()F\n"
						+ "	.limit stack 3\n"
						+ "	.limit locas 1\n\n"
						+ "	new java/util/Scanner\n"
						+ "	dup\n"
						+ "	getstatic java/lang/System/in Ljava/io/InputStream;\n"
						+ "	invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n"
						+ "	astore 0\n"
						+ "	aload 0\n"
						+ "	invokevirtual java/util/Scanner/nextFloat()F\n"
						+ "	freturn\n\n"
						+ ".end method"
				);
	}

	private void generatedFunctionReadString() {
		filePrint.println(".method public static readString()Ljava/lang/String;\n"
						+ "	.limit stack 5\n"
						+ "	.limit locals 1\n\n"
						+ "	new java/io/BufferedReader\n"
						+ "	dup\n"
						+ "	getstatic java/lang/System/in Ljava/io/InputStream;\n"
						+ "	invokespecial java/io/InputStreamReader/<init>(Ljava/io/InputStream;)V\n"
                        + "	invokespecial java/io/BufferedReader/<init>(Ljava/io/Reader;)V\n"
                        + "	astore 0\n"
                        + "	aload 0\n"
                        + "	invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;\n\n"
                        + "	areturn\n"
                        + ".throws java/lang/Exception\n"
                        + ".end method"
						);
	}
	
	private void readInt(int address) {
		filePrint.println("	invokestatic " + programName + ".readInt()I");
		filePrint.println("	istore " + address);
		codeReadInt = true;
	}
	
	private void readFloat(int address) {
		filePrint.println("	invokestatic " + programName + ".readFloat()F");
		filePrint.println("	fstore " + address);
		codeReadFloat = true;
	}
	
	private void readString(int address) {
		filePrint.println("	invokestatic " + programName + ".readString()Ljava/lang/String;");
		filePrint.println("	astore " + address);
		codeReadString = true;
	}
	
	public void generationRead(int type, int address) {
		switch (type) {
			case Utils.INT:
				readInt(address);
				break;
			case Utils.FLOAT:
				readFloat(address);
				break;
			case Utils.STRING:
				readString(address);
				break;
			default: System.out.println("ERRO: tipo boolen nao pode ser lido.");
				break;
		}
	}
	
	public void generationHeaderFunction(String nameFunction) {
		Function function = (Function) symbolTable.get(nameFunction);
		
		if(function != null) {
			filePrint.println("\n.method public static " + nameFunction + "(");
			for(Parameter p: function.getParameters().values()) {
				filePrint.print(typeObject(p.getType()));
			}
			filePrint.println(")" + typeObject(function.getType()));
			filePrint.println("	.limit stack 10\n	.limit locals " + (function.getLocalVariables().size()) + "\n");
		}
	}
	
	public void generationFooterFunction(int typeReturn) {
		filePrint.println("\n");
		switch (typeReturn) {
			case Utils.INT: filePrint.println("	ireturn");
				break;
			case Utils.FLOAT: filePrint.println("	freturn");
				break;
			case Utils.BOOL: filePrint.println("	ireturn");
				break;
			case Utils.STRING: filePrint.println("	areturn");
				break;
			default: filePrint.println("	return");
				break;
		}
		filePrint.println(".end method\n");
	}
	
	/**
	 * comparadores relacionais
	 */
	public void if_icmpeq() { // comparação de igualdade de inteiros
		filePrint.print("	if_icmpeq ");
	}
	
	public void if_icmpne() { // comparação de valores diferentes inteiros
		filePrint.print("	if_icmpne ");
	}
	
	public void if_icmpgt() { // >
		filePrint.print("	if_icmpgt ");
	}
	
	public void if_icmpge() { // >=
		filePrint.print("	if_icmpge ");
	}
	
	public void if_icmplt() { // <
		filePrint.print("	if_icmplt ");
	}
	
	public void if_icmple() { // >=
		filePrint.print("	if_icmple ");
	}
	
	public void if_fcmpeq() { // comparação de igualdade de inteiros
		filePrint.print("	if_fcmpeq ");
	}
	
	public void if_fcmpne() { // comparação de valores diferentes inteiros
		filePrint.print("	if_fcmpne ");
	}
	
	public void if_fcmpgt() { // >
		filePrint.print("	if_fcmpgt ");
	}
	
	public void if_fcmpge() { // >=
		filePrint.print("	if_fcmpge ");
	}
	
	public void if_fcmplt() { // <
		filePrint.print("	if_fcmplt ");
	}
	
	public void if_fcmple() { // >=
		filePrint.print("	if_fcmple ");
	}
	
	/**
	 * Expressoes Relacionais
	 **/
	public void menor(int type) {
		if(type == Utils.FLOAT)
			if_fcmplt();
		else
			if_icmplt();
			
		filePrint.println("L" + labels + " ; menor que real");
		filePrint.println(
					"	ldc 0\n" +
					"	goto L" + (labels+1) + "\n" +
					"L" + labels + ":\n" +
					"	ldc 1\n" +
					"L" + (labels+1) + ":"
					);
		labels += 2; // atualiza para o proximo label livre
	}
	
	public void menorIgual(int type) {
		if(type == Utils.FLOAT)
			if_fcmple();
		else
			if_icmple();
			
		filePrint.println("L" + labels + " ; menor ou igual que real");
		filePrint.println(
				"	ldc 0\n" +
				"	goto L" + (labels+1) + "\n" +
				"L" + labels + ":\n" +
				"	ldc 1\n" +
				"L" + (labels+1) + ":"
				);
		labels += 2; // atualiza para o proximo label livre
	}
	
	public void maior(int type) {
		if(type == Utils.FLOAT)
			if_fcmpgt();
		else
			if_icmpgt();
			
		filePrint.println("L" + labels + " ; maior que real");
		filePrint.println(
				"	ldc 0\n" +
				"	goto L" + (labels+1) + "\n" +
				"L" + labels + ":\n" +
				"	ldc 1\n" +
				"L" + (labels+1) + ":"
				);
		labels += 2; // atualiza para o proximo label livre
	}
	
	public void maiorIgual(int type) {
		if(type == Utils.FLOAT)
			if_fcmpge();
		else
			if_icmpge();
			
		filePrint.println("L" + labels + " ; maio ou igual que real");
		filePrint.println(
				"	ldc 0\n" +
				"	goto L" + (labels+1) + "\n" +
				"L" + labels + ":\n" +
				"	ldc 1\n" +
				"L" + (labels+1) + ":"
				);
		labels += 2; // atualiza para o proximo label livre
	}
	
	public void igualdade(int type) {
		if(type == Utils.FLOAT)
			if_fcmpeq();
		else
			if_icmpeq();
		
		filePrint.println("L" + labels + " ; igualdade");
		filePrint.println(
				"	ldc 0\n" +
				"	goto L" + (labels+1) + "\n" +
				"L" + labels + ":\n" +
				"	ldc 1\n" +
				"L" + (labels+1) + ":"
				);
		labels += 2; // atualiza para o proximo label livre
	}
	
	public void desigualdade(int type) {
		if(type == Utils.FLOAT)
			if_fcmpne();
		else
			if_icmpne();
		
		filePrint.println("L" + labels + " ; igualdade");
		filePrint.println(
				"	ldc 0\n" +
				"	goto L" + (labels+1) + "\n" +
				"L" + labels + ":\n" +
				"	ldc 1\n" +
				"L" + (labels+1) + ":"
				);
		labels += 2; // atualiza para o proximo label livre
	}
	
	public void converteOper1Float(int address, String nomeFunction) {
		if(nomeFunction.equals("")) { // main
			filePrint.println("	fstore " + address + " ; salva o valor do segundo operando");
			filePrint.println("	i2f");
			filePrint.print("	fload " + address + " ; carrega o valor do segundo operando para a pilha");
		} else { // função
			int addressFunction = ((Function) symbolTable.get(nomeFunction)).getLocalVariables().size() + ((Function) symbolTable.get(nomeFunction)).getParameters().size() + 1;
			
			filePrint.println("	fstore " + addressFunction + " ; salva o valor do segundo operando");
			filePrint.println("	i2f");
			filePrint.print("	fload " + addressFunction + " ; carrega o valor do segundo operando para a pilha");
		}
	}
	
	/**
	 * comparadores logicos
	 */
	public void and() {
		filePrint.println("	iand");
	}
	
	public void or() {
		filePrint.println("	ior");
	}
	
	public void notBool() {
		filePrint.println("	ifeq L" + labels + "; compara se é igual a zero\n"
				+ "	ldc -1\n"
				+ "	iadd\n"
				+ "	goto L" +(labels+1) +"\n"
				+ "L" + labels + ":\n"
				+ "	ldc 1\n"
				+ "	iadd\n"
				+ "L" + (labels+1) + ":\n");
	}
	
	public void minus(int type) {
		if(type==Utils.FLOAT) {
			filePrint.println("	ldc -1.0");
			multFloat();
		} else {
			filePrint.println("	ldc -1");
			multInteira();
		}
	}
	
	/**
	 * operadores arritmeticos
	 */
	public void adicaoFloat() {
		filePrint.println("	fadd");
	}
	
	public void adicaoInteira() {
		filePrint.println("	iadd");
	}
	
	public void subFloat() {
		filePrint.println("	fsub");
	}
	
	public void subInteira() {
		filePrint.println("	isub");
	}
	
	public void multFloat() {
		filePrint.println("	fmul");
	}
	
	public void multInteira() {
		filePrint.println("	imul");
	}
	
	public void divFloat() {
		filePrint.println("	fdiv");
	}
	
	public void divInteira() {
		filePrint.println("	idiv");
	}
	
	/**
	 * operações unarias
	 */
	
	
	/**
	 * Operação condicional IF
	 */
	public void generationInitIfCode() {
		filePrint.println("	ifeq LIf" + labelsIf.push()+" ; inicializa o if");
	}
	
	public void generationFinalIfCode() {
		filePrint.println("LIf" + labelsIf.pop()+": ; finaliza o if");
	}
	
	public void generationInitIfElseCode() {
		filePrint.println("	ifeq LIfE" + labelsIfE.push()+" ; inicializa o if_else");
	}
	
	public void generationSaltoInternoIfElse() {
		int flag = labelsIfE.pop();
		filePrint.println("	goto LIfE" + labelsIfE.push() +" ; finaliza if do else");
		filePrint.println("LIfE" + flag +": ; inicializa o else");
	}
	
	public void generationFinalIfElseCode() {
		filePrint.println("	LIfE" + labelsIfE.pop()+": ; finaliza o if_else(else)");
	}
	
	/**
	 * Comandos de repetição for
	 */
	public void generationInitForCode() {
		filePrint.println("LFor" + labelsFor.push() + ": ; incia o comando for");
	}
	
	public void generationTestForCode() {
		filePrint.println("	ifeq LFor" + labelsFor.push() + " ; testa a condição do for com valor 0-false, 1-true");
	}
	
	public void generationFinalFor() { // salta para o inicio do comando for
		int flag = labelsFor.pop();
		filePrint.println("	goto LFor" + (labelsFor.pop()) + " ; salta pro inicio do for, para verificar a condição booleana");
		filePrint.println("LFor" + flag + ": ; fim do loop");
	}
	
	public void generationBreak() {
		filePrint.println("	goto LFor" + labelsFor.getTopo() + " ; salta para fora do for (comando break)");		
	}
	
	/**
	 * Carregndo valores na pilha
	 */
	public void ldc(Object value) {
		filePrint.println("	ldc " + value + " ; carrega o valor na pilha"); 
	}
	
	public void incremento(int type, int address) {
		if(type==Utils.INT)
			filePrint.println("	iinc " + address + " 1");
		else
			filePrint.println("	finc " + address + " 1.0");
	}
	
	public void decremento(int type, int address) {
		if(type==Utils.INT)
			filePrint.println("	iinc " + address + " -1");
		else
			filePrint.println("	finc " + address + " -1.0");
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

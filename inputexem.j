.class public exem
.super java/lang/Object


.method public static fat(I)I
	.limit stack 10
	.limit locals 11

 iload 0
	ldc 1 ; carrega o valor na pilha
	if_icmple L0 ; menor ou igual que real
	ldc 0
	goto L1
L0:
	ldc 1
L1:
	ifeq LIfE0 ; inicializa o if_else
	ldc 1 ; carrega o valor na pilha
	goto LIfE1 ; finaliza if do else
LIfE0: ; inicializa o else
 iload 0
	imul
 iload 0
	ldc 1 ; carrega o valor na pilha
	isub

	invokestatic exem.fat(I)I
 iload 0
	imul
	LIfE1: ; finaliza o if_else(else)


	ireturn
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 3

	ldc 10	; carregar constante
	istore 2

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "DIGITE O NUMERO INTEIRO X: " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	invokestatic exem.read()I
	istore 0
	istore 1
 iload 0

	invokestatic exem.fat(I)I

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "fat = " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 1
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n" ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	return
.end method

.method public static read()I
	.limit stack 3 ; tamanho maximo da pilha
	.limit locals 1 ; numero maximo de variaveis locais ao metodo

	; inicio da função de entrada
	new java/util/Scanner
	dup ; 
	getstatic java/lang/System/in Ljava/io/InputStream;
	invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
	astore 0
	aload 0
	invokevirtual java/util/Scanner/nextInt()I

	ireturn
.end method

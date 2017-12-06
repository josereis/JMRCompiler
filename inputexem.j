.class public exem
.super java/lang/Object


.method public static teste(IFLjava/lang/String;)V
	.limit stack 10
	.limit locals 13

	ldc 1 ; carrega o valor na pilha
	istore 3
LFor0: ; incia o comando for
 iload 3
 iload 0
	if_icmplt L0 ; menor que real
	ldc 0
	goto L1
L0:
	ldc 1
L1:
	ifeq LFor1 ; testa a condição do for com valor 0-false, 1-true

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "O " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 aload 2
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " eh um viadinho " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 3
 fload 1
	fstore 5 ; salva o valor do segundo operando
	i2f
	fload 5 ; carrega o valor do segundo operando para a pilha
	fmul
	invokevirtual java/io/PrintStream/print(F)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " vezes\n" ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	iinc 3 1
	goto LFor0 ; salta pro inicio do for, para verificar a condição booleana
LFor1: ; fim do loop


	return
.end method


.method public static fat()I
	.limit stack 10
	.limit locals 10

	ldc 10 ; carrega o valor na pilha
	ldc 10 ; carrega o valor na pilha


	ireturn
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 4

	ldc 10	; carregar constante
	istore 3

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "DIGITE O NUMERO INTEIRO X: " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	invokestatic exem.read()I
	istore 0
	istore 1

	invokestatic exem.fat()I

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n\nretorno = " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 1
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n\n" ; carrega o valor na pilha
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

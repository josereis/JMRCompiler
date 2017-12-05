.class public exem
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 2

	ldc 2 ; carrega o valor na pilha
	istore 0
 iload 0
	ldc 10 ; carrega o valor na pilha
	imul
	istore 1
 iload 0
 iload 1
	if_icmpgt L0 ; maior que real
	ldc 0
	goto L1
L0:
	ldc 1
L1:
	ifeq LIfE0 ; inicializa o if_else

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Funciona " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 0
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " > " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 1
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

goto LIfE1 ; finaliza if do else
LIfE0: ; inicializa o else

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n\nFuncionou seu porra!!\n\n" ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 0
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 1
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc 2 ; carrega o valor na pilha
	ldc 3 ; carrega o valor na pilha
	iadd
	ldc 9 ; carrega o valor na pilha
	isub
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n\n" ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	LIfE1: ; finaliza o if_else(else)

	return
.end method


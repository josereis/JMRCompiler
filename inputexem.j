.class public exem
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 4

	istore 0
	istore 1
	istore 2
	istore 3
ldc 20 ; carrega o valor na pilha
ldc 30 ; carrega o valor na pilha
iadd
	istore 0

	getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Oi... Teste" ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 0
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	return
.end method


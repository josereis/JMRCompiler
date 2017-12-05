.class public exem
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 2

	ldc 1 ; carrega o valor na pilha
	istore 0
LFor0: ; incia o comando for
 iload 0
	ldc 10 ; carrega o valor na pilha
	if_icmplt L0 ; menor que real
	ldc 0
	goto L1
L0:
	ldc 1
L1:
	ifeq LFor1 ; testa a condição do for com valor 0-false, 1-true
	iinc 0 1
	ldc 1 ; carrega o valor na pilha
	istore 1
LFor2: ; incia o comando for
 iload 1
	ldc 10 ; carrega o valor na pilha
	if_icmplt L2 ; menor que real
	ldc 0
	goto L3
L2:
	ldc 1
L3:
	ifeq LFor3 ; testa a condição do for com valor 0-false, 1-true

	getstatic java/lang/System/out Ljava/io/PrintStream;
 iload 1
	invokevirtual java/io/PrintStream/print(I)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " " ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	iinc 1 1
	goto LFor2 ; salta pro inicio do for, para verificar a condição booleana
LFor3: ; fim do loop

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n" ; carrega o valor na pilha
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

 iload 0
	ldc 2 ; carrega o valor na pilha
	if_icmpeq L4 ; igualdade
	ldc 0
	goto L5
L4:
	ldc 1
L5:
	ifeq LIf0 ; inicializa o if
	ldc 9 ; carrega o valor na pilha
	istore 0
LIf0: ; finaliza o if
	iinc 0 1
	goto LFor0 ; salta pro inicio do for, para verificar a condição booleana
LFor1: ; fim do loop

	return
.end method


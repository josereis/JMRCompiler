.class public exem
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 5

	istore 0
	istore 1
	istore 2
	istore 3
	ldc 5	; carregar constante
	istore 4
	invokestatic exem.readInt()I
	istore 0
	invokestatic exem.readInt()I
	istore 1
	invokestatic exem.readInt()I
	istore 2

	return
.end method


.method public static readReal()F
	.limit stack 3
	.limit locas 1

	new java/util/Scanner
	dup	getstatic java/lang/System/in Ljava/io/InputStream;
	invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
	astore 0
	aload 0
	invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;
	areturn

.throws java/lang/Exception
.end method

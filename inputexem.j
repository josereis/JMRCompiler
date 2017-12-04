.class public exem
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
	.limit locals 6

	astore 4
	istore 0
	istore 1
	istore 2
	istore 3
	ldc 5	; carregar constante
	istore 5
	invokestatic exem.readInt()I
	istore 0
	invokestatic exem.readString()Ljava/lang/String;
	astore 4

	return
.end method

.method public static read()I
	.limit stack 3 ; tamanho maximo da pilha
	.limit locals 1 ; numero maximo de variaveis locais ao metodo

	; inicio da função de entrada
	new java/util/Scanner
	dup ; duplica topo da pinlha
	getstatic java/lang/System/in Ljava/io/InputStream;
	invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
	astore 0
	aload 0
	invokevirtual java/util/Scanner/nextInt()I

	ireturn
.end method

.method public static readString()Ljava/lang/String;
	.limit stack 5
	.limit locals 1

	new java/io/BufferedReader
	dup
	getstatic java/lang/System/in Ljava/io/InputStream;
	invokespecial java/io/InputStreamReader/<init>(Ljava/io/InputStream;)V
	invokespecial java/io/BufferedReader/<init>(Ljava/io/Reader;)V
	astore 0
	aload 0
	invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;
	
	areturn
.throws java/lang/Exception
.end method

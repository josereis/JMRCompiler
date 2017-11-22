.class public exem
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 100 ; aloca o tamanho para a pilha, ou seja, declara a pilha a ser usada.
.limit locals 9

istore 0
istore 1
istore 2
istore 3
ldc 5	; carregar constante
istore 4
ldc 10.0	; carregar constante
fstore 5
ldc "algo"	; carregar constante
astore 6
ldc 0
istore 7

getstatic java/lang/System/out Ljava/io/PrintStream;
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


getstatic java/lang/System/out Ljava/io/PrintStream;
invokevirtual java/io/PrintStream/print(I)V


getstatic java/lang/System/out Ljava/io/PrintStream;
invokevirtual java/io/PrintStream/print(F)V


getstatic java/lang/System/out Ljava/io/PrintStream;
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


getstatic java/lang/System/in Ljava/io/InputStream;	; pausa para finalizar com enter.
invokevirtual java/io/InputStream/read()I
invokevirtual java/io/InputStream/read()I

return

.end method


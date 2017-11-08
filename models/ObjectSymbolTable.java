package models;

public class ObjectSymbolTable {
	// DECLARAÇÃO DE CONSTANTES A SEREM USADAS PARA INDENTIFICAÇÃO DO OBJETO A SER SALVO NA TABELA DE SIMBOLOS
	static final int VARIABLE = 1, CONSTANT = 2, FUNCTION = 3;
	static final int VOID = 0, INT = 1, FLOAT = 2, STRING = 3, BOOL = 4;
	
	private int type;
	private int memoryAddress;
	private int typeObjectSimbolTable;
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getMemoryAddress() {
		return memoryAddress;
	}
	
	public void setMemoryAddress(int memoryAdddress) {
		this.memoryAddress = memoryAdddress;
	}
	
	public int getTypeObjectSimbolTable() {
		return typeObjectSimbolTable;
	}
	
	public void setTypeObjectSimbolTable(int typeObjectSimbolTable) {
		this.typeObjectSimbolTable = typeObjectSimbolTable;
	}
	
	public ObjectSymbolTable(int memoryAddress, int type, int typeObjectSimbolTable) {
		this.typeObjectSimbolTable = typeObjectSimbolTable;
		this.type = type;
		this.memoryAddress = memoryAddress;
	}
	
}

package models;

/**
 * @author José Reis R Santiago 
 */
public class ObjectSymbolTable {
	// DECLARAÇÃO DE CONSTANTES A SEREM USADAS PARA INDENTIFICAÇÃO DO OBJETO A SER SALVO NA TABELA DE SIMBOLOS
	public static final int GLOBAL = 1, LOCAL = 2;
	public static final int VARIABLE = 1, CONSTANT = 2, FUNCTION = 3, PARAMETER = 4;
	public static final int VOID = 0, INT = 1, FLOAT = 2, STRING = 3, BOOL = 4;
	
	private int type;
	private int scope;
	private int memoryAddress;
	private int typeObjectSimbolTable; 
	private Object valueObject; // valor atribuido ao objeto (varivel ou constante ou parametro)
	private String visibleScopeFunctionName; //nome função onde o objeto(que não é uma função) é visivel caso ela seja local
	
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

	public Object getValueObject() {
		return valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

	public String getVisibleScopeFunctionName() {
		return visibleScopeFunctionName;
	}

	public void setVisibleScopeFunctionName(String visibleScopeFunctionName) {
		this.visibleScopeFunctionName = visibleScopeFunctionName;
	}
	
	public ObjectSymbolTable(int typeObjectSimbolTable, int type, int scope, String visibleScopeFunctionName, int memoryAddress, Object value) {
		this.typeObjectSimbolTable = typeObjectSimbolTable;
		this.type = type;
		this.scope = scope;
		this.visibleScopeFunctionName = visibleScopeFunctionName;
		this.memoryAddress = memoryAddress;
		this.valueObject = valueObject;
	}
	
}

package models;

/**
 * @author José Reis R Santiago 
 */
public abstract class ObjectSymbolTable {
	public static final int VOID = 0, INT = 1, FLOAT = 2, STRING = 3, BOOL = 4;
	public static final int VARIABLE = 1, CONSTANT = 2, FUNCTION = 3, PARAMETER = 4;
	
	private int memoryAddress;
	private int typeObjectSimbolTable;
	
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
	
	public ObjectSymbolTable(int typeObjectSimbolTable, int memoryAddress) {
		this.memoryAddress = memoryAddress;
		this.typeObjectSimbolTable = typeObjectSimbolTable;
	}
	
}

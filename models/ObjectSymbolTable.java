package models;

/**
 * @author José Reis R Santiago 
 */
public abstract class ObjectSymbolTable {
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

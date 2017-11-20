package models;

/**
 * @author José Reis R Santiago 
 */
public abstract class ObjectSymbolTable {
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
	
	public ObjectSymbolTable(int typeObjectSimbolTable, int memoryAddress) {
		this.memoryAddress = memoryAddress;
		this.typeObjectSimbolTable = typeObjectSimbolTable;
	}
	
}

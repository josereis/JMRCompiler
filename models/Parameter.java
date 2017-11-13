package models;

public class Parameter extends ObjectSymbolTable {
	private int type;
	private Object valueObject;
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public Object getValueObject() {
		return valueObject;
	}
	
	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	public Parameter(int typeObjectSimbolTable, int memoryAddress) {
		super(typeObjectSimbolTable, memoryAddress);
	}
}

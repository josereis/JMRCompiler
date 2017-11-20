package models;

public class Parameter extends ObjectSymbolTable {
	private Object valueObject;
	
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

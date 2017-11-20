package models;

public class Constant extends ObjectSymbolTable {
	private Object valueObject;

	public Object getValueObject() {
		return valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}

	public Constant(int typeObjectSimbolTable, int memoryAddress) {
		super(typeObjectSimbolTable, memoryAddress);
	}
	
}

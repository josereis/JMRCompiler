package models;

/**
 * 
 * @author José Reis R Santiago
 *
 */
public class Variable extends ObjectSymbolTable {
	// SCOPE LOCAL OR GLOBAL
	public static final int GLOBAL = 1, LOCAL = 2;

	private int scope;
	private Object valueObject;
	private String functionName; // PARA O CASO DE SE TRATAR DE UMA VARIAVEL LOCAL

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

	public Object getValueObject() {
		return valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Variable(int typeObjectSimbolTable, int memoryAddress) {
		super(typeObjectSimbolTable, memoryAddress);
		
		this.functionName = null;
	}
	
}

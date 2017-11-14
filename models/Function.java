package models;

import java.util.HashMap;
import java.util.Map;

public class Function extends ObjectSymbolTable {
	private int returnType;
	private String functionName;
	
	private Map<String, Parameter> parameters;
	private Map<String, Variable> localVariables;
	
	public int getReturnType() {
		return returnType;
	}

	public void setReturnType(int returnType) {
		this.returnType = returnType;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Map<String, Parameter> getParameters() {
		return parameters;
	}

	public void addParameter(String id, Parameter parameter) {
		parameters.put(id, parameter);
	}
	
	public void setParameters(Map<String, Parameter> parameter) {
		this.parameters = parameter;
	}

	public Map<String, Variable> getLocalVariables() {
		return localVariables;
	}
	
	public void addLocalVariable(String id, Variable variable) {
		localVariables.put(id, variable);
	}

	public void setLocalVariables(Map<String, Variable> localVariables) {
		this.localVariables = localVariables;
	}
	
	/**
	 * 
	 * @param id
	 * @return true (if id has already been declared in function)
	 */
	public boolean isDeclaredId(String id) {
		if(parameters.containsKey(id) || localVariables.containsKey(id)) {
			return true;
		}
		
		return false;
	}

	public Function(int typeObjectSimbolTable, int memoryAddress) {
		super(typeObjectSimbolTable, memoryAddress);
		this.parameters = new HashMap<String, Parameter>();
		this.localVariables = new HashMap<String, Variable>();
	}
	
}

package models;

import java.util.HashMap;
import java.util.Map;

public class Function extends ObjectSymbolTable {
	private String functionName;
	private int memoryAddressFree = 0;
	private Map<String, Parameter> parameters;
	private Map<String, Variable> localVariables;

	public String getFunctionName() {
		return functionName;
	}
	
	public int getSizeMemoryLocals() {
		return (memoryAddressFree + 1);
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Map<String, Parameter> getParameters() {
		return parameters;
	}

	public void addParameter(String id, Parameter parameter) {
		// seta o endereco local do parametro na funcao
		parameter.setMemoryAddress(memoryAddressFree++);
		
		parameters.put(id, parameter);
	}
	
	public void setParameters(Map<String, Parameter> parameter) {
		this.parameters = parameter;
	}

	public Map<String, Variable> getLocalVariables() {
		return localVariables;
	}
	
	public void addLocalVariable(String id, Variable variable) {
		variable.setMemoryAddress(memoryAddressFree++);
		
		localVariables.put(id, variable);
	}

	public void setLocalVariables(Map<String, Variable> localVariables) {
		this.localVariables = localVariables;
	}
	
	public ObjectSymbolTable objectVariableOrParameter(String id) {
		if(parameters.containsKey(id))
			return parameters.get(id); // retorna o parametro
		else
			return localVariables.get(id); // retorna a variavel local
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

package models;

import java.util.ArrayList;

public class Function extends ObjectSymbolTable {
	private int returnType;
	private String functionName;
	private ArrayList<Parameter> parameters;
	private ArrayList<Variable> localVariables;
	
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

	public ArrayList<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<Parameter> parameter) {
		this.parameters = parameter;
	}

	public ArrayList<Variable> getLocalVariables() {
		return localVariables;
	}

	public void setLocalVariables(ArrayList<Variable> localVariables) {
		this.localVariables = localVariables;
	}
	
	public void addParameter(Parameter parameter) {
		if(parameter != null) {
			this.parameters.add(parameter);
		}
	}
	
	public void addLocalVariable(Variable variable) {
		if(variable != null) {
			variable.setScope(Variable.LOCAL);
			
			this.localVariables.add(variable);
		}
	}

	public Function(int typeObjectSimbolTable, int memoryAddress) {
		super(typeObjectSimbolTable, memoryAddress);
		this.parameters = new ArrayList<Parameter>();
		this.localVariables = new ArrayList<Variable>();
	}
	
}

package java;


import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;
import grammar.*;
import models.ObjectSymbolTable;

public class AcoesSemanticas extends JMRCompilerBaseListener {
    
    private Map<String, ObjectSymbolTable> symbolTable = new HashMap<String, ObjectSymbolTable>();    

    public Map<String, ObjectSymbolTable> getSymbolTable() {
        return symbolTable;
    }
    public void setSymbolTable(Map<String, ObjectSymbolTable> symbolTable) {
        this.symbolTable = symbolTable;
    }

	public void exitPrograma(JMRCompilerParser.ProgramaContext ctx) {
		
    }
    
	public void exitDecVars(JMRCompilerParser.DecVarsContext ctx) {
		
	}
    
}

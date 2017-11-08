package semantica;


import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;
import grammar.*;
import models.ObjectSymbolTable;

public class AcoesSemanticas extends JMRCompilerBaseListener {
	
	private int addressMemoryFree = 0; // possivel erro ao armazenar o endereço de uma variavel
    private Map<String, ObjectSymbolTable> symbolTable = new HashMap<String, ObjectSymbolTable>();    

    public Map<String, ObjectSymbolTable> getSymbolTable() {
        return symbolTable;
    }
    public void setSymbolTable(Map<String, ObjectSymbolTable> symbolTable) {
        this.symbolTable = symbolTable;
    }

	public void exitPrograma(JMRCompilerParser.ProgramaContext ctx) {
		
    }
    
	/**
	 * @description SALVA AS VARIAVEIS DECLARADAS NA TABELA DE SIMBOLOS
	 */
	public void exitDecVars(JMRCompilerParser.DecVarsContext ctx) {
		for(TerminalNode id: ctx.listaIDs().ID()) {
			if(!symbolTable.containsKey(id.getText())) {
				ObjectSymbolTable variable = new ObjectSymbolTable(ObjectSymbolTable.VARIABLE, ctx.tipo.type, ObjectSymbolTable.GLOBAL, null, addressMemoryFree++, null);
				
				symbolTable.put(id.getText(), variable);
			} else {
				// gera erro de id duplicado. Marco pensar em como mostra o erro na IDE
				System.out.println("ERRO: nome da variavel ja declara. Linha " + id.getSymbol().getLine());
			}
		}
	}
	
	public void exitDecConsts(JMRCompilerParser.DecConstsContext ctx) {
		
		if(!symbolTable.containsKey(ctx.ID().getText())) {
			if((ctx.tipo().type == 1)&&(ctx.valor().value instanceof Integer) || (ctx.tipo().type == 2)&&(ctx.valor().value instanceof Float) || (ctx.tipo().type == 3)&&(ctx.valor().value instanceof String) || (ctx.tipo().type == 4)&&(ctx.valor().value instanceof Boolean)) {
				ObjectSymbolTable constant = new ObjectSymbolTable(ObjectSymbolTable.CONSTANT, ctx.tipo().type, ObjectSymbolTable.GLOBAL, null, addressMemoryFree++, ctx.valor().value);
				
				symbolTable.put(ctx.ID().getText(), constant);
			} else if((ctx.tipo().type == 2)&&(ctx.valor().value instanceof Integer)){
				ObjectSymbolTable constant = new ObjectSymbolTable(ObjectSymbolTable.CONSTANT, ctx.tipo().type, ObjectSymbolTable.GLOBAL, null, addressMemoryFree++, (float)((int)ctx.valor().value));
				
				symbolTable.put(ctx.ID().getText(), constant);
			}else {
				System.out.println("ERRO: Tipo atribuido incompativel com o tipo declarado. Linha " + ctx.ID().getSymbol().getLine());
			}
			
		} else {
			// gera erro de id duplicado. Marco pensar em como mostra o erro na IDE
			System.out.println("ERRO: o nome especificado para a constante ja foi declarado. Linha " + ctx.ID().getSymbol().getLine());
		}
		
	}
    
}

package java;


import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;
import grammar.*;

public class AcoesSemanticas extends JMRCompilerBaseListener {
    
    private Map<String, Integer> tabSimb = new HashMap<String, Integer>();    

    public Map<String, Integer> getTabSimb() {
        return tabSimb;
    }
    public void setTabSimb(Map<String, Integer> tabSimb) {
        this.tabSimb = tabSimb;
    }

//	public void exitPrograma(AnaSintParser.ProgramaContext ctx) { 
//            System.out.println("Tabela de ");
//        }
    
	public void exitDecVars(JMRCompilerParser.DecVarsContext ctx) {
            for (TerminalNode id: ctx.listaIDs().ID()) {
                if (!tabSimb.containsKey(id.getText())) 
                    tabSimb.put(id.getText(),ctx.tipo.t);
                else System.out.println("ID duplicado");
            } 
        }
    
}

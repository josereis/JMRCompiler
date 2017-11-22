import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import controller.SemanticActions;
import grammar.*;

import grammar.JMRCompilerLexer;

public class Main {
	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\jsrib\\eclipse-workspace\\JMRCompiler\\src\\input";
		
		InputStream input = new FileInputStream(file);
		ANTLRInputStream stream = new ANTLRInputStream(input);
      
		JMRCompilerLexer lexer = new JMRCompilerLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
      
		JMRCompilerParser parser = new JMRCompilerParser(tokens);
		ParseTree tree = parser.programa();
      
		SemanticActions listener = new SemanticActions(file);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, tree);
      
		System.out.println("Tabela de Simbolos");
		System.out.println(listener.getSymbolTable().toString());
	}
}

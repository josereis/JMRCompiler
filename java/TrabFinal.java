/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import grammar.*;

/**
 *
 * @author Penafort
 */
public class TrabFinal {

 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String file = "C:/Users/Penafort/Documents/NetBeansProjects/TrabFinal/src/trabfinal/Input";
        InputStream input = new FileInputStream(file);
        ANTLRInputStream stream = new ANTLRInputStream(input);
        
        JMRCompilerLexer lexer = new JMRCompilerLexer( stream );
        CommonTokenStream tokens = new CommonTokenStream( lexer);
        
        JMRCompilerParser parser = new JMRCompilerParser( tokens);
        ParseTree tree = parser.programa();
        System.out.println(tree.toStringTree(parser));
        
        AcoesSemanticas listener = new AcoesSemanticas();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        
        System.out.println("Tabela de Simbolos");
        System.out.println(listener.getSymbolTable());
        
        
        
    }
    
}

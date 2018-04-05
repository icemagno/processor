package br.com.cmabreu;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import br.com.cmabreu.parser.InstructionCompleteListener;
import br.com.cmabreu.parser.InstructionLexer;
import br.com.cmabreu.parser.InstructionParser;
import br.com.cmabreu.parser.InstructionParser.InstSentenceContext;


public class App {
    public static void main( String[] args ) throws Exception {
        
    	String input = "STO 0 45";
    	
    	InputStream stream = new ByteArrayInputStream( input.getBytes( StandardCharsets.UTF_8) );
    	InstructionLexer lexer = new InstructionLexer(  CharStreams.fromStream(stream, StandardCharsets.UTF_8)  );
    	

    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	InstructionParser parser = new InstructionParser( tokens );

    	
    		
    	ParseTreeWalker walker = new ParseTreeWalker();
    	InstructionCompleteListener listener = new InstructionCompleteListener();

    	
    	InstSentenceContext context = parser.instSentence();
    	
    	walker.walk(listener, context);
    	
    	//listener.showList();    	
    	
    	
    	
    	
    }
}

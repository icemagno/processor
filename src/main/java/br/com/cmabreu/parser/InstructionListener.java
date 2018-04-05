package br.com.cmabreu.parser;

// Generated from Instruction.g by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InstructionParser}.
 */
public interface InstructionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InstructionParser#instSentence}.
	 * @param ctx the parse tree
	 */
	void enterInstSentence(InstructionParser.InstSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstructionParser#instSentence}.
	 * @param ctx the parse tree
	 */
	void exitInstSentence(InstructionParser.InstSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstructionParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(InstructionParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstructionParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(InstructionParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InstructionParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(InstructionParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link InstructionParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(InstructionParser.ParameterContext ctx);
}
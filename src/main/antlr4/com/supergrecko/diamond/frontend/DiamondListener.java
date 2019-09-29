// Generated from /mnt/d/Projects/Kotlin/Diamond/src/main/antlr4/com/supergrecko/diamond/frontend/Diamond.g4 by ANTLR 4.7.2
package com.supergrecko.diamond.frontend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiamondParser}.
 */
public interface DiamondListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiamondParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DiamondParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiamondParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DiamondParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiamondParser#entryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEntryDeclaration(DiamondParser.EntryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiamondParser#entryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEntryDeclaration(DiamondParser.EntryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiamondParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclaration(DiamondParser.TopLevelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiamondParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclaration(DiamondParser.TopLevelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiamondParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(DiamondParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiamondParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(DiamondParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiamondParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(DiamondParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiamondParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(DiamondParser.GenericTypeContext ctx);
}
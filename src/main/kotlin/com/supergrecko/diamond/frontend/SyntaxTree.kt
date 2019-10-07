package com.supergrecko.diamond.frontend

sealed class SyntaxTree {
    // Variable for AST Printing
    private val syntaxName = this::class.java.simpleName
}

data class IntLiteral(val value: Int) : SyntaxTree()
data class DoubleLiteral(val value:Double) : SyntaxTree()
data class StringLiteral(val value: String) : SyntaxTree()
data class BooleanLiteral(val value: Boolean) : SyntaxTree()
data class Identifier(val value: String) : SyntaxTree()

data class GroupingExpression(val inner: SyntaxTree) : SyntaxTree()
data class VariableExpression(val name: SyntaxTree) : SyntaxTree()
data class CallExpression(val subject: SyntaxTree, val types: List<SyntaxTree>, val args: List<SyntaxTree>) : SyntaxTree()
data class MultiplicativeExpression(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
data class AdditiveExpression(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
data class BinaryExpression(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
data class InfixExpression(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
data class EqualityExpression(val left: SyntaxTree, val operator: SyntaxTree, val right: SyntaxTree) : SyntaxTree()
data class FunctionExpression(val types: List<SyntaxTree>, val parameters: List<SyntaxTree>, val body: List<SyntaxTree>, val returns: SyntaxTree) : SyntaxTree()
data class IfExpression(val condition: SyntaxTree, val primary: List<SyntaxTree>, val secondary: SyntaxTree) : SyntaxTree()
data class WhenExpression(val condition: SyntaxTree, val branches: List<SyntaxTree>, val fallback: SyntaxTree) : SyntaxTree()

data class ProgramDeclaration(val namespace: SyntaxTree, val body: List<SyntaxTree>) : SyntaxTree()
data class NamespaceDeclaration(val name: String) : SyntaxTree()
data class EntryDeclaration(val body: List<SyntaxTree>) : SyntaxTree()
data class FunctionDeclaration(val name: String, val types: List<SyntaxTree>, val parameters: List<SyntaxTree>, val body: List<SyntaxTree>, val returns: SyntaxTree) : SyntaxTree()
data class StructDeclaration(val name: String, val types: List<SyntaxTree>, val contracts: List<SyntaxTree>, val body: List<SyntaxTree>) : SyntaxTree()
data class ContractDeclaration(val name: String, val types: List<SyntaxTree>, val body: List<SyntaxTree>) : SyntaxTree()

data class MutStatement(val name: String, val type: SyntaxTree, val value: SyntaxTree) : SyntaxTree()
data class ConstStatement(val name: String, val type: SyntaxTree, val value: SyntaxTree) : SyntaxTree()
data class ExpressionStatement(val expression: SyntaxTree) : SyntaxTree()
data class LoopStatement(val condition: SyntaxTree, val body: List<SyntaxTree>) : SyntaxTree()
data class ReturnStatement(val value: SyntaxTree) : SyntaxTree()
data class YieldStatement(val value: SyntaxTree) : SyntaxTree()

object ThisExpression : SyntaxTree()
object BreakStatement : SyntaxTree()
object ContinueStatement : SyntaxTree()

data class WhenBranch(val condition: SyntaxTree, val event: List<SyntaxTree>) : SyntaxTree()

package com.supergrecko.diamond.ast

sealed class SyntaxTree

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

data class NamespaceDeclaration(val name: String) : SyntaxTree()
data class EntryDeclaration(val body: List<SyntaxTree>) : SyntaxTree()

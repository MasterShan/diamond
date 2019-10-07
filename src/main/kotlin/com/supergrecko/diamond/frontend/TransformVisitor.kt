package com.supergrecko.diamond.frontend

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor

class TransformVisitor : DiamondVisitor<SyntaxTree>, AbstractParseTreeVisitor<SyntaxTree>() {
    override fun visitProgram(ctx: DiamondParser.ProgramContext): SyntaxTree {
        val namespace = visit(ctx.namespace) as NamespaceDeclaration

        val elements = ctx.primaryDeclaration().map {
            visit(it) as SyntaxTree
        }

        return ProgramDeclaration(namespace, elements)
    }

    override fun visitNamespaceDeclaration(ctx: DiamondParser.NamespaceDeclarationContext): SyntaxTree {
        println(ctx.id.text)
        return NamespaceDeclaration(ctx.id.text)
    }

    override fun visitEntryDeclaration(ctx: DiamondParser.EntryDeclarationContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitPrimaryDeclaration(ctx: DiamondParser.PrimaryDeclarationContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitFunctionDeclaration(ctx: DiamondParser.FunctionDeclarationContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitAdditiveExpression(ctx: DiamondParser.AdditiveExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitIntExpression(ctx: DiamondParser.IntExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitMultiplicativeExpression(ctx: DiamondParser.MultiplicativeExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitBooleanExpression(ctx: DiamondParser.BooleanExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitVariableExpression(ctx: DiamondParser.VariableExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitFunctionExpression(ctx: DiamondParser.FunctionExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitBinaryExpression(ctx: DiamondParser.BinaryExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitGroupingExpression(ctx: DiamondParser.GroupingExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitStringExpression(ctx: DiamondParser.StringExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitCallExpression(ctx: DiamondParser.CallExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitDoubleExpression(ctx: DiamondParser.DoubleExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitInfixExpression(ctx: DiamondParser.InfixExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitThisExpression(ctx: DiamondParser.ThisExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitNullExpression(ctx: DiamondParser.NullExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitEqualityExpression(ctx: DiamondParser.EqualityExpressionContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitFunctionArguments(ctx: DiamondParser.FunctionArgumentsContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitTypeArguments(ctx: DiamondParser.TypeArgumentsContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitFunctionParameters(ctx: DiamondParser.FunctionParametersContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitTypeParameters(ctx: DiamondParser.TypeParametersContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitGenericStatement(ctx: DiamondParser.GenericStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitAssignmentStatement(ctx: DiamondParser.AssignmentStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitMutStatement(ctx: DiamondParser.MutStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitConstStatement(ctx: DiamondParser.ConstStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitBreakStatement(ctx: DiamondParser.BreakStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitContinueStatement(ctx: DiamondParser.ContinueStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitExpressionStatement(ctx: DiamondParser.ExpressionStatementContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitTypeAnnotation(ctx: DiamondParser.TypeAnnotationContext): SyntaxTree {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

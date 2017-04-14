// Generated from MiniJava.g4 by ANTLR 4.4

	package cc1.ay222cg.examples;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterArrayItem(@NotNull MiniJavaParser.ArrayItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitArrayItem(@NotNull MiniJavaParser.ArrayItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#callParams}.
	 * @param ctx the parse tree
	 */
	void enterCallParams(@NotNull MiniJavaParser.CallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#callParams}.
	 * @param ctx the parse tree
	 */
	void exitCallParams(@NotNull MiniJavaParser.CallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#returnSt}.
	 * @param ctx the parse tree
	 */
	void enterReturnSt(@NotNull MiniJavaParser.ReturnStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#returnSt}.
	 * @param ctx the parse tree
	 */
	void exitReturnSt(@NotNull MiniJavaParser.ReturnStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull MiniJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull MiniJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignSt}.
	 * @param ctx the parse tree
	 */
	void enterAssignSt(@NotNull MiniJavaParser.AssignStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignSt}.
	 * @param ctx the parse tree
	 */
	void exitAssignSt(@NotNull MiniJavaParser.AssignStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void enterWhileSt(@NotNull MiniJavaParser.WhileStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void exitWhileSt(@NotNull MiniJavaParser.WhileStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethodName}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodName(@NotNull MiniJavaParser.MainMethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethodName}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodName(@NotNull MiniJavaParser.MainMethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#callParameter}.
	 * @param ctx the parse tree
	 */
	void enterCallParameter(@NotNull MiniJavaParser.CallParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#callParameter}.
	 * @param ctx the parse tree
	 */
	void exitCallParameter(@NotNull MiniJavaParser.CallParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethodSigniture}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodSigniture(@NotNull MiniJavaParser.MainMethodSignitureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethodSigniture}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodSigniture(@NotNull MiniJavaParser.MainMethodSignitureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(@NotNull MiniJavaParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(@NotNull MiniJavaParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void enterArrayName(@NotNull MiniJavaParser.ArrayNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void exitArrayName(@NotNull MiniJavaParser.ArrayNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull MiniJavaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull MiniJavaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(@NotNull MiniJavaParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(@NotNull MiniJavaParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#printSt}.
	 * @param ctx the parse tree
	 */
	void enterPrintSt(@NotNull MiniJavaParser.PrintStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#printSt}.
	 * @param ctx the parse tree
	 */
	void exitPrintSt(@NotNull MiniJavaParser.PrintStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignArrayItem}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayItem(@NotNull MiniJavaParser.AssignArrayItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignArrayItem}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayItem(@NotNull MiniJavaParser.AssignArrayItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(@NotNull MiniJavaParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(@NotNull MiniJavaParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(@NotNull MiniJavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(@NotNull MiniJavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull MiniJavaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull MiniJavaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethodType}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodType(@NotNull MiniJavaParser.MainMethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethodType}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodType(@NotNull MiniJavaParser.MainMethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull MiniJavaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull MiniJavaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull MiniJavaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull MiniJavaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#comparer}.
	 * @param ctx the parse tree
	 */
	void enterComparer(@NotNull MiniJavaParser.ComparerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#comparer}.
	 * @param ctx the parse tree
	 */
	void exitComparer(@NotNull MiniJavaParser.ComparerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodSigniture}.
	 * @param ctx the parse tree
	 */
	void enterMethodSigniture(@NotNull MiniJavaParser.MethodSignitureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodSigniture}.
	 * @param ctx the parse tree
	 */
	void exitMethodSigniture(@NotNull MiniJavaParser.MethodSignitureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifSt}.
	 * @param ctx the parse tree
	 */
	void enterIfSt(@NotNull MiniJavaParser.IfStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifSt}.
	 * @param ctx the parse tree
	 */
	void exitIfSt(@NotNull MiniJavaParser.IfStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#defineVarSt}.
	 * @param ctx the parse tree
	 */
	void enterDefineVarSt(@NotNull MiniJavaParser.DefineVarStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#defineVarSt}.
	 * @param ctx the parse tree
	 */
	void exitDefineVarSt(@NotNull MiniJavaParser.DefineVarStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull MiniJavaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull MiniJavaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#conjuction}.
	 * @param ctx the parse tree
	 */
	void enterConjuction(@NotNull MiniJavaParser.ConjuctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#conjuction}.
	 * @param ctx the parse tree
	 */
	void exitConjuction(@NotNull MiniJavaParser.ConjuctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#objectMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterObjectMethodCall(@NotNull MiniJavaParser.ObjectMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#objectMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitObjectMethodCall(@NotNull MiniJavaParser.ObjectMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#negativeSing}.
	 * @param ctx the parse tree
	 */
	void enterNegativeSing(@NotNull MiniJavaParser.NegativeSingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#negativeSing}.
	 * @param ctx the parse tree
	 */
	void exitNegativeSing(@NotNull MiniJavaParser.NegativeSingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#newObjectMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectMethodCall(@NotNull MiniJavaParser.NewObjectMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#newObjectMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectMethodCall(@NotNull MiniJavaParser.NewObjectMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(@NotNull MiniJavaParser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(@NotNull MiniJavaParser.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClassName}.
	 * @param ctx the parse tree
	 */
	void enterMainClassName(@NotNull MiniJavaParser.MainClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClassName}.
	 * @param ctx the parse tree
	 */
	void exitMainClassName(@NotNull MiniJavaParser.MainClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#elseSt}.
	 * @param ctx the parse tree
	 */
	void enterElseSt(@NotNull MiniJavaParser.ElseStContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#elseSt}.
	 * @param ctx the parse tree
	 */
	void exitElseSt(@NotNull MiniJavaParser.ElseStContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(@NotNull MiniJavaParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(@NotNull MiniJavaParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(@NotNull MiniJavaParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(@NotNull MiniJavaParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(@NotNull MiniJavaParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(@NotNull MiniJavaParser.ClazzContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull MiniJavaParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull MiniJavaParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#clazzName}.
	 * @param ctx the parse tree
	 */
	void enterClazzName(@NotNull MiniJavaParser.ClazzNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#clazzName}.
	 * @param ctx the parse tree
	 */
	void exitClazzName(@NotNull MiniJavaParser.ClazzNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull MiniJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull MiniJavaParser.MethodCallContext ctx);
}
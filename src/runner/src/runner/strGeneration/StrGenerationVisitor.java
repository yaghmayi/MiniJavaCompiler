package runner.strGeneration;

import cc1.grammar.examples.MiniJavaBaseVisitor;
import cc1.grammar.examples.MiniJavaParser;
import cc1.grammar.examples.MiniJavaParser.CallParameterContext;
import cc1.grammar.examples.MiniJavaParser.ComparerContext;
import cc1.grammar.examples.MiniJavaParser.ConditionContext;
import cc1.grammar.examples.MiniJavaParser.ConditionsContext;
import cc1.grammar.examples.MiniJavaParser.ConjuctionContext;
import cc1.grammar.examples.MiniJavaParser.ElementContext;
import cc1.grammar.examples.MiniJavaParser.MethodCallContext;
import cc1.grammar.examples.MiniJavaParser.MethodParameterContext;
import cc1.grammar.examples.MiniJavaParser.OperationContext;
import cc1.grammar.examples.MiniJavaParser.StatementContext;

public class StrGenerationVisitor<object> extends MiniJavaBaseVisitor<object>
{
	private ProgramStr programStr = new ProgramStr();
	private ClassStr currentClassStr;
	private MethodStr currentMethodStr;
	private BlockStatementStr currentBlockStmStr;
	
	public ProgramStr getProgramStr() 
	{
		return programStr;
	}
	
	@Override 
	public object visitMainClass(MiniJavaParser.MainClassContext ctx) 
	{ 
		ClassStr classStr = new ClassStr(ctx.mainClassName().getText());
		programStr.addClass(classStr);
		currentClassStr = classStr;
		
		visitChildren(ctx);
		
		return null;
	}
	
	@Override 
	public object visitMainMethodSigniture(MiniJavaParser.MainMethodSignitureContext ctx) 
	{ 
		MethodStr methodStr = new MethodStr(ctx.mainMethodName().getText());
		currentClassStr.addMethod(methodStr);
		currentMethodStr = methodStr;
		visitChildren(ctx);
		
		return null;
	}
	
	@Override 
	public object visitDefineVarSt(MiniJavaParser.DefineVarStContext ctx) 
	{ 
		if (ctx.ID() != null)
		{
			String variableName = ctx.ID().getText();
			currentMethodStr.addVariable(variableName);
		}
		
		return visitChildren(ctx); 
	}
	
	@Override 
	public object visitClazz(MiniJavaParser.ClazzContext ctx) 
	{ 
		ClassStr classStr = new ClassStr(ctx.clazzName().getText());
		programStr.addClass(classStr);
		currentClassStr = classStr;
		
		visitChildren(ctx);
		
		return null;
	}
	
	@Override 
	public object visitMethodSigniture(MiniJavaParser.MethodSignitureContext ctx) 
	{ 
		MethodStr methodStr = new MethodStr(ctx.methodName().getText());
		for (MethodParameterContext methodParamCtx : ctx.methodParameter())
		{
			String paramName = methodParamCtx.ID().getText();
			methodStr.addParam(paramName);
			methodStr.addVariable(paramName);
		}
		
		currentClassStr.addMethod(methodStr);
		currentMethodStr = methodStr;
		visitChildren(ctx);
		
		return null;
	}
	
	@Override 
	public object visitWhileSt(MiniJavaParser.WhileStContext ctx) 
	{
		BlockStatementStr parentBlock = currentBlockStmStr;
		WhileStr whileStr = new WhileStr();
		whileStr.setParentStatement(parentBlock);
		whileStr.setCondition(CreateConditionStr(ctx.conditions()));
		addStatement(whileStr);
		
		currentBlockStmStr = whileStr;
		visitChildren(ctx);
		currentBlockStmStr = parentBlock;
		
		return null;
	}
	
	@Override 
	public object visitAssignSt(MiniJavaParser.AssignStContext ctx) 
	{
		String variableName = ctx.ID().getText();
		if (!currentMethodStr.getVariables().contains(variableName))
			currentMethodStr.addVariable(variableName);
		
		AssignStr assignStr = new AssignStr();
		assignStr.setAssignTo(new IdentifierStr(ctx.ID().getText()));
		assignStr.setAssignFrom(CreateOperationStr(ctx.operation()));
		
		addStatement(assignStr);
		
		visitChildren(ctx);
		
		return null;
	}
	
	@Override 
	public object visitReturnSt(MiniJavaParser.ReturnStContext ctx) 
	{
		SimpleElementStr simpleElementStr = null;
		if (ctx.ID() != null)
			simpleElementStr = new IdentifierStr(ctx.ID().getText()); 
		else
			simpleElementStr = new NumberStr(ctx.Number().getText());
		
		addStatement(new ReturnStr(simpleElementStr));
		
		visitChildren(ctx);
		
		return null;
	}
	
	@Override 
	public object visitPrintSt(MiniJavaParser.PrintStContext ctx) 
	{
		PrintStr printStr = new PrintStr();
		if (ctx.operation() != null)
		{
			OperationStr operationStr = CreateOperationStr(ctx.operation());
			printStr.setOperation(operationStr);
		}
		
		addStatement(printStr);
		
		visitChildren(ctx);
		
		return null;
	}
	
	private OperationStr CreateOperationStr(OperationContext operationCtx)
	{
		OperationStr operationStr = null;;
		
		if (operationCtx.element().size() == 1)
		{
			ElementContext element = operationCtx.element(0);
			operationStr = CreateOperationStr(element);
		}
		else
		{
			operationStr = new OperationStr();
			operationStr.setOperationType(OperationTypes.MixedOperation);
			operationStr.setFirstOperation(CreateOperationStr(operationCtx.element(0)));
			operationStr.setOperator(GetOperator(operationCtx.operator(0).getText()));
			operationStr.setSecondOperation(CreateOperationStr(operationCtx.element(1)));
		}
		return operationStr;
	}
	
	private Operators GetOperator(String operatorTxt)
	{
		if (operatorTxt.equals("+"))
			return Operators.Add;
		else if (operatorTxt.equals("-"))
			return Operators.Sub;
		else if (operatorTxt.equals("*"))
			return Operators.Mul;
		else if (operatorTxt.equals("?"))
			return Operators.Div;
		else
			return null;
	}
	
	private OperationStr CreateOperationStr(ElementContext elementCtx)
	{
		OperationStr operationStr = new OperationStr();
		
		if (elementCtx.Number() != null)
		{
			operationStr.setOperationType(OperationTypes.Number);
			operationStr.setSimpleElement(new NumberStr(elementCtx.Number().getText()));
		}
		else if (elementCtx.ID() != null)
		{
			if (isBoolean(elementCtx.getText()))
			{
				operationStr.setOperationType(OperationTypes.Boolean);
				operationStr.setSimpleElement(new BooleanStr(elementCtx.getText()));
			}
			else
			{
				operationStr.setOperationType(OperationTypes.Identifier);
				operationStr.setSimpleElement(new IdentifierStr(elementCtx.getText()));
			}
			
		}
		else if (elementCtx.newObjectMethodCall() != null || elementCtx.objectMethodCall() != null)
		{
			operationStr.setOperationType(OperationTypes.ObjMethodCall);
			
			String targetClassName;
			MethodCallContext methodCallCtx;
			if (elementCtx.newObjectMethodCall() != null)
			{
				targetClassName = elementCtx.newObjectMethodCall().newObject().ID().getText();
				methodCallCtx = elementCtx.newObjectMethodCall().methodCall();
			}
			else
			{
				//only this.Method() -> this is current class 
				targetClassName = currentClassStr.getName();
				methodCallCtx = elementCtx.objectMethodCall().methodCall();
			}
			
			ObjMethodCallStr objMethodCallStr = new ObjMethodCallStr(targetClassName, methodCallCtx.methodName().getText());
			if (methodCallCtx.callParams() != null)
			{
				for (CallParameterContext callParamCtx : methodCallCtx.callParams().callParameter())
				{
					if (callParamCtx.element() != null)
					{
						OperationStr callParamOpStr = null;
						
						if (callParamCtx.element().ID() != null || callParamCtx.element().Number() != null)
						{
							SimpleElementStr simpleElementStr = CreateSimpleElementStr(callParamCtx.element());
							callParamOpStr = new OperationStr();
							callParamOpStr.setSimpleElement(simpleElementStr);
							
							if (callParamCtx.element().ID() != null)
								callParamOpStr.setOperationType(OperationTypes.Identifier);
							else if (callParamCtx.element().Number() != null)
								callParamOpStr.setOperationType(OperationTypes.Number);
						}
						else if (callParamCtx.element().operator() != null && callParamCtx.element().element().size() > 1)
						{
							callParamOpStr = new OperationStr();
							callParamOpStr.setOperationType(OperationTypes.MixedOperation);
							callParamOpStr.setFirstOperation(CreateOperationStr(callParamCtx.element().element(0)));
							callParamOpStr.setOperator(GetOperator(callParamCtx.element().operator().getText()));
							callParamOpStr.setSecondOperation(CreateOperationStr(callParamCtx.element().element(1)));
						}
						
						if (callParamOpStr != null)
							objMethodCallStr.addCallParam(callParamOpStr);
					}
				}
			}
			
			operationStr.setObjMethodCall(objMethodCallStr);
		}
		else if (elementCtx.element().size() == 1) // for this case -> element : '(' element ')' 
			operationStr = CreateOperationStr(elementCtx.element(0));
		else
			operationStr = null;
		
		return operationStr;
	}
	
	@Override 
	public object visitIfSt(MiniJavaParser.IfStContext ctx) 
	{ 
		BlockStatementStr parentBlock = currentBlockStmStr;
		IfStr ifStr = new IfStr();
		ifStr.setParentStatement(parentBlock);
		ConditionStr conditionStr = CreateConditionStr(ctx.conditions());
		ifStr.setCondition(conditionStr);
		addStatement(ifStr);
		currentBlockStmStr = ifStr;
		for (StatementContext statementCtx : ctx.statement())
			visit(statementCtx);
		
		if (ctx.elseSt() != null)
		{
			ElseStr elseStr = new ElseStr();
			ifStr.setElseStr(elseStr);
			currentBlockStmStr = elseStr;
			
			for (StatementContext statementCtx : ctx.elseSt().statement())
				visit(statementCtx);
		}
		currentBlockStmStr = parentBlock;
		
		return null;
	}
	
	private void addStatement(StatementStr statement)
	{
		if (currentBlockStmStr != null)
			currentBlockStmStr.addStatement(statement);
		else
			currentMethodStr.addStatement(statement);
	}
	
	private ConditionStr CreateConditionStr(ConditionsContext conditionsCtx)
	{
		ConditionStr conditionStr = null;
		if (conditionsCtx.condition().size() == 1)
			conditionStr = CreateConditionStr(conditionsCtx.condition(0));
		else
		{
			conditionStr = new ConditionStr();
			conditionStr.setFisrtCondition(CreateConditionStr(conditionsCtx.condition(0)));
			conditionStr.setConjuction(getConjuction(conditionsCtx.conjuction(0)));
			conditionStr.setSecondCondition(CreateConditionStr(conditionsCtx.condition(1)));
		}
		
		if (conditionsCtx.negativeSing() != null)
			conditionStr.setNotSign(true);
		
		return conditionStr;
	}
	
	private ConditionStr CreateConditionStr(ConditionContext conditionCtx)
	{
		ConditionStr conditionStr = null;
		if (conditionCtx.operation().size() == 2 || conditionCtx.operation().size() == 1)
		{
			conditionStr = new ConditionStr();
			conditionStr.setFirstElement(CreateSimpleElementStr(conditionCtx.operation(0).element(0)));
			
			if (conditionCtx.operation().size() == 2)
			{
				conditionStr.setSecondElement(CreateSimpleElementStr(conditionCtx.operation(1).element(0)));
				conditionStr.setComparor(getComparor(conditionCtx.comparer()));
			}
			
			if (conditionCtx.negativeSing() != null)
				conditionStr.setNotSign(true);
		}
		
		return conditionStr;
	}
	
	private Comparors getComparor(ComparerContext comparerCtx)
	{
		if (comparerCtx.getText().equals("<"))
			return Comparors.Less;
		else if (comparerCtx.getText().equals("=="))
			return Comparors.Equal;
		else return null;
	}
	
	private SimpleElementStr CreateSimpleElementStr(ElementContext elementCtx)
	{
		SimpleElementStr simpleElementStr = null;
		if (elementCtx.ID() != null)
			simpleElementStr = new IdentifierStr(elementCtx.ID().getText());
		else if (elementCtx.Number() != null)
			simpleElementStr = new NumberStr(elementCtx.Number().getText());
		
		return simpleElementStr;
	}
	
	private Conjuctions getConjuction(ConjuctionContext conjuctionCtx)
	{
		if (conjuctionCtx.getText().equals("&&"))
			return Conjuctions.And;
		else if (conjuctionCtx.getText().equals("||"))
			return Conjuctions.Or;
		else
			return null;
	}
	
	private boolean isBoolean(String text)
	{
		return text.equals("true") || text.equals("false");
	}
}

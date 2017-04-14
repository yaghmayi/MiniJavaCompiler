package compiler.unitTests;

import compiler.errors.CharAtError;
import compiler.errors.ConditionElementTypeError;
import compiler.errors.Error;
import compiler.errors.IndexTypeError;
import compiler.errors.LengthError;
import compiler.errors.MismatchAssignTypeError;
import compiler.errors.MismatchMethodParametersSizeError;
import compiler.errors.MismatchMethodParametersTypeError;
import compiler.errors.MismatchOperationTypeError;
import compiler.errors.MismatchReturnTypeError;
import compiler.errors.OperationTypeError;
import compiler.errors.PrintParameterTypeError;
import compiler.errors.UnbooleanConditionError;
import compiler.errors.UndefienedMethodError;
import compiler.errors.UndefinedClassError;
import compiler.errors.UndefinedVariableError;
import compiler.main.MiniJavaCompiler;

import org.junit.Assert;
import org.junit.Test;

public class MiniJavaFailingCompilerTest extends MiniJavaCompilerTest
{
	private String getFailSamplesFolder()
	{
		return baseFolder +  "\\FailSamples\\";
	}
	
	@Test
	public void undefinedVariables()
	{
		compile(getFailSamplesFolder() + "UndefinedVariable.java");
		assertFailCompile(8);
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(0), "UndefinedVariable", "Test", "j1");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(1), "UndefinedVariable", "Test", "j2");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(2), "UndefinedVariable", "Test", "j3");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(3), "UndefinedVariable", "Test", "j4");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(4), "UndefinedVariable", "Test", "flag1");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(5), "UndefinedVariable", "Test", "flag2");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(6), "UndefinedVariable", "Test", "r1");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(7), "UndefinedVariable", "Test", "r2");
	}
	
	@Test
	public void undefinedClass()
	{
		compile(getFailSamplesFolder() + "UndefinedClass.java");
		assertFailCompile(2);
		assertUndefinesClassError(MiniJavaCompiler.getErrors().get(0), "UndefinedClass", null, "Foo");
		assertUndefinesClassError(MiniJavaCompiler.getErrors().get(1), "UndefinedClass", "Test", "Foo");
	}
	
	@Test
	public void undefinedMethod()
	{
		compile(getFailSamplesFolder() + "UndefinedMethod.java");
		assertFailCompile(2);
		assertUndefinesMethodError(MiniJavaCompiler.getErrors().get(0), "UndefinedMethod", "Test", "UndefinedMethod", "foo");
		assertUndefinesMethodError(MiniJavaCompiler.getErrors().get(1), "UndefinedMethod", "Test", "Helper", "help");
	}
	
	@Test
	public void incorrectOperation()
	{
		compile(getFailSamplesFolder() + "IncorrectOperation.java");
		assertFailCompile(2);
		assertOperationTypeError(MiniJavaCompiler.getErrors().get(0), "IncorrectOperation", "Test", "flag1", "boolean");
		assertOperationTypeError(MiniJavaCompiler.getErrors().get(1), "IncorrectOperation", "Test", "flag2", "boolean");
	}
	
	@Test
	public void mismatchMethodCall()
	{
		compile(getFailSamplesFolder() + "MismatchMethodCall.java");
		assertFailCompile(5);
		
		assertMismatchMethodParametersSizeError(MiniJavaCompiler.getErrors().get(0), "MismatchMethodCall", "Test", "MismatchMethodCall", "foo");
		assertMismatchMethodParametersTypeError(MiniJavaCompiler.getErrors().get(1), "MismatchMethodCall", "Test", "MismatchMethodCall", "foo");
		assertMismatchMethodParametersSizeError(MiniJavaCompiler.getErrors().get(2), "MismatchMethodCall", "Test", "Helper", "help");
		assertMismatchMethodParametersSizeError(MiniJavaCompiler.getErrors().get(3), "MismatchMethodCall", "Test", "Helper", "self");
		assertMismatchMethodParametersTypeError(MiniJavaCompiler.getErrors().get(4), "MismatchMethodCall", "Test", "Helper", "self");
	}
	
	@Test
	public void mismatchAdvancedMethodCall()
	{
		compile(getFailSamplesFolder() + "MismatchAdvancedMethodCall.java");
		assertFailCompile(6);
		
		assertMismatchMethodParametersTypeError(MiniJavaCompiler.getErrors().get(0), "MismatchAdvancedMethodCall", "Test", "Helper", "getChar");
		assertMismatchMethodParametersTypeError(MiniJavaCompiler.getErrors().get(1), "MismatchAdvancedMethodCall", "Test", "MismatchAdvancedMethodCall", "foo");
		assertMismatchMethodParametersTypeError(MiniJavaCompiler.getErrors().get(2), "MismatchAdvancedMethodCall", "Test", "Helper", "self");
		
		assertMismatchMethodParametersSizeError(MiniJavaCompiler.getErrors().get(3), "MismatchAdvancedMethodCall", "Test", "Helper", "getChar");
		assertMismatchMethodParametersSizeError(MiniJavaCompiler.getErrors().get(4), "MismatchAdvancedMethodCall", "Test", "MismatchAdvancedMethodCall", "foo");
		assertMismatchMethodParametersSizeError(MiniJavaCompiler.getErrors().get(5), "MismatchAdvancedMethodCall", "Test", "Helper", "self");
	}
	
	@Test
	public void mismatchReturnType()
	{
		compile(getFailSamplesFolder() + "MismatchReturnType.java");
		assertFailCompile(1);
		
		Error error = MiniJavaCompiler.getErrors().get(0);
		assertMismatchReturnType(error, "MismatchReturnType", "Test", "String", "int");
	}
	
	@Test
	public void IncorrectCharAtAndLength()
	{
		compile(getFailSamplesFolder() + "IncorrectCharAtAndLength.java");
		assertFailCompile(2);
		
		assertLengthError(MiniJavaCompiler.getErrors().get(0), "IncorrectCharAtAndLength", "Test");
		assertCharAtError(MiniJavaCompiler.getErrors().get(1), "IncorrectCharAtAndLength", "Test");
	}
	
	@Test
	public void mismatchAssignType()
	{
		compile(getFailSamplesFolder() + "MismatchAssignType.java");
		assertFailCompile(5);
		
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(0), "MismatchAssignType", "Test", "flag", "j");
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(1), "MismatchAssignType", "Test", "s1", "flag");
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(2), "MismatchAssignType", "Test", "flag", "s1");
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(3), "MismatchAssignType", "Test", "f1", "h1");
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(4), "MismatchAssignType", "Test", "arr", "s1");
	}
	
	@Test
	public void mismatchAdvancedAssignType()
	{
		compile(getFailSamplesFolder() + "MismatchAdvancedAssignType.java");
		assertFailCompile(2);
		
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(0), "MismatchAdvancedAssignType", "Test", "size", "f.send()");
		assertMismatchAssignTypeError(MiniJavaCompiler.getErrors().get(1), "MismatchAdvancedAssignType", "Test", "size", "h.help()");
	}
	
	@Test
	public void mismatchOperationType()
	{
		compile(getFailSamplesFolder() + "MismatchOperationType.java");
		assertFailCompile(2);
		
		assertMismatchOperationType(MiniJavaCompiler.getErrors().get(0), "MismatchOperationType", "Multip", "a", "str");
		assertMismatchOperationType(MiniJavaCompiler.getErrors().get(1), "MismatchOperationType", "Multip", "b", "str");
	}
	
	@Test
	public void IncorrectIfWhile()
	{
		compile(getFailSamplesFolder() + "IncorrectIfWhile.java");
		assertFailCompile(2);
		
		assertUnbooleanConditionError(MiniJavaCompiler.getErrors().get(0), "IncorrectIfWhile", "Test", "s1");
		assertUnbooleanConditionError(MiniJavaCompiler.getErrors().get(1), "IncorrectIfWhile", "Test", "s2");
	}
	
	@Test
	public void IncorrectArray()
	{
		compile(getFailSamplesFolder() + "IncorrectArray.java");
		assertFailCompile(3);
		
		assertIndexTypeError(MiniJavaCompiler.getErrors().get(0), "IncorrectArray", "Test", "number", "s");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(1), "IncorrectArray", "Test", "arr");
		assertUndefinedVariableError(MiniJavaCompiler.getErrors().get(2), "IncorrectArray", "Test", "index");
	}
	
	@Test
	public void IncorrectEqualityCondition()
	{
		compile(getFailSamplesFolder() + "IncorrectEqualityCondition.java");
		assertFailCompile(3);
		
		assertConditionElementTypeError(MiniJavaCompiler.getErrors().get(0), "IncorrectEqualityCondition", "Test", "flag");
		assertConditionElementTypeError(MiniJavaCompiler.getErrors().get(1), "IncorrectEqualityCondition", "Test", "s");
		assertConditionElementTypeError(MiniJavaCompiler.getErrors().get(2), "IncorrectEqualityCondition", "Test", "flag");
	}
	
	@Test
	public void IncorrectPrint()
	{
		compile(getFailSamplesFolder() + "IncorrectPrint.java");
		assertFailCompile(1);
		
		assertPrintParameterTypeError(MiniJavaCompiler.getErrors().get(0), "IncorrectPrint", "main", "arr");
	}
	
	private void assertFailCompile(int expectedErrorsCount)
	{
		Assert.assertFalse(exceptionHappen);
		Assert.assertFalse(compilerResult);
		Assert.assertEquals(expectedErrorsCount, MiniJavaCompiler.getErrors().size());
	}
	
	private void assertUndefinesClassError(Error error, String className, String methodName, String undefiendClass)
	{
		Assert.assertTrue(error instanceof UndefinedClassError);
		UndefinedClassError undefinedClassError = (UndefinedClassError) error;
		Assert.assertEquals(className, undefinedClassError.getClassName());
		Assert.assertEquals(methodName, undefinedClassError.getMethodName());
	}
	
	private void assertOperationTypeError(Error error, String className, String methodName, String variableName, String variableType)
	{
		Assert.assertTrue(error instanceof OperationTypeError);
		OperationTypeError operationTypeError = (OperationTypeError) error;
		Assert.assertEquals(className, operationTypeError.getClassName());
		Assert.assertEquals(methodName, operationTypeError.getMethodName());
		Assert.assertEquals(variableName, operationTypeError.getVariableName());
		Assert.assertEquals(variableType, operationTypeError.getVariableType());
	}
	
	private void assertUndefinesMethodError(Error error, String className, String methodName, String targetClassName, String targetMethodName)
	{
		Assert.assertTrue(error instanceof UndefienedMethodError);
		UndefienedMethodError undefinedMethodError = (UndefienedMethodError) error;
		Assert.assertEquals(className, undefinedMethodError.getClassName());
		Assert.assertEquals(methodName, undefinedMethodError.getMethodName());
		Assert.assertEquals(targetClassName, undefinedMethodError.getTargetClassName());
		Assert.assertEquals(targetMethodName, undefinedMethodError.getTargetMethodName());
	}
	
	private void assertUndefinedVariableError(Error error, String className, String methodName, String variableName)
	{
		Assert.assertTrue(error instanceof UndefinedVariableError);
		UndefinedVariableError undefinedVarError = (UndefinedVariableError) error;
		Assert.assertEquals(className, undefinedVarError.getClassName());
		Assert.assertEquals(methodName, undefinedVarError.getMethodName());
		Assert.assertEquals(variableName, undefinedVarError.getVariableName());
	}
	
	private void assertMismatchMethodParametersSizeError(Error error, String className, String methodName, String targetClassName, String targetMethodName)
	{
		Assert.assertTrue(error instanceof MismatchMethodParametersSizeError);
		MismatchMethodParametersSizeError misMatchError = (MismatchMethodParametersSizeError) error;
		Assert.assertEquals(className, misMatchError.getClassName());
		Assert.assertEquals(methodName, misMatchError.getMethodName());
		Assert.assertEquals(targetClassName, misMatchError.getTargetClassName());
		Assert.assertEquals(targetMethodName, misMatchError.getTargetMethodName());
	}
	
	private void assertMismatchMethodParametersTypeError(Error error, String className, String methodName, String targetClassName, String targetMethodName)
	{
		Assert.assertTrue(error instanceof MismatchMethodParametersTypeError);
		MismatchMethodParametersTypeError misMatchError = (MismatchMethodParametersTypeError) error;
		Assert.assertEquals(className, misMatchError.getClassName());
		Assert.assertEquals(methodName, misMatchError.getMethodName());
		Assert.assertEquals(targetClassName, misMatchError.getTargetClassName());
		Assert.assertEquals(targetMethodName, misMatchError.getTargetMethodName());
	}
	
	private void assertMismatchReturnType(Error error, String className, String methodName, String methodType, String returnType)
	{
		Assert.assertTrue(error instanceof MismatchReturnTypeError);
		MismatchReturnTypeError mismatchError = (MismatchReturnTypeError) error;
		Assert.assertEquals(className, mismatchError.getClassName());
		Assert.assertEquals(methodName, mismatchError.getMethodName());
		Assert.assertEquals(methodType, mismatchError.getMethodType());
		Assert.assertEquals(returnType, mismatchError.getReturnType());
	}
	
	private void assertCharAtError(Error error, String className, String methodName)
	{
		Assert.assertTrue(error instanceof CharAtError);
		CharAtError charAtError = (CharAtError) error;
		Assert.assertEquals(className, charAtError.getClassName());
		Assert.assertEquals(methodName, charAtError.getMethodName());
	}
	
	private void assertLengthError(Error error, String className, String methodName)
	{
		Assert.assertTrue(error instanceof LengthError);
		LengthError lengthError = (LengthError) error;
		Assert.assertEquals(className, lengthError.getClassName());
		Assert.assertEquals(methodName, lengthError.getMethodName());
	}
	
	private void assertMismatchAssignTypeError(Error error, String className, String methodName, String assignTo, String assignFrom)
	{
		Assert.assertTrue(error instanceof MismatchAssignTypeError);
		MismatchAssignTypeError assignTypeError = (MismatchAssignTypeError) error;
		Assert.assertEquals(className, assignTypeError.getClassName());
		Assert.assertEquals(methodName, assignTypeError.getMethodName());
		Assert.assertEquals(assignTo, assignTypeError.getAssignTo());
		Assert.assertEquals(assignFrom, assignTypeError.getAssignFrom());
	}
	
	private void assertMismatchOperationType(Error error, String className, String methodName, String firstElement, String secondElement)
	{
		Assert.assertTrue(error instanceof MismatchOperationTypeError);
		MismatchOperationTypeError operationTypeError = (MismatchOperationTypeError) error;
		Assert.assertEquals(className, operationTypeError.getClassName());
		Assert.assertEquals(methodName, operationTypeError.getMethodName());
		Assert.assertEquals(firstElement, operationTypeError.getFisrtElement());
		Assert.assertEquals(secondElement, operationTypeError.getSecondElement());
	}
	
	private void assertUnbooleanConditionError(Error error, String className, String methodName, String variableName)
	{
		Assert.assertTrue(error instanceof UnbooleanConditionError);
		UnbooleanConditionError conditionError = (UnbooleanConditionError) error;
		Assert.assertEquals(className, conditionError.getClassName());
		Assert.assertEquals(methodName, conditionError.getMethodName());
		Assert.assertEquals(variableName, conditionError.getVariableName());
	}
	
	private void assertIndexTypeError(Error error, String className, String methodName, String arrayName, String indexName)
	{
		Assert.assertTrue(error instanceof IndexTypeError);
		IndexTypeError indexError = (IndexTypeError) error;
		Assert.assertEquals(className, indexError.getClassName());
		Assert.assertEquals(methodName, indexError.getMethodName());
		Assert.assertEquals(arrayName, indexError.getArrayName());
		Assert.assertEquals(indexName, indexError.getIndexName());
	}
	
	private void assertConditionElementTypeError(Error error, String className, String methodName, String variableName)
	{
		Assert.assertTrue(error instanceof ConditionElementTypeError);
		ConditionElementTypeError equalityError = (ConditionElementTypeError) error;
		Assert.assertEquals(className, equalityError.getClassName());
		Assert.assertEquals(methodName, equalityError.getMethodName());
		Assert.assertEquals(variableName, equalityError.getVariableName());
	}
	
	private void assertPrintParameterTypeError(Error error, String className, String methodName, String variableName)
	{
		Assert.assertTrue(error instanceof PrintParameterTypeError);
		PrintParameterTypeError printError = (PrintParameterTypeError) error;
		Assert.assertEquals(className, printError.getClassName());
		Assert.assertEquals(methodName, printError.getMethodName());
		Assert.assertEquals(variableName, printError.getVariableName());
	}
}

package compiler.errors;

public class UndefinedVariableError extends VariableError 
{
	public UndefinedVariableError(String className, String methodName, String variableName) 
	{
		super(className, methodName, variableName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : variable %2s has not been declared." , 
							  super.toString(), getVariableName());
	}
}

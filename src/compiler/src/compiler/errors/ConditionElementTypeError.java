package compiler.errors;

public class ConditionElementTypeError extends VariableError 
{
	public ConditionElementTypeError(String className, String methodName, String variableName)
	{
		super(className, methodName, variableName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : Invalid type of '%2s' in '==' operator; only characters and integers types are valid.", 
							 super.toString(), getVariableName()); 
	}
}

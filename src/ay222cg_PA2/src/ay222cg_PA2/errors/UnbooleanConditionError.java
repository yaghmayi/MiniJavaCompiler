package ay222cg_PA2.errors;

public class UnbooleanConditionError extends VariableError
{
	public UnbooleanConditionError(String className, String methodName, String variableName)
	{
		super(className, methodName, variableName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : %2s as a condition in If/Wile statement should be boolean.", 
							 super.toString(), getVariableName()); 
	}

}

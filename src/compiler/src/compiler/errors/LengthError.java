package compiler.errors;

public class LengthError extends VariableError
{
	public LengthError(String className, String methodName, String variableName) 
	{
		super(className, methodName, variableName);
	}
	
	public String toString()
	{
		return String.format("%1s : %2s.length is invalid. length method could be call only for String or int[] type.", 
							 super.toString(), getVariableName()); 
	}

}

package compiler.errors;

public class MismatchMethodParametersSizeError extends CallMethodError 
{
	public MismatchMethodParametersSizeError(String className, String methodName, String targetClassName, String targetMethodName)
	{
		super(className, methodName, targetClassName, targetMethodName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : %2s.%3s method was called with mismatch parameter size.", 
				  			 super.toString(), targetClassName, targetMethoName);
	}
}

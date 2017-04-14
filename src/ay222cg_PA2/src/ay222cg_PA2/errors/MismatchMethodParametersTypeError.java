package ay222cg_PA2.errors;

public class MismatchMethodParametersTypeError extends  CallMethodError
{
	public MismatchMethodParametersTypeError(String className, String methodName, String targetClassName, String targetMethodName)
	{
		super(className, methodName, targetClassName, targetMethodName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : %2s.%3s method was called with mismatch parameter type.", 
				  			 super.toString(), targetClassName, targetMethoName);
	}
}

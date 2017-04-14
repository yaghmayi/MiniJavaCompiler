package compiler.errors;

public class UndefienedMethodError extends CallMethodError
{
	public UndefienedMethodError(String className, String methodName, String targetClassName, String targetMethodName)
	{
		super(className, methodName, targetClassName, targetMethodName);
	}
	
	public String toString()
	{
		return String.format("%1s : %2s method was not declared in class %3s.", 
							  super.toString(), targetMethoName, targetClassName);
	}
}

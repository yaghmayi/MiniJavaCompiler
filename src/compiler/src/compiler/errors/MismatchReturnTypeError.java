package compiler.errors;

public class MismatchReturnTypeError extends Error
{
	private String methodType;
	private String returnType;
	
	public String getMethodType()
	{
		return methodType;
	}
	
	public String getReturnType()
	{
		return returnType;
	}
	
	public MismatchReturnTypeError(String className, String methodName, String methodType, String returnType)
	{
		super(className, methodName);
		
		this.methodType = methodType;
		this.returnType = returnType;
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : Return type %2s is not match with method type %3s.", 
							  super.toString(), returnType, methodType); 
	}
}

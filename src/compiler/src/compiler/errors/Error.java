package compiler.errors;

public class Error 
{	
	protected String className;
	protected String methodName;
	
	public String getClassName()
	{
		return className;
	}
	
	public String getMethodName()
	{
		return methodName;
	}
	
	public Error(String className, String methodName)
	{
		this.className = className;
		this.methodName = methodName;
	}
	
	public String toString()
	{
		String positionError = className;
		if (methodName != null)
			positionError += "." + methodName;
		
		return String.format("%1s -> %2s", this.getClass().getSimpleName(), positionError);
	}
}

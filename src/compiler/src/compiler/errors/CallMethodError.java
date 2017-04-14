package compiler.errors;

public abstract class CallMethodError extends Error
{
	protected String targetClassName;
	protected String targetMethoName;
	
	public String getTargetClassName()
	{
		return targetClassName;
	}
	
	public String getTargetMethodName()
	{
		return targetMethoName;
	}
	
	public CallMethodError(String className, String methodName, String targetClassName, String targetMethodName)
	{
		super(className, methodName);
		this.targetClassName = targetClassName;
		this.targetMethoName = targetMethodName;
	}
}

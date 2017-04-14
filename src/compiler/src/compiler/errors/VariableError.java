package compiler.errors;

public abstract class VariableError extends Error 
{
	private String variableName;
	
	public String getVariableName()
	{
		return this.variableName;
	}
	
	public VariableError(String className, String methodName, String variableName)
	{
		super(className, methodName);
		this.variableName = variableName;
	}
}

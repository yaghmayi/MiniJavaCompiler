package ay222cg_PA2.errors;

public class UndefinedClassError extends VariableError
{
	public UndefinedClassError(String className, String methodName, String undefinedName)
	{
		super(className, methodName, undefinedName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : Class %2s has not been decraled.", 
				 			 super.toString(), getVariableName()); 
	}
}

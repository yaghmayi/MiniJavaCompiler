package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class ObjMethodCallStr implements IInstructionBox
{
	private String className;
	private String methodName;
	List<OperationStr> callParams = new ArrayList<>();

	public ObjMethodCallStr(String className, String methodName) 
	{
		this.className = className;
		this.methodName = methodName;
	}

	public String getClassName() 
	{
		return className;
	}

	public String getMethodName() 
	{
		return methodName;
	}
	
	public String getFullName()
	{
		return this.className + "." + this.methodName;
	}
	
	public void addCallParam(OperationStr callParam)
	{
		this.callParams.add(callParam);
	}
	
	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		for (int i=callParams.size()-1; i>=0;i--)
			instructions.addAll(callParams.get(i).createInstructions());
		
		instructions.add(new Instruction(ICodes.InvokeVirtual, this.getFullName()));
		
		return instructions;
	}

	@Override
	public String toString() 
	{
		String str = this.className + "." + methodName + "(";
		
		String paramsStr = "";
		for (OperationStr callParam : callParams)
			paramsStr += callParam.toString()  + ", ";
		
		if (paramsStr != "")
			paramsStr = paramsStr.substring(0, paramsStr.length() - ", ".length());
		
		str += paramsStr + ")";
		
		return str;
	}
}

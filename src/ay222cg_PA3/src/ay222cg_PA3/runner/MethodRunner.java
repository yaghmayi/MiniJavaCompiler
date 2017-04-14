package ay222cg_PA3.runner;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.Instruction;
import ay222cg_PA3.codeGeneration.Method;

public class MethodRunner implements IRunner
{
	private Method method;
	private int currentInstuctIndex;
	private List<Integer> variables = new ArrayList();
	private ClassFileRunner classFileRunner;
	private MethodRunner parentMethodRunner;
	
	public MethodRunner(ClassFileRunner classFileRunner, Method method) 
	{
		this.classFileRunner = classFileRunner;
		this.method = method;
		currentInstuctIndex = 0;
	}
	
	public String getMethodName()
	{
		return this.method.getName();
	}
	
	public MethodRunner getParentMethodRunner() 
	{
		return parentMethodRunner;
	}

	public void setParentMethodRunner(MethodRunner parentMethodRunner) 
	{
		this.parentMethodRunner = parentMethodRunner;
	}
	
	public void setVariable(int index, int value)
	{
		while (this.variables.size() <= index)
			this.variables.add(0);
		
		this.variables.set(index, value);
	}
	
	public int getVariable(int index)
	{
		return this.variables.get(index);
	}

	public ClassFileRunner getClassFileRunner() 
	{
		return this.classFileRunner;
	}

	@Override
	public void run() 
	{
//		System.out.println(this.toString());
		while (currentInstuctIndex < this.method.getInstructionsSize())
		{
			Instruction instruction = this.method.getInstruction(currentInstuctIndex);
			currentInstuctIndex++;
			
			InstructionRunner instructionRunner = new InstructionRunner(this,  instruction);
			instructionRunner.run();
		}
		if (this.parentMethodRunner != null)
			this.parentMethodRunner.run();
	}
	
	public void jumpTo(int instructionIndex)
	{
		currentInstuctIndex = instructionIndex;
	}
	
	public void jumptoEnd()
	{
		currentInstuctIndex = this.method.getInstructionsSize();
	}

	@Override
	public String toString() 
	{
		String str = this.getMethodName() + "\n";
		String vars = "Variables: " + variables.toString();
		String stack = "Stack: " + this.classFileRunner.toString();
		
		str += "\t" + vars + "\n\t" + stack;
		
		return str;
	}
	
	
}

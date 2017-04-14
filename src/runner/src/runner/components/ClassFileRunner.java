package runner.components;

import java.util.Stack;

import ay222cg_PA3.codeGeneration.ClassFile;
import ay222cg_PA3.codeGeneration.Method;

public class ClassFileRunner implements IRunner
{
	private Stack<Integer> stack = new Stack<Integer>();
	private ClassFile classFile;

	public ClassFileRunner(ClassFile classFile) 
	{
		this.classFile = classFile;
	}

	public void push(int val)
	{
		this.stack.add(val);
	}
	
	public int pop()
	{
		return this.stack.pop();
	}
	
	public ClassFile getClassFile() 
	{
		return classFile;
	}

	@Override
	public void run()
	{
		Method mainMethod = classFile.getMainMethod();
		
		if (mainMethod != null)
		{
			MethodRunner mainMethodRunner = new MethodRunner(this, mainMethod);
			mainMethodRunner.run();
		}
	}

	@Override
	public String toString() 
	{
		return "Stack: " + this.stack.toString();
	}
	
	
}

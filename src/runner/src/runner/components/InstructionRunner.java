package runner.components;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;
import ay222cg_PA3.codeGeneration.Method;

public class InstructionRunner implements IRunner
{
	private MethodRunner methodRunner;
	private Instruction instruction;
	
	public InstructionRunner(MethodRunner methodRunner, Instruction instruction) 
	{
		this.methodRunner = methodRunner;
		this.instruction = instruction;
	}
	
	@Override
	public void run()
	{
//		this.instruction.print();
		ClassFileRunner classRunner = this.methodRunner.getClassFileRunner();
		ICodes icode = this.instruction.getCode();
		if (icode.equals(ICodes.ILoad))
			classRunner.push(getVariableValue());
		else if (icode.equals(ICodes.IConst))
			classRunner.push(getConstValue());
		else if (icode.equals(ICodes.IStore))
			this.methodRunner.setVariable(getVariableIndex(), classRunner.pop());
		else if (icode.equals(ICodes.Print))
			System.out.println(classRunner.pop());
		else if (icode.equals(ICodes.IAdd) || icode.equals(ICodes.ISub) || icode.equals(ICodes.IMul) || icode.equals(ICodes.IDiv) 
				|| icode.equals(ICodes.ILt) || icode.equals(ICodes.IEq) || icode.equals(ICodes.IAnd) || icode.equals(ICodes.IOr))
		{
			int v1 = classRunner.pop();
			int v2 = classRunner.pop();
			if (icode.equals(ICodes.IAdd))
				classRunner.push(v2 + v1);
			else if (icode.equals(ICodes.ISub))
				classRunner.push(v2 - v1);
			else if (icode.equals(ICodes.IMul))
				classRunner.push(v2 * v1);
			else if (icode.equals(ICodes.IDiv))
				classRunner.push(v2 / v1);
			else if (icode.equals(ICodes.ILt))
				classRunner.push((v2 < v1) ? 1 : 0);
			else if (icode.equals(ICodes.IEq))
				classRunner.push((v2 == v1) ? 1 : 0);
			else if (icode.equals(ICodes.IAnd))
				classRunner.push((v2 * v1 == 0) ? 0 : 1);
			else if (icode.equals(ICodes.IOr))
				classRunner.push((v2 + v1 == 0) ? 0 : 1);
		}
		else if (icode.equals(ICodes.INot))
		{
			int v = classRunner.pop();
			classRunner.push((v == 0) ? 1 : 0);
		}
		else if (icode.equals(ICodes.If_false))
		{
			int v = classRunner.pop();
			if (v == 0)
				this.methodRunner.jumpTo(Integer.parseInt(getArgument()));
		}
		else if (icode.equals(ICodes.Goto))
			this.methodRunner.jumpTo(Integer.parseInt(getArgument()));
		else if (icode.equals(ICodes.IReturn))
		{
//			System.out.println("End of " + this.methodRunner.getMethodName());
			this.methodRunner.jumptoEnd();
		}
		else if (icode.equals(ICodes.Stop))
			System.out.println("End of main");
		else if (icode.equals(ICodes.InvokeVirtual))
		{
			String methodName = getArgument();
			Method invokedMethod = classRunner.getClassFile().getMethod(methodName);
			MethodRunner invokedMethodRunner = new MethodRunner(classRunner, invokedMethod);
			invokedMethodRunner.setParentMethodRunner(this.methodRunner);
			invokedMethodRunner.run();
		}
	}
	
	private int getVariableValue()
	{
		int varIndex = getVariableIndex();
		int varValue = this.methodRunner.getVariable(varIndex);
		
		return varValue;
	}
	
	private int getVariableIndex()
	{
		String varAddress = getArgument();
		int varIndex = Integer.parseInt(varAddress.replace("#", ""));
		
		return varIndex;
	}
	
	private String getArgument()
	{
		return this.instruction.getArgument().toString();
	}
	
	private int getConstValue()
	{
		int constValue = Integer.parseInt(this.instruction.getArgument().toString());
		
		return constValue;
	}
}

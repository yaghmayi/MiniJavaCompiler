package ay222cg_PA3.codeGeneration;

import java.util.ArrayList;
import java.util.List;

public class Method 
{
	private List<Instruction> instructions = new ArrayList<Instruction>();
	private String name;
	
	public Method(String methodName)
	{
		this.name = methodName;
	}
	
	public int getInstructionsSize() 
	{
		return instructions.size();
	}

	public String getName()
	{
		return this.name;
	}
	
	public Instruction getInstruction(int index)
	{
		return this.instructions.get(index);
	}
	
	public void AddInstructions(List<Instruction> instructions)
	{
		this.instructions.addAll(instructions);
	}
	
	public void AddInstruction(Instruction instruction)
	{
		this.instructions.add(instruction);
	}
	
	public void print()
	{
		System.out.println(this.getName());
		
		int i = 0;
		for (Instruction instruction : instructions)
		{
			System.out.print(i + "\t");
			instruction.print();
			
			i++;
		}
	}
	
	@Override
	public String toString()
	{
		String s = this.name + "\n";
		
		int i = 0;
		for (Instruction ins : this.instructions)
		{
			s += i + "\t" + ins.toString();
			s += "\n";
			i++;
		}
		return s;
	}
}

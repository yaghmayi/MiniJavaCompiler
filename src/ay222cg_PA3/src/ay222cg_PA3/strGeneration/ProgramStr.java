package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

public class ProgramStr 
{
	private List<ClassStr> classes = new ArrayList<ClassStr>();
	
	public void addClass(ClassStr clazz)
	{
		classes.add(clazz);
	}
	
	public List<ClassStr> getClasses() {
		return classes;
	}

	@Override
	public String toString()
	{
		String str = "";
		
		for (ClassStr clazz : classes)
			str += clazz.toString() + "\n";
		
		return str;
	}
	
	public void Print()
	{
		System.out.println(this.toString());
	}
}

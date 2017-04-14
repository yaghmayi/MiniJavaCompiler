package ay222cg_PA3.codeGeneration;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ClassFile 
{
	private List<Method> methods = new ArrayList<Method>();
	
	public Method getMainMethod()
	{
		if (methods.size() > 0)
			return methods.get(0);
		else
			return null;
	}
	
	public Method getMethod(String methodName)
	{
		for (Method m : methods)
		{
			if (m.getName().equals(methodName))
				return m;
		}
		
		return null;
	}
	
	public void addMethod(Method method)
	{
		this.methods.add(method);
	}
	
	public void print()
	{
		for (Method m : methods)
		{
			m.print();
			System.out.println();
		}
	}
	
	public void save(String filePath) 
	{
		try
		{
			PrintStream out = new PrintStream(new File(filePath));
			out.println(this.toString());
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	@Override
	public String toString()
	{
		String s = "";
		for (Method m : methods)
		{
			s += m.toString();
			s += "\n";
		}
		
		return s;
	}
}

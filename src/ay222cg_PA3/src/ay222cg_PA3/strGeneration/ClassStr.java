package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

public class ClassStr 
{
	private String name;
	private List<MethodStr> methods = new ArrayList<>();
	
	public ClassStr(String name) 
	{
		this.name = name;
	}

	public List<MethodStr> getMethods() 
	{
		return methods;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void addMethod(MethodStr method)
	{
		this.methods.add(method);
	}
	
	@Override
	public String toString()
	{
		String str = this.name + "\n";
		
		for (MethodStr method : methods)
			str += method.toString() + "\n";
		
		return str;
	}
}

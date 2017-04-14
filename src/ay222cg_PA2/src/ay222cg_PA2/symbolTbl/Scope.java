package ay222cg_PA2.symbolTbl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope 
{
	private int next = 0; 
	private Scope parent; 
	private List<Scope> children = new ArrayList<Scope>(); 
	private Map<String, Record> records = new HashMap<String, Record>(); 
	
	private ScopeTypes scopeType = null;
	private String scopeName;
	
	public Map<String, Record> getRecords()
	{
		return records;
	}
	
	public ScopeTypes getScopType()
	{
		return this.scopeType;
	}
	
	public String getScopName()
	{
		return this.scopeName;
	}
	
	public Scope(Scope parent, String name)
	{
		this.parent = parent;
		this.scopeName = name;
		
		if (parent == null)
			scopeType = ScopeTypes.Program;
		else if (parent.scopeType == ScopeTypes.Program)
			scopeType = ScopeTypes.Class;
		else if (parent.scopeType == ScopeTypes.Class)
			scopeType = ScopeTypes.Method;
	}
	
	public Scope getParent()
	{
		return this.parent;
	}
	
	public Scope nextChild(String scopeName) 
	{ //Creates new children on demand
		Scope nextC = null;
		if (next >= children.size()) 
		{ //Child does not exist
			nextC = new Scope(this, scopeName); // ==> create new Scope
			children.add(nextC);
		}
		else //Child exists
			nextC = (Scope) children.get(next); // ==> visit child
		next++;
		return nextC;
	} //.... remaining methods
	
	public Record lookup(String key) 
	{
		if (records.containsKey(key)) //Check if in current scope
			return (Record) records.get(key);
		else 
		{ //Move to enclosing/parent scope
			if (parent == null)
				return null; // Identifier not in table
			else
				return parent.lookup(key); // Delegate request to enclosing scope
		}
	}
	
	public void resetScope() 
	{ // Must be called after 
		next = 0;
		for (int i=0;i<children.size();i++)
		((Scope)children.get(i)).resetScope();
	}
	
	public void put(String key, Record record)
	{
		records.put(key, record);
	}
	
	public void printScope()
	{
		Scope programScope = this;
		
		for (String classkey : programScope.getRecords().keySet())
		{
			String className = programScope.getRecords().get(classkey).getName();
			System.out.println(className);
			Scope classScope = programScope.getChildScope(className);
			
			for (String mKey : classScope.getRecords().keySet())
			{
				Record r = classScope.records.get(mKey);
				if (r instanceof VariableRecord)
				{
					VariableRecord vr = (VariableRecord) r;
					System.out.println("\t" + vr.getType() + " " + vr.getName());
				}
				if (r instanceof MethodRecord)
				{
					MethodRecord mr = (MethodRecord) r;
					String methodName = mr.getName();
					System.out.print("\t" + methodName);
					String params = "";
					for (ParameterRecord pr : mr.getParameters())
						params += pr.getType() + " " + pr.getName() + ", ";
					if (params != "")
						params = params.substring(0, params.length() - ", ".length());
					System.out.println("(" + params + ")");
					
					Scope methodScope = classScope.getChildScope(methodName);
					
					for (String vKey : methodScope.getRecords().keySet())
					{
						String varName = methodScope.getRecords().get(vKey).getName();
						System.out.println("\t\t" + varName);
					}
				}
			}
		}
	}
	
	public boolean containsRecord(String key)
	{
		return getRecords().containsKey(key);
	}
	
	public Record getRecord(String key)
	{
		if (containsRecord(key))
			return getRecords().get(key);
		else
			return null;
	}
	
	public Scope getChildScope(String childScopeName)
	{
		for (int i=0; i< children.size();i++)
		{
			if (children.get(i).scopeName.equals(childScopeName))
				return children.get(i);
		}
		
		return null;
	}
}

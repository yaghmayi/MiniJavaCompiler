package ay222cg_PA2.symbolTbl;

public class SymbolTable 
{
	private Scope root; 
	private Scope current; 
	
	public Scope getCurrentScope()
	{
		return current;
	}
	
	public SymbolTable() 
	{
		root = new Scope(null, null); 
		current = root; 
	}
	
	public void enterScope() 
	{
		enterScope(null);
	}
	
	public void enterScope(String scopeName) 
	{
		current = current.nextChild(scopeName);
	}
	
	public void exitScope() 
	{ 
		current = current.getParent();
	}
	
	public void put(String key, Record item) 
	{ 
		current.put(key,item);
	}
	
	public boolean containsKey(String key)
	{
		return current.lookup(key) != null;
	}
	
	public Record lookup(String key) 
	{
		return current.lookup(key); 
	}
	
	public void printTable() 
	{ 
		root.printScope(); 
	} // Diagnostics
	
	public void resetTable()
	{ 
		root.resetScope(); 
	} // After each traversal
}

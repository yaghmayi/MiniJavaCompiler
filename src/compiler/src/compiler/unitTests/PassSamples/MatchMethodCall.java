class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MatchMethodCall
{
    boolean Test()
    {
       int i = 0;
       String s = "hello";
       String str = this.foo(i, s);
//       str = this.foo(4, "good bye")
       
       Helper hp = new Helper();
       boolean flag = hp.help();
       i = hp.self(i);
       
       return true;
    }
    
    String foo(int x, String s)
    {
    	if (x > 1)
    		x = x + 1;
    	
    	return s;
    }
}

class Helper
{
	boolean help()
	{
		return true;
	}
	
	int self(int j)
	{
		return j;
	}
}
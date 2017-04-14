class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MismatchAssignType
{
	int size;
	boolean flag;
	
    int Test(int j)
    {
    	Foo f = new Foo();
    	Helper h = new Helper();
    	
    	j = f.send();
    	size = f.send();
    	size = h.size; 
    	flag = h.help(); 
    }
}

class Helper
{
	int size;
	String hStr;
	
	boolean help()
	{
		return true;
	}
}

class Foo
{
	String fStr;
	
	int send()
	{
		return 0;
	}
}


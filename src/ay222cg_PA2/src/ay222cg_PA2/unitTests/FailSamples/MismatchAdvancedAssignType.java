class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MismatchAdvancedAssignType
{
	int[] size;
	
    int Test(int j)
    {
    	Foo f = new Foo();
    	Helper h = new Helper();
    	
    	size = f.send(); //Error-0
    	size = h.help(); //Error-1
    }
}

class Helper
{
	boolean help()
	{
		return true;
	}
}

class Foo
{
	int send()
	{
		return 0;
	}
}


class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MismatchAssignType
{
    int Test(int j)
    {
    	boolean flag = j; //Error-0
    	String s1 = flag; //Error-1
    	String s2 = "test";
    	flag = s1 + s2; //Error-2
    	
    	Helper h1 = new Helper();
    	Foo f1 = h1; //Error-3
    	
    	int[] arr = s1; //Error-4
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


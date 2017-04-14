class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MatchAssignType
{
    int Test(int j)
    {
    	int i = j;
    	
    	String s1 = "Hello";
    	String s2 = " world.";
    	String s3 = s1 + s2;
    	
    	Helper h1 = new Helper();
    	Helper h2 = h1;
    	
    	int[] arr1;
    	int[] arr2 = arr1;
    }
}

class Helper
{
	boolean help()
	{
		return true;
	}
}


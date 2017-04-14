class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}


class IncorrectArray
{
	int[] number;
	
    int Test(String s)
    {
       int i = number[s]; //Error-0
       i = arr[s]; //Error-1
       i = number[index]; //Error-2
       
       return i;
    }
}


class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}


class DefinedVariable
{
	int size;
	int[] number;
	
    int Test(int index)
    {
       int i = size + 1;
       index = i;
       i = number[index];
       
       return index;
    }
}


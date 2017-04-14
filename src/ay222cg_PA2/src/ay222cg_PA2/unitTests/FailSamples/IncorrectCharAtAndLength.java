class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}


class IncorrectCharAtAndLength
{
    char Test(boolean flag)
    {
       int i = 5;
       i = flag.length(); //Error-0
       
       char c = i.charAt(0); //Error-1
    		   
       return c;
    }
}
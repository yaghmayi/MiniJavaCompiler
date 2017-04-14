// A test program for TinyJava

class Sum {
  public static void main(String[] a){
	 System.out.println(new Test().find(10));
  }
}

class Test 
{
  boolean find(int num) 
  {
     boolean found = false;
     int i = 0;
     while (!found)
     {
    	 i = i + 1;
    	 if (i == num)
    		 found = true;
     }
     
     return found;
  }
}

package Module2;

public class Excepton_handling {

	public static void main(String[] args) 
	{
       try 
       {
    	int c=1/1;   
    	System.out.println(c);
       }
	  catch(Exception a1)
	{
		System.out.println("Handled the exception");
	}
	    finally
	    {
	    	System.out.println("Closing the program");
	    }
	}
}

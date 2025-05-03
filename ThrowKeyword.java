package Module2;

public class ThrowKeyword {

	public static void main(String[] args) throws NullPointerException,ArithmeticException
	{
      if(1==1)
      {
    	  throw new NullPointerException("Sorry you are fetching an empty cell");
    	  
      }
      else
      {
    	  throw new ArithmeticException("infinity cannot be storedin datatype");
      }
	}

}

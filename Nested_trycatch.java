package Module2;

public class Nested_trycatch {
	
	public static void main(String[] args)

	{
		int[] numbers = {1, 2, 3};
        String str = null;

        try {
            
            System.out.println("Accessing array: " + numbers[3]); // This will throw ArrayIndexOutOfBoundsException

            try {
               
                System.out.println("Length of string: " + str.length()); // This will throw NullPointerException
                
            } catch (NullPointerException e) 
            
            {
            	
                System.out.println("Caught NullPointerException:");
            }

        } 
        
        catch (ArrayIndexOutOfBoundsException e) 
        
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException:");
        }

        System.out.println("Program continues after handling exceptions.");
    }
		
	}


package Module2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
				System.out.println("Enter value of i");       
  	try
  	{
  	   int i= s1.nextInt(); 
     
    	   System.out.println("No Exception"); 
       }
  	
  	catch(InputMismatchException a1)
  	{
  		System.out.println("Handled the exception");
  	}
	}
}
 

       
    	 



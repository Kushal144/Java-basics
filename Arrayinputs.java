package Module2;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinputs {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String[] a=new String[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value"+i);
			
			a[i]=s1.next();
		}
		System.out.println(Arrays.toString (a));
		
		s1.close();
	}

}

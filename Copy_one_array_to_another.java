package Module2;

import java.util.Arrays;

public class Copy_one_array_to_another {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int b[]=new int[5];
		
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=5;
		a[4]=6;	
		
		for (int i=0;i<5;i++)
		{		
			System.out.println("first array");
			System.out.println(a[i]);
			b[i]=a[i];
			
		System.out.println("Second Array");
		System.out.println(b[i]);
		
		}
	}
	
}


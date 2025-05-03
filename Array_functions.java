package Module2;

import java.util.Arrays;

public class Array_functions {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		String b="Kushal";
		
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=5;
		a[4]=6;	
		
		String s1=Arrays.toString(a);
		System.out.println(s1);
		
		char b1[]=b.toCharArray();
		Arrays.sort(b1);
		System.out.println(b1);
		
		
		

	}

}

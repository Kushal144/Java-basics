package Module2;

import java.util.Arrays;

public class arrays_equal {

	public static void main(String[] args) {
		int array1[]=new int [5];
		int array2[]=new int[5];
		
		 array1[0]=5;
		 array1[1]=6;
		 array1[2]=7;
		 array1[3]=8;
		 array1[4]=9;
		 
		 array2[0]=5;
		 array2[1]=6;
		 array2[2]=7;
		 array2[3]=8;
		 array2[4]=10;
		 
		 boolean b1=Arrays.equals(array1,array2);
		 System.out.println(b1);
		 
		 if(b1==true)
		 {
			 System.out.println("Strings are equal");
		 }
		 else
		 {
			 System.out.println("Strings are not equal");
		 }
	}
}
	

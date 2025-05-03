package Module2;
import java.util.Scanner;

public class Circumference_of_Triangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the sides of the triangle");
		int a=s1.nextInt();
		int b=s1.nextInt();
	    int c=s1.nextInt();
	    
	    int circumferance= a+b+c;
	    System.out.println("Circumferance is");
	    System.out.println(circumferance);
	    s1.close();
		
	}

}

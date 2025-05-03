package Module2;
import java.util.Scanner;
public class Area_circumferance {
	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
	
		System.out.println("Enter the sides of the Rectangle");
		int a= s2.nextInt();
		int b= s2.nextInt();
		
		System.out.println("Enter the sides of the rectangle");
		
		int a1= s2.nextInt();
		int b1= s2.nextInt();
		
		int circum= 2*a+b;
		double area= a*b;
		
		System.out.println("Circumferance of rectangle is");
		System.out.println(circum);
		System.out.println("Area of Rectangle is");
		System.out.println(area);
		
		s2.close();
	
	
	
	}

}

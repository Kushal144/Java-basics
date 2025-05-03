package Module2;
import java.util.Scanner;
public class area_of_triangle {

	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the sides of the Rectangle");
		double a=s2.nextInt();
		double b=s2.nextInt();
		double area=0.5*a*b;
		System.out.println("Area of triangle is");
		System.out.println(area);
		s2.close();
		

	}

}

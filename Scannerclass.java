package Module2;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of a");
	int a=s1.nextInt();
	
	int area=a*a;
	
	System.out.println("Area of circle");
	System.out.println(area);
	s1.close();
	
	}
}

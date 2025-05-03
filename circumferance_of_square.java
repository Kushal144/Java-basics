package Module2;
import java.util.Scanner;

public class circumferance_of_square {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of square");
	int a=s1.nextInt();
	int circum= 4*a;
	System.out.println("circumferance is");
	System.out.println(circum);
	s1.close();

	}

}

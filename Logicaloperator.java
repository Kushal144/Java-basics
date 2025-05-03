package Module2;

public class Logicaloperator {

	public static void main(String[] args) {
		int a=100;
		int b=60;
		
		if((a<80)&&(b!=a))
		{
			System.out.println("and case");
			
			
		}
		
		if((a>b||(b==a)))
		{
			System.out.println("Or case");
		}

	}

}

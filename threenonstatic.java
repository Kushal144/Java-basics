package Module2;

public class threenonstatic {
	
	void addition()
	{
	 System.out.println("addition");
	 
	}
	
	void subtraction()
	{
		System.out.println("Subtraction");

	}
	
	void Multiply()
	{
		System.out.println("Multiply");
	}
		

	public static void main(String[] args) {
		threenonstatic n= new threenonstatic();
		n.addition();
		n.subtraction();
		n.Multiply();

	}

}
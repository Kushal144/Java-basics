package Module2;

public class static_and_nonstatic {

	void addition()
	{
	 System.out.println("1");
	 
	}
	
	void subtraction()
	{
		System.out.println("2");

	}
	
	static void multiply() {
		System.out.println("3");
	
	}
	
	static void Divide() {
		System.out.println("4");
	}
		

	public static void main(String[] args) {
		static_and_nonstatic n= new static_and_nonstatic();
		n.addition();
		n.subtraction();
		multiply();
		Divide();

	}

}

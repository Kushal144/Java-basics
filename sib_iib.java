package Module2;

public class sib_iib {
	
	static
	{
		System.out.println("Sib");
	}
	
	sib_iib()
	{
		super();
		System.out.println("constructor");
	}
	
	{}

	public static void main(String[] args) {
		System.out.println("Main method");
		new sib_iib();
		new sib_iib();

	}

}

package Module2;

public class nonstaticmethod {
	
	void addition()
	{
	 System.out.println("addition");
	}

	public static void main(String[] args) {
		nonstaticmethod n= new nonstaticmethod();
		n.addition();

	}

}

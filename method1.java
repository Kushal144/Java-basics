package Module2;

public class method1
    {
	
	method1(int a, int b)
	{
		
		System.out.println("print 1");
	}
	
	method1()
	
	{
		this(10,20);
		System.out.println("Print2");
	}

	method1(String a)
	{
		this()
;		System.out.println("Print3");
	}
	public static void main(String[] args) {
	
		new method1("Kushal");
	

	}

}

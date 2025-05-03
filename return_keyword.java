package Module2;

public class return_keyword {
	
	static int add()
	{
		int a=100;
		int b=20;
		int c=a+b;
		return c;
	}
	static int sub()
	{
		int a=100;
		int b=20;
		int c=a-b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println(add());
		System.out.println(sub());

	}

}

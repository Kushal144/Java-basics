package Module2;

public class four_non_static_parameter {
	
	void parameter(int a) {
		System.out.println("Method 1");
	}
	
	void parameter(char b) {
		System.out.println("Method 2");
	}
	
	void parameter(String c) {
		System.out.println("mehtod 3");
	}
	
	void parameter(float d){
	    System.out.println("method 4");
		
	}

	public static void main(String[] args) {
	
		four_non_static_parameter f= new four_non_static_parameter();
		{
			f.parameter(100);
			f.parameter('b');
			f.parameter("Kushal");
			f.parameter(3.14567f);
			
			
		}
	}

}

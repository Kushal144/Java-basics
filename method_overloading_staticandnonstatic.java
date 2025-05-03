package Module2;

public class method_overloading_staticandnonstatic {
	
	void a (int a) {
		System.out.println("Nonstatic1");
	}
	
	void b (String a) {
		System.out.println("nonstatic2");
	}

	static void a(double a) {
		System.out.println("Static1");
	}
	
	static void b(float a) {
		System.out.println("Static2");
	}

  public static void main(String[] args) {
	  
	  method_overloading_staticandnonstatic m = new method_overloading_staticandnonstatic();
	  {
		  
		  m.a(100);
		  m.b("Kushal");
		  a(2.4);
		  b(3.14f);
		  
		  
	  }
  }
	
}
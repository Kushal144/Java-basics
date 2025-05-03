package Module2;

public class three_static {
	
	static void a(int a) {
		System.out.println("Static1");
	}
	
	static void a(boolean a) {
		System.out.println("static2");
	}
	
	static void a(float a) {
		System.out.println("Static3");
	}

	public static void main(String[] args) {
		a(100);
		a(false);
		a(3.14f);

	}

}

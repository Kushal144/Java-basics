package Module2;

public class siib_iib {

		    static {
		        System.out.println("Inside Static Initialization Block (SIB)");
		    }

		    {
		        System.out.println("Inside Instance Initialization Block (IIB)");
		    }

		    public siib_iib() {
		        System.out.println("Inside Constructor");
		    }

		    public static void main(String[] args) {
		        System.out.println("Main Method Starts");

		        siib_iib obj1 = new siib_iib();
		        System.out.println("----");

		        siib_iib obj2 = new siib_iib();
		        System.out.println("Main Method Ends");
		    }

	}

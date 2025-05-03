package Module2;
import java.util.ArrayList;
import java.util.List;
public class upcasting {
	

	public static void main(String[] args) 
	{ 
    List<Object> collection = new ArrayList<>();

    collection.add((Object) 42);           // Integer
    collection.add((Object) 'A');          // Character
    collection.add((Object) 3.14);         // Double
    collection.add((Object) "Hello");      // String

 
    System.out.println("Initial Collection: " + collection);

   
    System.out.println("Contains 'Hello': " + collection.contains("Hello"));
    System.out.println("Contains 100: " + collection.contains(100));

    
    collection.remove((Object) 'A'); // 
    System.out.println("After removing 'A': " + collection);

    collection.remove((Object) 3.14); // 
    System.out.println("After removing 3.14: " + collection);

   
    collection.add((Object) "World");
    collection.add((Object) 100);
    System.out.println("After adding 'World' and 100: " + collection);
		
		
		
		

	}

}

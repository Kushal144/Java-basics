package Module2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_methods {

	public static void main(String[] args) 
	{
		Map<String,Integer> m1= new HashMap<String,Integer>();
		m1.put("mouse",1);
		m1.put("keyboard",2);
		m1.put("Monitor",3);
		m1.put("CPU",4);
		m1.put("Speaker",5);
		
		System.out.println(m1);
		System.out.println(m1.get("keyboard"));
		
		for( String s1   :  m1.keySet())  //iterating keys thru keyset
		{
			System.out.println(s1);
		}
		
		for( Integer i1   :  m1.values())  //iterating values thru values
		{
			System.out.println(i1);
		}
		
		for( Entry<String, Integer> s2: m1.entrySet())  //iterating thru both key and values pair using entryset
		{
			System.out.println(s2);
		
	    }
		
		Set<Entry<String,Integer>> s5=  m1.entrySet()   //Iterating both keyvalue set using iiterator
;		Iterator<Entry<String,Integer>>  i5= s5.iterator();
		
		while(i5.hasNext())
		{
			System.out.println(i5.next());
			
			String str = "Hello";
	        System.out.println(str.charAt(10)); // Throws StringIndexOutOfBoundsException to try this code
			
			
		}

}
}
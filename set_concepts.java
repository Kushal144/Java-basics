package Module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set_concepts {

	public static void main(String[] args) 
	{
		Set s1= new HashSet();
		s1.add("Kushal");
	    s1.add("Sun");
		s1.add("moon");
		s1.add("Cloud");
		s1.add("Air");
		s1.add(null);
		System.out.println(s1);
		
		Iterator i2= s1.iterator(); //iterator
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
			
		}
		
	}

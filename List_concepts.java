package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_concepts {

	public static void main(String[] args) 
	{
		List<String> l1= new ArrayList<String>();
		l1.add("Kushal");
		l1.add("Sun");
		l1.add("moon");
		l1.add("Cloud");
		l1.add("Air");
		l1.add(null);
		System.out.println(l1);
		
		Iterator<String> i2= l1.iterator();  //iteratorion using iteratorion
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		ListIterator<String> i3 =  l1.listIterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next()); //iteration using forward direction
		}
	
		while(i3.hasPrevious())
		{
			System.out.println(i3.previous()); //iteration using reverse direction
		}
		
	  
}
}

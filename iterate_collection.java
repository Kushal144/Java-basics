package Module2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterate_collection {

	public static void main(String[] args) 
	{
		Collection<Integer> c1= new ArrayList<Integer>();
		c1.add(74);
		c1.add(95);
		c1.add(99);
		c1.add(45);
		c1.add(67);
		System.out.println(c1);
		
		Collection<Integer> c2= new ArrayList<Integer>();
		
		c2.add(41);
		c2.add(46);
		c2.add(78);
		c2.add(89);
		c2.add(90);
		System.out.println(c2);
		
		c2.addAll(c1);
		System.out.println(c2);
		
		boolean b1=c2.contains(46);
		System.out.println(b1);
		
		boolean b2=c2.containsAll(c1);
		System.out.println(b2);
		
		c2.remove(89);
		System.out.println(c2);
		
		c2.removeAll(c1);
		System.out.println(c2);
		
		boolean b3=c2.isEmpty();
		System.out.println(b3);
		
		c2.clear();
		System.out.println(c2);
		
		boolean b4=c2.equals(c1);
		System.out.println(b4);
		
		int count=c1.size();
		System.out.println(count);
		
		
		System.out.println("Iteration using iterator");
		
		Iterator<Integer> i4=c1.iterator();
		
		//i4.hasNext();
		//i4=next();
		
		while(i4.hasNext())
		{
			System.out.println(i4.next());
		}
		
		
		
	}

	private static Iterator<Integer> next() {
		// TODO Auto-generated method stub
		return null;
	}
		

}

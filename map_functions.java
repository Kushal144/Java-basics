package Module2;

import java.util.HashMap;
import java.util.Map;

public class map_functions {

	public static void main(String[] args) 
	{
	Map<Integer,String> m1= new HashMap<Integer,String>();	
	m1.put(2021, "Kushal");
	m1.put(2022, "Laxmi");
	m1.put(2023, "Prisha");
	m1.put(2024, "Sadhna");
	m1.put(2025, "Sandeep");
	
	System.out.println(m1.get(2021));
	System.out.println(m1.containsValue("Laxmi"));
	System.out.println(m1.containsKey(2023));
	
	System.out.println(m1);
	System.out.println(m1.putIfAbsent(2026,"Vijay"));

	Map<Integer,String> m2= new HashMap<Integer,String>();	
	m2.put(2026, "Karthick");
	m2.put(2027, "Anuradha");
	m2.put(2028, "Ram");
	m2.put(2029, "Ashish");
	m2.put(2030, "Uthit");
	
	System.out.println(m2);
	m2.putAll(m1);
	
	System.out.println(m2);
	
	boolean b1= m1.equals(m2);
	System.out.println(b1);
	
	boolean b2= m2.isEmpty();
	System.out.println(b2);
	
	m2.putIfAbsent(2031, "Kiki");
	System.out.println(m2);
	
	//m2.clear();
	//System.out.println(m2);
	}

}

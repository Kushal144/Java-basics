package Module2;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorclass {

	public static void main(String[] args) 
	{
	Vector v1= new Vector();
	v1.addElement(45);
	v1.addElement(300);
	v1.addElement("Sun");
	v1.addElement("moon");
	v1.addElement("cloud");
    
	Enumeration e1= v1.elements(); //enumeration
	
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	}

}

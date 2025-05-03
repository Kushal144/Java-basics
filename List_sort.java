package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_sort {
	
 public static void main(String[] args) 
 {
	List l1 = new ArrayList();
	l1.add(45);
	l1.add(67);
	l1.add(56);
	l1.add(89);
	l1.add(78);
	l1.add(90);
	l1.add(100);
	
	System.out.println(l1); //before sorting
	
	Collections.sort(l1);
	
	System.out.println(l1);//after sorting
 } 
}

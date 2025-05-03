package Module2;

public class this_keyword {
	
	int rollno1;
	String name1;
	double salary1;
	
	void studentdetails (int rollno,String name,double salary)
	{
		this.salary1 = salary;
	}
	

	public static void main(String[] args) {
	this_keyword t1= new this_keyword();	
	t1.studentdetails(25,"Kushal",36000);
	System.out.println(t1.rollno1);
	System.out.println(t1.name1);
	System.out.println(t1.salary1);
}
}
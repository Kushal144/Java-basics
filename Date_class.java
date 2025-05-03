package Module2;
import java.util.Date;

public class Date_class {

	public static void main(String[] args) 
	{
	 Date d1=new Date();
	
     System.out.println(d1.getTime());	
     
     Date d2=new Date();
     Date d3=new Date(d1.getTime()+(60*60*1000*24*3));//futur date syntax
     Date d4=new Date(d1.getTime()-(60*60*1000*24*3));//Past date syntax
     
     String s1=d2.toString();
     String s2=d3.toString();
     String s3=d4.toString();
     
     System.out.println(d2);
     String year=s1.substring(s1.length()-4);
     String month=s1.substring(4, 7);
     String date=s1.substring(7,10);
     
     String f1= date.concat(month).concat(year);
     System.out.println(f1);
     System.out.println(s2);//future date and time syntax
     System.out.println(s3);//past date syntax
     
	}

}

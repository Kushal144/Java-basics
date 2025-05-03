package Module2;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		
           Thread.sleep(3000);
		}   
		
		URL l1= new URL("https:www.google.com");
		FileInputStream s1= new FileInputStream(//file location);
		
	}

}

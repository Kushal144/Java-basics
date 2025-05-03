package Module2;

public class average_of_array {

	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		double avg=0;
		
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=5;
		
		for(int i=0;i<4;i++)
		{
			sum=sum+a[i];
			avg= sum/a.length;
		}
			
			System.out.println("Average of array is");
			System.out.println(avg);
		}
	}

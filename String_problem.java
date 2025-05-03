package Module2;

public class String_problem {

	public static void main(String[] args) 
	{
		String a="Automation testing";
		String output=a.replace("automation", "Api");
		
		System.out.println(output);
		
		String output1=a.replaceAll("[A-Z]", "");
		System.out.println(output1);
		
		String output2=a.substring(4);
		System.out.println(output2);
		
		Boolean output3=a.matches("(.*)ion(.*)");
		System.out.println(output3);
				
		String output4=a.repeat(2);
		System.out.println(output4);
	}

}

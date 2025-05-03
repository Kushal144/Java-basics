package Module2;

public class sting_problem_3 {

	public static void main(String[] args) 
	{
	 String s1= "Automati@n Testing0047";
	 int alphabets = 0,digits = 0,special_character = 0,white_spaces=0;
	 
	 for(int i=0;i<s1.length();i++)
	 {
		 char ch=s1.charAt(i);
	 
	 if(Character.isLetter(ch))
	 {
		 
		 alphabets++;
		 
	 }
		 else if(Character.isDigit(ch))
		 { 
			 digits++;
		 }
			 else if(Character.isWhitespace(ch))
			 
		 {
			 white_spaces++;
			
		 }
			 
		 else {
			 special_character++;
			
		 }
		 
	 }
	 
	 System.out.println("alphabets: "  +alphabets);
	 System.out.println("digits: "  +digits);
	 System.out.println("white_spaces: "  +white_spaces);
	 System.out.println("special_character: "  +special_character);
	}
}

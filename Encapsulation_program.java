package Module2;

class Sensitiveinfo
{
	private String username="www.google.com";
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;

}
	
private int OTP=1234;
	
	public int getOTP() {
		return OTP;
	}

	public void setOTP(int OTP) {
		this.OTP = OTP;
	
}
public class Encapsulation_program {

	public static void main(String[] args) 
	{
		Sensitiveinfo s1=new Sensitiveinfo();
		s1.setUsername("kushalsinha.001");
		s1.setOTP(2245);
		System.out.println(s1.getUsername());
		System.out.println(s1.getOTP());
	}
}
}


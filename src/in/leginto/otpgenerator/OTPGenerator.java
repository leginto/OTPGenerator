package in.leginto.otpgenerator;

import java.util.Random;

public class OTPGenerator {

	public static void main(String[] args) {
		
		OTP otp = new OTP();
		
		System.out.println(otp.generateOTP(4));
	}

}

class OTP
{
	private final String passwordData = "0123456789";
	public int generateOTP(int length)
	{
		Random ran = new Random();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<length; i++)
		{
			sb.append(passwordData.charAt(ran.nextInt(passwordData.length())));
		}
		
		return Integer.parseInt(sb.toString());
		
	}
}
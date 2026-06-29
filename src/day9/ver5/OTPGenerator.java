package day9.ver5;

import java.util.Random;

public class OTPGenerator {

	public static int generateOTP()
	{
		Random random=new Random();
		int otp=random.nextInt(99999)+100000;  
		return otp;
	}
}

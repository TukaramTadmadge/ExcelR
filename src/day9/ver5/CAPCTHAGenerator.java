package day9.ver5;

import java.util.Random;

public class CAPCTHAGenerator {

	public static String generateCaptcha()
	{
		String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder captcha=new StringBuilder();
		
		for(int i=1;i<=4;i++)//3
		{
			Random random=new Random();			
			int index=random.nextInt(chars.length()-1); //62    0-61
			captcha.append(chars.charAt(index)); //"" "q" "qC
		}
		return captcha.toString();
	}
}

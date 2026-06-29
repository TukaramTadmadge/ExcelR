package day9.ver1;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
//		System.out.println((int)(Math.random()+100000));

		Random random=new Random();
		int otp=random.nextInt(99999)+100000;  
		System.out.println(otp);
	}

}

package day2;

import java.util.Scanner;

public class ArmstrongNumberBetween1To1000 {

	public static void main(String[] args) {
		for(int n1=1;n1<=1000;n1++)
		{
		if (checkArmstrong(n1)) 
			System.out.println(n1 + " number is Armstrong");
		}
	}

	private static boolean checkArmstrong(int n1) {
		int bu = n1;
		int sum = 0;
		int rem = 0;
		while (n1 > 0) 
		{ 
			rem = n1 % 10; 
			sum = sum + (rem * rem * rem); 
			n1 = n1 / 10; 
		}
		if (sum == bu) {
			return true;
		} else {
			return false;
		}

	}

}

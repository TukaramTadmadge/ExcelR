package day1;

import java.util.Scanner;

public class ArmstrongNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n1 = sc.nextInt(); // n1=153

		if (checkArmstrong(n1)) {
			System.out.println(n1 + " number is Armstrong");
		} else {
			System.out.println(n1 + " number is NOT Armstrong");
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

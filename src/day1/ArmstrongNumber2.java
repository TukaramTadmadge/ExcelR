package day1;

import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n1 = sc.nextInt(); // n1=153

		checkArmstrong(n1);
	}

	private static void checkArmstrong(int n1) {
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
			System.out.println(bu + " number is Armstrong");
		} else {
			System.out.println(bu + " number is NOT Armstrong");
		}

	}

}

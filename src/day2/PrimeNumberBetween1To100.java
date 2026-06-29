package day2;

import java.util.Scanner;

public class PrimeNumberBetween1To100 {

	public static void main(String[] args) {
		System.out.println("Prime Numbers between 1 to 100");
		for(int n1=1;n1<=100;n1++)
			if(checkPrime(n1))
				System.out.println(n1);
	}
	
	private static boolean checkPrime(int n1) {
		int counter = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				counter++;
			}
		}

		if (counter == 2) {
			return true;
		} else {
			return false;
		}
	}
}

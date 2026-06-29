package day2;

import java.util.Scanner;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		System.out.println("Prime Numbers are");
		int numbers[]= {7,9,11,20,21,60,97};
		for(int n:numbers)
			if(checkPrime(n))
				System.out.println(n);
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

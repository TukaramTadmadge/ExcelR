package day1;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n1 = sc.nextInt(); // n1=7

		checkPrime(n1);
		
	}

	private static void checkPrime(int n1) {
				int counter = 0;
				for (int i = 1; i <= n1; i++) {
					if (n1 % i == 0) {
						counter++;
					}
				}

				if (counter == 2) {
					System.out.println(n1 + " number is Prime");
				} else {
					System.out.println(n1 + " number is Not Prime");
				}
		
	}
}

//153
//Armstrong number
//  1             5             3
//  1*1*1         5*5*5         3*3*3
//  1        +    125      +    27
//  153

//count sum of digits
//153
//1        5         3
//                     %10

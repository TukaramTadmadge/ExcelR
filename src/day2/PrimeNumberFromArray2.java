package day2;

import java.util.Scanner;

public class PrimeNumberFromArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int numbers[]= new int[size];
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("Enter a number");
			numbers[i] = sc.nextInt();
		}
		
		
		System.out.println("Prime Numbers are");
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

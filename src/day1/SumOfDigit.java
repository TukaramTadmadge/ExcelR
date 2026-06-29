package day1;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n1 = sc.nextInt(); // n1=153
		
		int sum=0;
		int rem=0;
		while(n1>0)						//sum			n1				rem
		{								//0				153				3			is 153>0 true
			rem=n1%10;
			sum=sum+rem;				//3				15				5			is 15>0 true
			n1=n1/10;
		}								//8				1				1			is 1>0 true
		System.out.println(sum);
	
	}									//9				0							is 0>0 false

}

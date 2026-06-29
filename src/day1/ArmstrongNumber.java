package day1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n1 = sc.nextInt(); // n1=153
		int bu=n1;
		int sum=0;
		int rem=0;
		while(n1>0)						//sum			n1				rem							bu
		{								//0				153				3			is 153>0 true	153
			rem=n1%10;					//27			15				5			is 15>0 true
			sum=sum+(rem*rem*rem);		//152			1				1			is 1>0 true
			n1=n1/10;					//153			0							is 0>0 false
		}								
		//System.out.println(sum);	
		if (sum == bu) {
			System.out.println(bu + " number is Armstrong");
		} else {
			System.out.println(bu + " number is Armstrong");
		}
	
	}									

}

//1

//153

//370
//0*0*0 = 0
//7*7*7 = 343
//3*3*3 = 27 
//0+343+27 =370


//371
//1*1*1 = 1
//7*7*7 = 343
//3*3*3 = 27 
//1+343+27 =371

//407
//7*7*7 = 343
//0*0*0 = 0
//4*4*4 = 64 
//343+0+64 =407






package day1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  //syntax to create object in java
											// classname space objectname space = space classname( optional )
		System.out.println("Enter a number");//17
		int n1=sc.nextInt();
		
		if(n1%2==0)
		{
			System.out.println(n1+ " number is Even");
		}
		else
		{
			System.out.println(n1 + " number is Odd");
		}
	}

}

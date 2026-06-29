package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int numerator=sc.nextInt();  //apple  //new InputMismatchException()
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
	
		
		double result=numerator/denominator;  //new ArithmeticExcpetion()
		System.out.println(result);
		}
		catch(InputMismatchException ex1)
		{
			System.out.println("Please enter valid Integer Values only");
			System.exit(0);
		}
		catch(ArithmeticException ex2)
		{
			System.out.println("Please enter valid non zero denominator value");
			System.exit(0);
		}
		
		finally
		{
		System.out.println("Thank You, Visit Again");
		}
	}

}

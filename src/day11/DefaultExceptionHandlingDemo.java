package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DefaultExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int numerator=sc.nextInt();  //apple  //new InputMismatchException()
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
		
		String str=null;
		System.out.println(str.length());
		
		double result=numerator/denominator;  //new ArithmeticExcpetion()
		System.out.println(result);
		}
		catch(InputMismatchException ex1)
		{
			System.out.println("Please enter valid Integer Values only");
		}
		catch(ArithmeticException ex2)
		{
			System.out.println("Please enter valid non zero denominator value");
		}
		
		catch(Exception ex3)
		{
			System.out.println("Some Exception occured");
		}
		
		
		System.out.println("Thank You, Visit Again");
	}

}

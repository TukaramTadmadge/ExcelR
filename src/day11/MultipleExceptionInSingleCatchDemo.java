package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionInSingleCatchDemo {

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
		catch(InputMismatchException | ArithmeticException ex1)
		{
			System.out.println("Please enter valid non zero Integer Values only");
		}
		
		
		System.out.println("Thank You, Visit Again");
	}

}

package day12;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDelegationDemo {

	public static void main(String[] args) 	throws IOException//caller
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");
		int numerator=sc.nextInt();  
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();				//accept the input from user		-caller
		try
		{
		double result=divide(numerator,denominator);							//callee
		System.out.println("Result is " +result);
		}
		catch(ArithmeticException ex1)              //exception handling			   -callee
		{
			System.out.println(ex1.getMessage());  
		}
	}
														//by using throws we delegate the handling of the excep 
														//to the caller
	private static double divide(int numerator,int denominator) throws ArithmeticException,IOException
	{
		return numerator/denominator; 		
	}

}

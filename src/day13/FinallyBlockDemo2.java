package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockDemo2 {

	public static void main(String[] args) {
		
		int result=divide();
		System.out.println(result);    //trace the output of this program??
	}

	private static int divide() {
		try
		{
			double result=10/0;
			return 1;
		}
		catch(ArithmeticException ex1)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

}

//Surendra  3			
//Ashish    
//
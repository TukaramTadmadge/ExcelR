package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
		System.out.println("Enter Numerator");
		int numerator=Integer.parseInt(br.readLine());  //apple  //new InputMismatchException()
		
		System.out.println("Enter Denominator");
		int denominator=Integer.parseInt(br.readLine());
	
		
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
		
		catch(IOException ex3)
		{
			System.out.println("Please enter Valid Data");
		}
		
		
		System.out.println("Thank You, Visit Again");
	}

}

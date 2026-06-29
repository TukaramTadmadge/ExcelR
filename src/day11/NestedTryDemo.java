package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		int arr[]=new int[2];								//0			1
															//100		0
		Scanner sc=new Scanner(System.in);
		try													//scenerio 1 : enter index of numerator : 0 , num=100
		{													// :           enter index of denominator : 1, den=50
															// result = 100/50 = 2
			
															//scenerio 1 : enter index of numerator : 1 , num=50
															// :           enter index of denominator : 0, den=100
															// result = 50/100 = 0.5
			
			
		System.out.println("Enter Number for 0 index"); //Apple
		arr[0]=sc.nextInt();
		
		System.out.println("Enter Number for 1 index");
		arr[1]=sc.nextInt();
		
					try
					{
						System.out.println("Enter Index of Numerator");  //2
						int nIndex=sc.nextInt();	//nIndex=0
						int numerator=arr[nIndex];
						
						System.out.println("Enter Index of Denominator");
						int dIndex=sc.nextInt();	//nIndex=0
						int denominator=arr[dIndex];
						
						double result=numerator/denominator;
					}
					catch(ArithmeticException ex1)
					{
						System.out.println("Please enter a valid non zero denominator");
					}
					catch(ArrayIndexOutOfBoundsException ex2)
					{
						System.out.println("Please enter a valid index");
					}
					
		}
		catch(InputMismatchException ex1)
		{
			System.out.println("Please enter valid integer value only");
		}
		catch(Exception ex2)
		{
			System.out.println("Some Exception occured");
		}
		

	}

}

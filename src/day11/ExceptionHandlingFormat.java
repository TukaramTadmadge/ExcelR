package day11;

public class ExceptionHandlingFormat {

	public static void main(String[] args) {
		int numerator=10;
		int denominator=0;
		
		try
		{
		double result=numerator/denominator;  //new ArithmeticExcpetion()
		System.out.println(result);
		}
		catch(ArithmeticException ex1)
		{
			//System.out.println("Please enter valid denominator");
			System.out.println(ex1.getMessage());  //message of ArithmeticException is "/ by zero"
		}
		
		
		System.out.println("hi");
	}

}

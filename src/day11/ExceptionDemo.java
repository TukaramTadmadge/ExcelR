package day11;

public class ExceptionDemo {

	public static void main(String[] args) {
		int numerator=10;
		int denominator=0;
		
		double result=numerator/denominator;
		
		System.out.println(result);
		
		//          0   1
		int arr[]= {10,20};
		arr[2]=99;  //ArrayIndexOutOfBoundsException
		
//		String str="Alice";
		String str=null;
		System.out.println(str.length());
		
		System.out.println("Hi");

	}

}

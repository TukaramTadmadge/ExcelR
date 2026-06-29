package day3;

public class CallByRefDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30};	//non primitives are passed as ref
		System.out.println("1st Element of Array A =" + arr[0]); 	//1st A = 10
		test(arr);													//2nd B = 10
		System.out.println("1st Element of Array A =" + arr[0]); 	//3rd B = 99
	}																//4th B = 99	

	private static void test(int brr[]) 
	{
		System.out.println("1st Element of Array B =" + brr[0]); //B = 10
		brr[0]=99;
		System.out.println("1st Element of Array B =" + brr[0]); 
	}

}

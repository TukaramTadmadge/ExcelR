package day3;

public class CallByRefDemo2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30};	
		System.out.println("1st Element of Array A =" + arr[0]); 	//1st A = 10
		test(arr[0]);	//primitives are passed as value												//2nd B = 10
		System.out.println("1st Element of Array A =" + arr[0]); 	//3rd B = 99
	}																//4th B = 99	

	private static void test(int brr) 
	{
		System.out.println("1st Element of Array B =" + brr);        //B = 10
		brr=99;
		System.out.println("1st Element of Array B =" + brr); 
	}
}


//objects is Non Primitives
//objects will also be passed as ref
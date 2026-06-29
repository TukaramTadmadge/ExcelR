package day2;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};  //declaration + initialization
		
		//sum of Array Elements
		
		//1. using classical for loop					if you wish to use index in the loop
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		
		
		
		//2 using classical for loop					if you DO NOT wish to use index in the loop
		int sum1=0;
		for (int n:arr) 
		{
			sum1=sum1+n;
		}
				
		System.out.println(sum1);

	}

}

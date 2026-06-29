package day3;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
//		int arr[]= {10,20,30};
//		System.out.println(Arrays.toString(arr));
			//		   0   1   2   3   4   5  6   7   8    9
		//char name[]= {'v','i','r','a','t','k','o','h','l','i'};
		char name[]= {'a','b','b','c','a','d'};  //first non repeating char
		
		String name1=new String(name);	//"virat"
		
		System.out.println(name1);
		System.out.println(Arrays.toString(name));
		
		System.out.println(name[1]);
		System.out.println(name1.charAt(1));		//input ->index   output->value
		
		System.out.println(name1.indexOf('i'));     //input ->value   output->first occurance index
		System.out.println(name1.lastIndexOf('i'));
		
		

		

	}

}

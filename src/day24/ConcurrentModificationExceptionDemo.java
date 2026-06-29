package day24;

import java.util.ArrayList;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers.size());  //5
		
		for(int n:numbers)			//loop is modifying the size of the arraylist which it is iterating
		{
			numbers.add(6);	//FailFirst technique
		}

		System.out.println(numbers.size());  //10

	}

}

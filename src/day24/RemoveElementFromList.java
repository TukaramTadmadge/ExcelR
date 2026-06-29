package day24;

import java.util.ArrayList;

public class RemoveElementFromList {
public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();  //[1,2,3,4,5]   => [2,4]
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	System.out.println("All Numbers Before "+numbers);
	ArrayList<Integer> oddNumbers = new ArrayList<>(); //[1,3,5]
	
	for(int n:numbers)
	{
		if(n%2==1)
			oddNumbers.add(n);
	}
	
	numbers.removeAll(oddNumbers);	
	System.out.println("All Numbers After "+numbers);
	
}
}

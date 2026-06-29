package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperitiveStyleDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		//store the squares of all odd numbers into a seperate list
		
		List<Integer> oddNumbersSquares=new ArrayList();		//step 1 : create the resultant array list
		
		for(int n:numbers)										//step 2 : iterate through the source array
		{
			if(n%2==1)											//step 3 : check if number is odd 
			{
				int sqr=n*n;									//step 4: calculate square of the odd number
				oddNumbersSquares.add(sqr);						//step 5 : add the sqr to the resultant arraylist
			}
		}
		
		for(int n:oddNumbersSquares)							//step 6 : iterate through the resultant arraylist
		{
			System.out.println(n);								//step 7 : display each element
		}
	
	
	}
}

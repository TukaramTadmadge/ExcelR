package day24;

import java.util.concurrent.CopyOnWriteArrayList;

//ArrayList  FailFirst
public class CopyOnWriteArrayListDemo 	//FailSafe
{

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> numbers=new CopyOnWriteArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers.size());  //5
		
		for(int n:numbers)
		{
			numbers.add(6);
		}

		System.out.println(numbers.size());  //10
	}
}
//FailSafe

//Voting

//State
//Constituency 1 voting in progress 	 --> 11 am: Party 100  Party 90  12 noon Party 120  Party 110
//Constituency 1 voting complete         --> result displayed
//Constituency 1 voting 


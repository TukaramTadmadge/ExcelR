package day13;

import java.util.Arrays;

public class CountOfIntegersInAString {

	public static void main(String[] args) {
		String str="my name is Alice i have 2 brothers and 1 sister I am 11 years old";
		String words[]=str.split(" ");
		System.out.println(Arrays.toString(words));
		int counter=0;
		for(String word:words)			//word
		{								//"2"
			try
			{
			int n=Integer.parseInt(word);
			counter++;
			}
			catch(NumberFormatException ex1)
			{
				
			}
		}
		
		System.out.println("Number of Integers are "+counter);

	}

}

package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalStyleDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,13,4,5));
		
		List<Integer> oddNumbersSquares=numbers.stream()		//[1,2,3,4,5]
		.filter(num->num%2==1)	//[1,3,5]filter uses a Predicate, what is Predicate? Predicate is a method which returns a boolean
		.map(num->num*num)						//[1,9,25]
		.toList();
		
		System.out.println(oddNumbersSquares);
		
		numbers.stream()		//[1,2,3,4,5]
				.filter(num->num%2==1)	//[1,3,5]filter uses a Predicate, what is Predicate? Predicate is a method which returns a boolean
				.map(num->num*num)						//[1,9,25]
				.forEach(num->System.out.println(num));
		
		
		List<Double> percentages=new ArrayList(Arrays.asList(91.6,87.5,58.3,78.5,56.9));
		//1. display marks which are greater than 70
		//2. Add 5% grace marks to marks greater than 70 and display new marks
		percentages.stream()
		.filter(per->per>=70.0)
		.forEach(per->System.out.println(per));
		
		percentages.stream()
		.filter(per->per>=70.0) //[91.6,87.5,78.5]
		.map(per->per+5.0)
		.forEach(per->System.out.println(per));
		
													// [ 8 , 7,5,5]  String->Integer
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		//1. display month names which has >= 5 chars
		System.out.println("********************");
		months.stream()
		.filter(month->month.length()>=5)
		.forEach(month->System.out.println("I like "+month));
		
		System.out.println("********************");
		months.stream()
		.filter(FunctionalStyleDemo::checkMonthLength)  //by using method referncing
		.forEach(System.out::println);
		
		
		//multiply each number by 5
		//extract the odd numbers
		//find their sum
		
		
		//sum of all elements		[1,2,3,4,5]		acc=0,1,3,6,10,15
		int sum=numbers.stream()
		.reduce(0,(acc,num)->acc+num);
		
		System.out.println(sum);
		
		
		
		int sum1=numbers.stream()	//[1,2,3,4,5]	
		.map(num->num*5)	//[5,10,15,20,25]	
		.filter(num->num%2==1)	//[5,15,25]	
		.reduce(0,(acc,num)->acc+num);
		
		System.out.println(sum1);
		
		Predicate<Integer> oddFilter=num->num%2==1;
		int sum2=numbers.stream()	//[1,2,3,4,5]	
				.map(num->num*5)	//[5,10,15,20,25]	
				.filter(oddFilter)	//[5,15,25]				//by using Predicate
				.reduce(0,(acc,num)->acc+num);
				
				System.out.println(sum1);
			
		
				
		List<Integer> monthsLengths=months.stream()
		.map(month->month.length())
		.toList();
		System.out.println(monthsLengths);
		
		
		Function<String,Integer> function1=str->str.length();
		List<Integer> monthsLengths1=months.stream()
				.map(function1)
				.toList();
				System.out.println(monthsLengths1);
				
		months.stream()
		.map(month->month.toUpperCase())
		.forEach(month->System.out.println(month));
		
		months.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		months.stream()
		.forEach(System.out::println); //directly terminal operation
		
	}
	
	public static boolean checkMonthLength(String str)
	{
		if(str.length()>=5)
			return true;
		else
			return false;
	}
}

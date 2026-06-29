package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));

		//display the months starting with 'J'

		months.stream()
		.filter(mon->mon.startsWith("J"))
		.forEach(System.out::println);
		//display the count of months starting with 'J'
		long jMonthsCount=months.stream()
		.filter(mon->mon.startsWith("J"))
		.count();
		System.out.println(jMonthsCount);
		
		
		//display length of the largest month  -September   output 9
		
		double maxMonthLength=months.stream()	//[January","February","March","April","Ma...]
		.mapToInt(month->month.length()) //[7,7,5,5...]
		.average()
		.orElse(0.0);
		
		System.out.println(maxMonthLength);
		

	}

}

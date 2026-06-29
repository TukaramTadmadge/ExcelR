package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		// collection - chapter name
		// Collection - parent interface
		// Collections - utility class
		
		ArrayList<Integer> numbers=new ArrayList(Arrays.asList(7,1,8,5,4));
		System.out.println(numbers);
		
		Collections.sort(numbers);
		
		System.out.println(numbers);  //default in asc order
		
		System.out.println(Collections.max(numbers));
		System.out.println(Collections.min(numbers));

	}

}

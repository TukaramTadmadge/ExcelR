package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLengthUsingGroupingBy {

	public static void main(String[] args) {
		String sentance="one two three four five six seven eight nine ten";
		
		String words[]=sentance.split(" "); //[one, two, three, four, five, six, seven, eight, nine, ten]
		
		Map<Integer,List<String>> hashmap=new HashMap();
		
		hashmap=Arrays.stream(words)
		.collect(Collectors.groupingBy(str->str.length()));
		System.out.println(hashmap);
		
		//display the list in upper case
		hashmap=Arrays.stream(words)
		.collect(Collectors.groupingBy(str->str.length(),Collectors.mapping(str->str.toUpperCase(), Collectors.toList())));
		System.out.println(hashmap);
	}

}


/*
{3=[ONE, TWO, THREE, ten], 4=[four, five, nine], 5=[three, seven, eight]}
*/
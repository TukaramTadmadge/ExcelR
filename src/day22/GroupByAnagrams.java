package day22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAnagrams {
public static void main(String[] args) {
	
	String sentance="silent listen note tone cab bca abc apple";
	String words[]=sentance.split(" "); //[silent, listen, note, tone, cab, bca, abc, apple]
	//[ "eilnst" =[silent,listen]     "enot"=[note,tone]   "abc"=[cab,bca,abc]   [apple] ]
	Map<String,List<String>> hashmap=new HashMap();
	
	hashmap=Arrays.stream(words)
	.collect(Collectors.groupingBy(s->{
		char arr[]=s.toCharArray(); //['l','i','s','t','e','n']
		Arrays.sort(arr);
		return new String(arr);
	}));
	
	System.out.println(hashmap);
}

		static public String getString(String s)
		{
			char arr[]=s.toCharArray(); //['l','i','s','t','e','n']
			Arrays.sort(arr);
			return new String(arr);
		}
}

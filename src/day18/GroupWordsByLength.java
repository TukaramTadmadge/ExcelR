package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {
		String sentance="one two three four five six seven eight nine ten";
		Map<Integer,List<String>> hashmap=new HashMap();
		String words[]=sentance.split(" "); //[one, two, three, four, five, six, seven, eight, nine, ten]
		
		for(String word:words)//word ="three"
		{
			int key=word.length();		//key = 5
			hashmap.putIfAbsent(key, new ArrayList());		//skip
			
			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap);
	}

}


/*
B=Map<Integer,List<String>> hashmap=
{
3=[one,two]
5=[three]
}


3=[one,two,six,ten]  
4=[four,five,nine]
5=[three,seven,eight]
}
*/
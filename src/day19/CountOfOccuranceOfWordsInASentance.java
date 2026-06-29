package day19;

import java.util.HashMap;
import java.util.Map;

//sentance = "I am studying java java is a prog lang good prog lang i am also good"
//{"I"=2, "am"=2, "studying"=1, "java"=2, "is"=1 ..}
public class CountOfOccuranceOfWordsInASentance {
public static void main(String[] args) {
	//String str="virat";
	String str="I am studying java java is a prog lang good prog lang i am also good";
	String words[]=str.split(" ");
	Map<String,Integer> map=new HashMap();
	
	for(String word:words)		//ch='p'
	{
		String key=word.toLowerCase();
		map.put(key, map.getOrDefault(key, 0)+1);
	}
	
	System.out.println(map);
}
}

/*
{
'a'=1
'p'=2
'l'=1
'e'=1
}
*/


//stream API  

//Iphone 17		    Arrays
//Iphone 17 pro     Collections(we are here)  Map
//Iphone 17 pro max Streams
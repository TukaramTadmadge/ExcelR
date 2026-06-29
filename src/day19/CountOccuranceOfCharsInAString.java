package day19;

import java.util.LinkedHashMap;
import java.util.Map;

//virat = {'v'=1,'i'=1,'r'=1,'a'=1,'t'=1}
//viratkohli {'v'=1,'i'=2,'r'=1,'a'=1,'t'=1,'k'=1, 'o'=1, 'h'=1}
public class CountOccuranceOfCharsInAString {
public static void main(String[] args) {
	//String str="virat";
	String str="apple";
	Map<Character,Integer> map=new LinkedHashMap();
	
	for(char ch:str.toCharArray())		//ch='p'
	{
		if(map.containsKey(ch))
		{
			map.put(ch, map.get(ch)+1);
		}
		else
		{
			map.put(ch, 1);
		}
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
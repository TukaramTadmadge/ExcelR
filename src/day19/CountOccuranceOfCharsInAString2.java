package day19;

import java.util.LinkedHashMap;
import java.util.Map;

//virat = {'v'=1,'i'=1,'r'=1,'a'=1,'t'=1}
//viratkohli {'v'=1,'i'=2,'r'=1,'a'=1,'t'=1,'k'=1, 'o'=1, 'h'=1}
public class CountOccuranceOfCharsInAString2 {
public static void main(String[] args) {
	//String str="virat";
	//String str="apple";
	//String str="virat kohli";
	String str="Virat Kohli";
	
	str=str.replaceAll("\\s+", "").toLowerCase();  //viratkohli
	Map<Character,Integer> map=new LinkedHashMap();
	
	for(char ch:str.toCharArray())		//ch='p'
	map.put(ch, map.getOrDefault(ch, 0)+1);
	
	
	System.out.println(map);
}
}

/*
{
'a'=1
'p'=2
' '=1
}
*/
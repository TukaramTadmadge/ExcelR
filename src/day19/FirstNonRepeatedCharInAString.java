package day19;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharInAString {
	public static void main(String[] args) {

		//String str = "Virat Kohli";
		//String str = "Mahenda Singh Dhoni";
		String str = "Rohit Sharmo";

		char ch = findFirstRepeatedCharInAString(str);

		System.out.println(ch=='0'? "No Char Found": ch);
	}

	private static char findFirstRepeatedCharInAString(String str) {
		str = str.replaceAll("\\s+", "").toLowerCase(); // viratkohli

		Map<Character, Integer> map = new LinkedHashMap();

		for (char ch : str.toCharArray()) // ch='p'
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		
		for(char ch:str.toCharArray())			//ch='i'
		{
			if(map.get(ch)==1)
				return ch;
		}
		
		return '0';
	}
}

/*
{v=1, i=2, r=1, a=1, t=1, k=1, o=1, h=1, l=1}
*/

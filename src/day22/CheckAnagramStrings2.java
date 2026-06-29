package day22;

import java.util.Arrays;

public class CheckAnagramStrings2 {
public static void main(String[] args) {
	
	String str1="listen"; //l=1,i=1,s=1,t=1,e=1,n=1
	String str2="silent"; //l=1,i=1,s=1,t=1,e=1,n=1
	
	String str3=getString(str1);
	String str4=getString(str2);
	
	if(str3.equals(str4))
		System.out.println("Anagram");
	else
		System.out.println("Not Anagram");
	
}

		static public String getString(String s)
		{
			char arr[]=s.toCharArray(); //['l','i','s','t','e','n']
			Arrays.sort(arr);
			return new String(arr);
		}
}

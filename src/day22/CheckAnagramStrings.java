package day22;

import java.util.Arrays;

public class CheckAnagramStrings {
public static void main(String[] args) {
	
	String str1="listen"; //l=1,i=1,s=1,t=1,e=1,n=1
	String str2="silent"; //l=1,i=1,s=1,t=1,e=1,n=1
	
	
	char arr1[]=str1.toCharArray(); //['l','i','s','t','e','n']
	char arr2[]=str2.toCharArray(); //['s','i','l','e','n','t']
	
	Arrays.sort(arr1);	//['e','i','l','n','s','t']
	Arrays.sort(arr2);	//['e','i','l','n','s','t']
	
	String str3=new String(arr1); //"eilnst";
	String str4=new String(arr2); //"eilnst";
	
	if(str3.equals(str4))
		System.out.println("Anagram");
	else
		System.out.println("Not Anagram");
	
}

		
}

package day17;

import java.util.Stack;

public class StringPalindromDemo {

	public static void main(String[] args) {
//		String str="madam";
		String str="apple";
		Stack<Character> stack=new Stack();
		
		for(char ch:str.toCharArray())	//ch='m'
		{
			stack.push(ch);
		}
										
		int flag=0;
		for(char ch:str.toCharArray())	//ch='m'	'a'    'd'   'a'   'm'
		{
			char x=stack.pop();			//x='m'     'a'    'd'   'a'   'm'
			if(x!=ch)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}


/*

stack
m
a
d
a
m



*/
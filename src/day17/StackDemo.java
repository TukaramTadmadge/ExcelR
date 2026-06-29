package day17;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//Last In First Out
		Stack<String> names=new Stack();
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		
		System.out.println(names.pop());  //Chris will removed
		
		System.out.println(names.size()); //2
		
		
		

	}

}

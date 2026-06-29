package day17;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet();   //homogenous - Natural Sorting Order  Asc order by char
		names.add("Alice");
		names.add("Tom");
		names.add("Ben");
		names.add("Chris");
		names.add("John");
		names.add("David");
		names.add("David");
		names.add("George");
		System.out.println(names);
		
		
		TreeSet names1=new TreeSet();	//default in homogenous mode bcoz it has to compare and add
		names1.add("Alice");
		names1.add(100);
		names1.add("Ben");
		
	}

}

package day17;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> names=new LinkedHashSet();
		names.add("Alice");
		names.add("Tom");
		names.add("Ben");
		names.add("Chris");
		names.add("John");
		names.add("David");
		
		names.add(null);
		names.add(null);
		names.add("David");
		names.add("George");
		System.out.println(names);
		
		
	}

}

package day16;

import java.util.ArrayList;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Alice"); 	//0
		names.add("Ben");		//1
		names.add("Chris");		//2
		
		System.out.println(names);
		names.add(1, "Tom");
		System.out.println(names);
		
		System.out.println(names.get(2));
		
		names.remove(3); //remove Chris
		System.out.println(names);
		names.remove("Tom");
		System.out.println(names);
		
		System.out.println(names.size());
		
		System.out.println(names.isEmpty());  //false
		System.out.println(names.contains("Alice")); //true
		
		names.clear();  //will truncate the collection
		System.out.println(names.size()); //0
		System.out.println(names.isEmpty());  //true
		
		
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		numbers.remove(3);					//integer index
		System.out.println(numbers);
	}

}

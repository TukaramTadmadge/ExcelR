package day16;

import java.util.ArrayList;

public class AddMethodDemo {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();	//Collection
		
		list1.add(10);    			//int convert the P 10 into NP 10 implicitly
		list1.add(20);
		
		ArrayList<String> names=new ArrayList();	//Generics
		names.add("Alice");		//true add successfully true
		names.add("Ben");
		//names.add(123);
		
		
		String st=names.get(0);
		System.out.println(st);
		
		
		System.out.println(list1.get(0));
		
		System.out.println(list1.get(1));
		
		String fruit=(String)list1.get(1);
		System.out.println(fruit);
		
		int n1=Integer.parseInt((String)list1.get(3));
		System.out.println(n1);

	}

}

package day17;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList();
		list.add("Alice");
		list.add("Ben");
		list.add("Chris");
		
		System.out.println(list);
		
		System.out.println("First" +list.getFirst());
		System.out.println("Last" +list.getLast());		//size=3
		
		list.removeFirst();
		list.removeLast();
														//size=1
		
		System.out.println(list.size());
		System.out.println("--------------------------");
		
		LinkedList<String> list2=new LinkedList();
		list2.add("Alice");
		list2.add("Ben");
		list2.add("Chris");
		list2.add("David");
		list2.add("Elcid");
		
		System.out.println("Peek First" +list2.peekFirst());		//same as get
		System.out.println("Peek Last" +list2.peekLast());		
		
		System.out.println(list2.size());         //5
		
		System.out.println("Poll First" +list2.pollFirst());		//same as remove
		System.out.println("Poll Last" +list2.pollLast());
		
		System.out.println(list2.size());      //3
		
	}

}

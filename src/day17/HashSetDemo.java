package day17;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet();
		names.add("Alice");
		names.add("Ben");
		names.add("Alice");
		names.add("Chris");
		names.add(null);
		names.add(null);
		
		System.out.println(names.size());
		System.out.println(names);
		
		HashSet<Integer> setA=new HashSet();		//setA={1,2,3}    
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		HashSet<Integer> setB=new HashSet();		//setB={3,4,5}
		setB.add(3);
		setB.add(4);
		setB.add(5);
		
		//AnB
//		setA.retainAll(setB);
//		System.out.println("AnB" + setA);
		
		//AuB
		setA.addAll(setB);
		System.out.println("AuB" + setA);
	}

}

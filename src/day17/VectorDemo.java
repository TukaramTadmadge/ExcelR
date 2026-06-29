package day17;

import java.util.LinkedList;
import java.util.Vector;
//legacy class in java since 1.1
public class VectorDemo {

	public static void main(String[] args) {
		Vector vector=new Vector();		//NoArgsConstructor default capacity=10 ,  increase default x 2
		
		System.out.println("CAPACITY " +vector.capacity());//10
		System.out.println("SIZE " +vector.size());//0

		vector.add("Alice");
		System.out.println("CAPACITY " +vector.capacity());//10
		System.out.println("SIZE " +vector.size());//1
		
		for(int i=1;i<=9;i++)
			vector.add("Alice");
		
		System.out.println("CAPACITY " +vector.capacity());//10
		System.out.println("SIZE " +vector.size());//10
		
		vector.add("Alice");
		
		System.out.println("CAPACITY " +vector.capacity());//20
		System.out.println("SIZE " +vector.size());//11
		System.out.println("-----------------------------");
		Vector vector1=new Vector(25);		//capacity=25 
		
		System.out.println("CAPACITY " +vector1.capacity());//25
		System.out.println("SIZE " +vector1.size());//0
		
		System.out.println("-----------------------------");
		Vector vector2=new Vector(5,3);		//capacity=5 , increment=3
		
		for(int i=1;i<=5;i++)
			vector2.add("Alice");
		
		System.out.println("CAPACITY " +vector2.capacity());//5
		System.out.println("SIZE " +vector2.size());//5
		
		vector2.add("Alice");
		
		System.out.println("CAPACITY " +vector2.capacity());//8
		System.out.println("SIZE " +vector2.size());//6
		
		LinkedList<String> list2=new LinkedList();
		Vector vector3=new Vector(list2);	
	}

}

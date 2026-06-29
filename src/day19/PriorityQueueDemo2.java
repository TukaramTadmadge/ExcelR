package day19;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());  //default priority ascending order
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		pq.add(6);
		
		Iterator<Integer> itr=pq.iterator();
		System.out.println(pq); //[9, 1, 2, 5, 6]
		
		System.out.println(pq.remove()); //9
		System.out.println(pq); //[6, 1, 2, 5]
		
		
		System.out.println(pq.remove()); //6
		System.out.println(pq); //[5, 1, 2, ]
		
		System.out.println(pq.remove()); //5
		System.out.println(pq); //[2, 1]
		
		System.out.println(pq.remove()); //2		
		System.out.println(pq); //[1]
		
		System.out.println(pq.remove()); //1		
		System.out.println(pq); //[]
			
		if(itr.hasNext()) //false
		System.out.println(pq.poll());   
	}

}

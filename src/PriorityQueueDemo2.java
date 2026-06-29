import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue();  //default priority ascending order
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		pq.add(6);
		
		System.out.println(pq); //[1, 2, 5, 9, 6]
		
		System.out.println(pq.remove()); //1
		System.out.println(pq); //[2, 5, 9, 6]
		
		
		System.out.println(pq.remove()); //2
		System.out.println(pq); //[5, 9, 6]
		
		System.out.println(pq.remove()); //5
		System.out.println(pq); //[6, 9]
		
		System.out.println(pq.remove()); //6		incorrect
		System.out.println(pq); //[9]
		
		System.out.println(pq.remove()); //9		incorrect
		System.out.println(pq); //[]
										 //throws NoSuchElementExceptions	null
		System.out.println(pq.poll());   //peek == get   & 					poll == remove
	}

}

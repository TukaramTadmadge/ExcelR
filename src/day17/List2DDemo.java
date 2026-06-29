package day17;

import java.util.ArrayList;
import java.util.LinkedList;

public class List2DDemo {

	public static void main(String[] args) {
		ArrayList<String> mh=new ArrayList();   //NoArgsConstructor default capacity=10
		mh.add("Pune");		//add single index 								size = 1
		mh.add("Mumbai");	//single index									size = 2
		mh.add("Nagpur");	//single index									size = 3
		
		
		ArrayList<String> rj=new ArrayList();
		rj.add("Jaipur");		//when we use add() we have to pass the data of the type of collection
		rj.add("Bikaner");
		rj.add("Fatehpur");
		
		ArrayList<String> gj=new ArrayList();
		gj.add("Ahmedabad");		//when we use add() we have to pass the data of the type of collection
		gj.add("Surat");
		gj.add("Rajkot");
		
		ArrayList<ArrayList<String>> bharat=new ArrayList();
		bharat.add(mh);  //consumes single index
		bharat.add(rj);
		bharat.add(gj);
		
		//using mh display me the first city
		
		System.out.println(mh.get(0));
		
		//using bharat display me the first city of mh
		System.out.println(bharat.get(0).get(0));
		
		//using bharat display me the second city of gj
		System.out.println(bharat.get(2).get(1));
		
		//display first city of each state
		System.out.println("First city of each state");
		for(int i=0;i<bharat.size();i++)					//i=0		,i=1,		i=2
			System.out.println(bharat.get(i).get(0));
		

		ArrayList<String> mh1=new ArrayList(20);			//initial capacity
														//size=0   size>capacity
		
		LinkedList<String> list2=new LinkedList();
		list2.add("Alice");
		list2.add("Ben");
		list2.add("Chris");
		
		ArrayList<String> list3=new ArrayList(list2);
	}

}

//bus 25 seats		--> capacity
//    10 passenger	--> size

//in collections once the size > capacity the capacity increases

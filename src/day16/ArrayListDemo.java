package day16;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> mh=new ArrayList();
		mh.add("Pune");		//add single index 
		mh.add("Mumbai");	//single index
		mh.add("Nagpur");	//single index
		
		
		ArrayList<String> rj=new ArrayList();
		rj.add("Jaipur");		//when we use add() we have to pass the data of the type of collection
		rj.add("Bikaner");
		rj.add("Fatehpur");
		
		ArrayList<String> gj=new ArrayList();
		gj.add("Ahmedabad");		//when we use add() we have to pass the data of the type of collection
		gj.add("Surat");
		gj.add("Rajkot");
		
		ArrayList<String> India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		India.addAll(gj);
		System.out.println(India); //[]
		System.out.println(India.size()); //9
		
		ArrayList<ArrayList<String>> bharat=new ArrayList();
		bharat.add(mh);  //consumes single index
		bharat.add(rj);
		
		System.out.println(bharat);
		System.out.println(bharat.size());
		
		India.retainAll(mh);
		System.out.println(India);	//[]
		System.out.println(India.size());//3
	}

}

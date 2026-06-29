package day24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListModifictionDemo {

	public static void main(String[] args) {
		//delete all odd numbers and display the new list
		ArrayList<Integer> list = new ArrayList<>();  //modCount=0  size=0
		list.add(1);//modCount=1  sop list.size() //1
		list.add(2);//modCount=2  sop list.size() //2
		list.add(3);//modCount=3
		list.add(4);//modCount=4
		list.add(5);//modCount=5
		list.add(6);//modCount=6
		
		list.remove(6); //modCount=7
		//modCount is signal()
		//on every modification it increments by 1
		//before the loop started modCount=5
		
		for(int num:list)
		{
			list.add(7);  //as it senses a change in the modCount the operation will fail. //FailFirst technique
		}
		
		//before the loop started modCount=8
		
		System.out.println(list);  //[2,4]
	}

	//company annual audit
	
	//1-April-2025  to 31-March-2026  audit   25-July-2025 audit date
											//9am to  6pm
											//3pm  add a voucher in the documents 28-Sept-2025
											//first instance any misdoing the audit will fail
}


//synchronisation problems
//readers writer
//producer consumer

//signal()	//increment by 1
//wait()	//decrement by 1 , 0 stop the service


// producer service			 bottle 	  								consumer service
//								-	      -	 		-      
/*
empty=3
full=0

producer
{
signal(mutex)
wait(empty)
signal(full)
}


*/


//FailSafe
package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		
		ArrayList<String> mh=new ArrayList();
//beforefirst itr		
		mh.add("Pune");		//   
		mh.add("Mumbai");	//
		mh.add("Nagpur");	//itr
		
		System.out.println(mh);
		
		
//		Iterator<String> itr=mh.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		
//		ListIterator<String> listitr=mh.listIterator();
//		while(listitr.hasNext())
//		{
//			System.out.println(listitr.next());
//		}
//		
//		System.out.println("---------------");
//		while(listitr.hasPrevious())
//		{
//			System.out.println(listitr.previous());
//		}
		
		//remove city whose length <5
		
		
		Iterator<String> itr=mh.iterator();
		while(itr.hasNext())
		{
			if(itr.next().length()<5)
				itr.remove();
		}

		System.out.println(mh);
	}

}

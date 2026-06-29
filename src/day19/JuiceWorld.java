package day19;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JuiceWorld {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of Mango milk shakes");
	int mango=sc.nextInt();
	
	System.out.println("Enter Number of Orange milk shakes");
	int orange=sc.nextInt();
	
	System.out.println("Enter Number of Pineapple milk shakes");
	int pineapple=sc.nextInt();
	
	int minTime=prepareJuices(mango,orange,pineapple);
	System.out.println("Minimum "+ minTime + " seconds required to fulfill order");
}

private static int prepareJuices(int mango, int orange, int pineapple) {
	PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>(Collections.reverseOrder());
	pqueue.add(mango);
	pqueue.add(orange);
	pqueue.add(pineapple);
	
	int seconds=0;
	Iterator<Integer> itr=pqueue.iterator();
	while(!pqueue.isEmpty()) //pqueue.size() ==3 i.e isEmpty false   !false=true
	{
		int j1=0;
		int j2=0;
		
		if(itr.hasNext())		//[4,0,0]   hasNext() true
		j1=pqueue.remove();		//j1=4
		
		if(itr.hasNext())		//[0,0]   hasNext() true
		j2=pqueue.remove();		//j2=0
		
		if(j1>0 && j2==0)
		{
			seconds+=j1;
			break;
		}
		
		if(j1>0 && j2>0)
		{
			seconds+=1;
			j1--;
			j2--;
		}
		
		if(j1>0)
			pqueue.add(j1);
		
		if(j2>0)
			pqueue.add(j2);
		
	}
	
	return seconds;
}
}

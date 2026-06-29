package day14;

public class SingleThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//Alpha
		for(int i=1;i<=1000;i++)
			System.out.println(i);			//gauranteed to complete 1st bcoz there is only a single flow
		//Beta
		for(int i=1001;i<=2000;i++)			//2nd for loop will start after completion of 1st for loop
			System.out.println("\t"+i);		//output is very predictable
		//Gama
		for(int i=2001;i<=3000;i++)			//2nd for loop will start after completion of 1st for loop
			System.out.println("\t\t"+i);

	}

}

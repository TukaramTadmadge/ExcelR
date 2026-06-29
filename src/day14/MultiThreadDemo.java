package day14;

public class MultiThreadDemo {

	public static void main(String[] args) {
		System.out.println("Priority of main "+Thread.currentThread().getPriority()); 
		Alpha thread1=new Alpha("Alpha");
		Beta thread2=new Beta("Bravo");
		Gama thread3=new Gama("Charlie");
		
		thread1.setPriority(1);
		thread2.setPriority(5);
		thread3.setPriority(10);
		//thread1.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();	//Thread-0
		thread2.start();	//Thread-1
		thread3.start();	//Thread-2
		
//		System.out.println(Thread.currentThread().getName());
//		for(int i=3001;i<=4000;i++)			//2nd for loop will start after completion of 1st for loop
//			System.out.println("\t\t\t"+i);

	}

}

//Min 1
//Norm 5   - main()  thread inherits the priority of its parent  default priority
//Max 10

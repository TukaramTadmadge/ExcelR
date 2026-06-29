package day15;

public class RunnableDemo {

	public static void main(String[] args) {
		Alpha thread1=new Alpha();
		Beta thread2=new Beta();
		Gama thread3=new Gama();
		
		Thread tx1=new Thread(thread1,"Alpha");
		Thread tx2=new Thread(thread2,"Bravo");
		Thread tx3=new Thread(thread3,"Charlie");
		
		tx1.start();
		tx2.start();
		tx3.start();

	}

}

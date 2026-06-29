package day15;

public class RunnableDemo2 {

	public static void main(String[] args) {
		Thread tx=null;
		
		Alpha thread1=new Alpha();
		Beta thread2=new Beta();
		Gama thread3=new Gama();
		
		tx=new Thread(thread1,"Alpha");
		tx.start();
		
		tx=new Thread(thread2,"Bravo");
		tx.start();
		
		tx=new Thread(thread3,"Charlie");
		tx.start();
	}

}

package day15;

public class RunnableDemo3 {

	public static void main(String[] args) {
		Thread tx=null;
		
		tx=new Thread(new Alpha(),"Alpha");
		tx.start();
		
		tx=new Thread(new Beta(),"Bravo");
		tx.start();
		
		tx=new Thread(new Gama(),"Charlie");
		tx.start();
	}

}

package day15;

public class InvalidNameException extends RuntimeException implements Runnable   //public void run()
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}


//write a mt application
//1st thread will print all armstrong numbers between 1 to 1000  -- extends Thread class
//2nd thread will print all prime numbers between 1 to 100       -- implements Runnable interface
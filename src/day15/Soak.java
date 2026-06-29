package day15;

public class Soak extends Thread
{
	public void run()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println("SOAK "+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

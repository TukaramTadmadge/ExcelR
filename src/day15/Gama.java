package day15;

public class Gama implements Runnable
{
	
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=2001;i<=3000;i++)
	{
		System.out.println("\t\t"+i);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {}
	}
			
}
}
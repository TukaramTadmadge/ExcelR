package day15;

public class Beta implements Runnable
{
	
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=1001;i<=2000;i++)
	{
		System.out.println("\t"+i);	
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {}
	}
		
}
}
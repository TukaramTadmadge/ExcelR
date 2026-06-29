package day14;

public class Beta extends Thread
{
	
	public Beta(String threadName)  //"Alpha"
	{
		super(threadName);
	}
	
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
	
//@Override
//public void start()					//can we overide the start() ? 
//{
//		System.out.println("FIFA World Cup 2026");
//}
}
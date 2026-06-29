package day14;

public class Gama extends Thread
{
	public Gama(String threadName)  //"Alpha"
	{
		super(threadName);
	}
	
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
	
//@Override
//public void start()					//can we overide the start() ? 
//{
//		System.out.println("FIFA World Cup 2026");
//}
}
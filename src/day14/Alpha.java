package day14;

public class Alpha extends Thread			//Question : does the java.lang.Thread class contain a para const which
{											//takes String as an arguement?
											//Answer : Yes
	public Alpha(String threadName)  //"Alpha"
	{
		super(threadName);
	}
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=1000;i++)
	{
		System.out.println(i);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {}
		
	}
			
}

//@Override
//public void start()					//can we overide the start() ? Yes but not recommended
//{
//		System.out.println("FIFA World Cup 2026");
//}

public void run(int x) 				//can we overload the run() ? Yes but not recommended
{
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=1000;i++)
		System.out.println(i);	
}

	
}

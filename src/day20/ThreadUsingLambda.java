package day20;

public class ThreadUsingLambda {

	public static void main(String[] args) {
		Runnable r1=()->
		{
			for(int i=1;i<=1000;i++)
			{
				System.out.println(i);
				
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ex) {}
				
			}
		};
		
		Thread tx1=new Thread(r1);
		tx1.start();
		
		
		Runnable r2=()->
		{
			for(int i=1001;i<=2000;i++)
			{
				System.out.println("\t"+i);
				
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ex) {}
				
			}
		};
		
		Thread tx2=new Thread(r2);
		tx2.start();
		
		
		Runnable r3=()->
		{
			for(int i=2001;i<=3000;i++)
			{
				System.out.println("\t\t"+i);
				
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ex) {}
				
			}
		};
		
		Thread tx3=new Thread(r3);
		tx3.start();

	}

}

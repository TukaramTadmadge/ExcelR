package day15.itcdemo;

public class Father extends Thread
{
	
	Bank bank;
	
	public Father(Bank bank)
	{
		this.bank=bank;
	}
@Override
public void run() {
	
	try 
	{
		Thread.sleep(5000);
	} 
	catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	bank.deposit(8000.0);
}
}

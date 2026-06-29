package day15.itcdemo;

public class Bank {

	private double balance;
	
	public Bank(double balance)
	{
		this.balance=balance;
	}
	
	
	public synchronized void deposit(double depositAmount)	//father thread
	{
		this.balance+=depositAmount;
		notify();
	}
	
	public synchronized void withdraw(double withdrawAmount)	//son thread
	{
		System.out.println("Account Balance "+ this.balance);  //Account Balance 5000
		if(withdrawAmount>this.balance)
		{
			System.out.println("Trying to withdraw Rs" + withdrawAmount+",Insufficient Funds");
			System.out.println("Son calling dad to deposit money");
			
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Dad Deposited 8000 , Balance "+this.balance);
			this.balance-=withdrawAmount;
			System.out.println("Withdrwal Successful of Rs "+withdrawAmount);
			System.out.println("Account Balance "+ this.balance); 
		}
		
	}
}

package day9.ver2;

import java.util.Scanner;

public class BankDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankingServices bank=new HDFCBank(5000.0);
		
		Customer customer =new Customer("virat@rcb.com","Virat@123");  //VIRAT@RCB.COM
		
		System.out.println("Please enter username");
		String uname=sc.next();
		
		System.out.println("Please enter password");
		String pass=sc.next();
		
		//if(uname.equalsIgnoreCase(customer.getUsername()) && pass.equals(customer.getPassword()))
		if(customer.login(uname, pass))
		{
		int choice=0;
		do
		{
			System.out.println("Welcome ," + customer.getUsername());
			System.out.println("*** Banking Menu ***");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Online Transfer");
			System.out.println("4. Check Balance");
			System.out.println("0. Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: bank.deposit(); break;
			case 2: bank.withdraw(); break;
			case 3: bank.onlineTransfer(); break;
			case 4: bank.checkBalance(); break;
			case 0: System.out.println("Are You sure you want to close 0-Yes, 1-No"); 
					choice=sc.nextInt();
					if(choice==0)
					{
					System.out.println("Closing App..."); System.exit(0); 
					}
					break;
			default : System.out.println("Invalid Input");
			}
			
		}while(choice!=0);
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}

}

package day9.ver5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankingServices bank=new HDFCBank(5000.0);
		
		Customer customer =new Customer("virat@rcb.com","Virat@123");  //VIRAT@RCB.COM
		
		try
		{
		System.out.println("Please enter username");
		String uname=sc.next();
		
		System.out.println("Please enter password");
		String pass=sc.next();
		
		//if(uname.equalsIgnoreCase(customer.getUsername()) && pass.equals(customer.getPassword()))
		if(customer.login(uname, pass))
		{
		System.out.println("Welcome ," + customer.getUsername());
		int choice=0;
		do
		{
			
			System.out.println("*** Banking Menu ***");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Online Transfer");
			System.out.println("4. Check Balance");
			System.out.println("0. Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			try
			{
			switch(choice)
			{
			case 1: 
				System.out.println("Enter Amount to deposit");		
				double depositAmount=sc.nextDouble();
				bank.deposit(depositAmount);
				System.out.println("Deposit Successful ,  Balance is "+ bank.checkBalance());
				
			break;	
			case 2: 
				
				System.out.println("Enter Amount to withdraw");
				double withdrawAmount=sc.nextDouble();
				bank.withdraw(withdrawAmount);
				System.out.println("Withdraw Successful ,  Balance is "+ bank.checkBalance());

				
			break;
			case 3: 
				
				int messageOTP=OTPGenerator.generateOTP();
				System.out.println("OTP for the transaction is " +messageOTP + " valid for 15 minutes");
				System.out.println("Enter the OTP");
				int userEnteredOTP=sc.nextInt();
				if(messageOTP==userEnteredOTP)
				{
					System.out.println("Enter Amount to Transfer");
					double transferAmount=sc.nextDouble();
					bank.onlineTransfer(transferAmount);
					System.out.println("Transfer Successful ,  Balance is "+ bank.checkBalance());
				}	
				else
				{
					throw new InvalidOTPException("Please enter valid OTP");
				}
				
			break;
			case 4: System.out.println("Balance is "+bank.checkBalance()); break;
			
			case 0: System.out.println("Are You sure you want to close 0-Yes, 1-No"); 
					choice=sc.nextInt();
					if(choice==0)
					{
					System.out.println("Closing App..."); System.exit(0); 
					}
			
			break;
			default : System.out.println("Invalid Input");
			}
			}
			catch(InvalidAmountException ex1)
			{
				System.out.println(ex1.getMessage());
			}
			
			catch(InSufficientFundsException ex2)
			{
				System.out.println(ex2.getMessage());
			}
			
			catch(InvalidOTPException ex3)
			{
				System.out.println(ex3.getMessage());
			}
			
		}while(choice!=0);
		}
		else
		{
			throw new InvalidCredentialException("Please enter valid credentials");
		}
		}
		catch(InputMismatchException ex4)
		{
			System.out.println("Please enter valid Amount");
		}
		catch(InvalidCredentialException ex5)
		{
			System.out.println(ex5.getMessage());
		}
	}

}

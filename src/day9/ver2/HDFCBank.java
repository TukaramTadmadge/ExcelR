package day9.ver2;

import java.util.Scanner;

public class HDFCBank implements BankingServices
{
	private double balance;
	Scanner sc=new Scanner(System.in);
	public HDFCBank(double balance)
	{
		this.balance=balance;
	}
	
	@Override
	public void deposit() {
		System.out.println("Enter Amount to deposit");
		double depositAmount=sc.nextDouble();
		if(depositAmount>0)
		{
		this.balance+=depositAmount;
		System.out.println("Deposit Successful ,  Balance is "+ this.balance);
		}
		else
		System.out.println("Invalid Amount");
	}

	@Override
	public void withdraw() {
		System.out.println("Enter Amount to withdraw");
		double withdrawAmount=sc.nextDouble();
		if(withdrawAmount>0 && withdrawAmount<=this.balance) 
		{
		this.balance-=withdrawAmount;
		System.out.println("Withdraw Successful ,  Balance is "+ this.balance);
		}
		else
		System.out.println("Invalid Amount");	
		
	}

	@Override
	public void onlineTransfer() {
		int messageOTP=OTPGenerator.generateOTP();
		System.out.println("OTP for the transaction is " +messageOTP + " valid for 15 minutes");
		System.out.println("Enter the OTP");
		int userEnteredOTP=sc.nextInt();
		if(messageOTP==userEnteredOTP)
		{
			System.out.println("Enter Amount to Transfer");
			double transferAmount=sc.nextDouble();
			if(transferAmount>0 && transferAmount<=this.balance)
			{
				this.balance-=transferAmount;
				System.out.println("Transfer Successful ,  Balance is "+ this.balance);
				}
				else
				System.out.println("Invalid Amount");	
		}
		else
		{
			System.out.println("Invalid OTP");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance is "+ this.balance);
	}

}

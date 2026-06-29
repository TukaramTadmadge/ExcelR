package day9.ver3;

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
	public void deposit(double depositAmount) 
	{
		this.balance+=depositAmount;
	}

	@Override
	public void withdraw(double withdrawAmount) {
		this.balance-=withdrawAmount;	
	}

	@Override
	public void onlineTransfer(double transferAmount) {
		withdraw(transferAmount);
	}

	@Override
	public double checkBalance() {
		return this.balance;
	}

}

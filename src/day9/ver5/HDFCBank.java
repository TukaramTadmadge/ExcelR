package day9.ver5;

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
	public void deposit(double depositAmount) throws InvalidAmountException
	{
		if(depositAmount<0)
			throw new InvalidAmountException("Deposit Amount Should be > than 0");
		this.balance+=depositAmount;
	}

	@Override
	public void withdraw(double withdrawAmount) throws InvalidAmountException,InSufficientFundsException
	{
		if(withdrawAmount<0)
			throw new InvalidAmountException("Withdraw Amount Should be > than 0");
		if(withdrawAmount>checkBalance())
			throw new InSufficientFundsException("Not Enough Funds In the account");
		
		this.balance-=withdrawAmount;	
	}

	@Override
	public void onlineTransfer(double transferAmount) throws InvalidAmountException,InSufficientFundsException
	{
		if(transferAmount<0)
			throw new InvalidAmountException("Transfer Amount Should be > than 0");
		if(transferAmount>checkBalance())
			throw new InSufficientFundsException("Not Enough Funds In the account");
		withdraw(transferAmount);
	}

	@Override
	public double checkBalance() {
		return this.balance;
	}

}

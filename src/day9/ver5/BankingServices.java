package day9.ver5;

public interface BankingServices {

	void deposit(double depositAmount) throws InvalidAmountException;
	void withdraw(double withdrawAmount) throws InvalidAmountException,InSufficientFundsException;
	void onlineTransfer(double transferAmount) throws InvalidAmountException,InSufficientFundsException;;
	double checkBalance();
}

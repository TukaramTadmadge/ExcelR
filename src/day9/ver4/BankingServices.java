package day9.ver4;

public interface BankingServices {

	void deposit(double depositAmount);
	void withdraw(double withdrawAmount);
	void onlineTransfer(double transferAmount);
	double checkBalance();
}

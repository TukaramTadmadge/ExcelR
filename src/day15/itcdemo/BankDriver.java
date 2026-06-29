package day15.itcdemo;

public class BankDriver {
public static void main(String[] args) {
	 Bank bank=new Bank(5000.0);  //initial balance=5000
	 
	 Son thread1=new Son(bank);
	 thread1.start();
	 Father thread2=new Father(bank);
	 thread2.start();
}
}

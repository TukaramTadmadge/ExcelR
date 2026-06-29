package day3;

public class CallByValueDemo {

	public static void main(String[] args) {
		int a=10;	
		System.out.println("A =" + a); //A = 10				1st A = 10
		test(a);					//						2nd B = 10
		System.out.println("A =" + a); //A = 10				3rd B = 99
	}									//					4th A = 10	

	private static void test(int b) 
	{
		System.out.println("B =" + b); //B = 10
		b=99;
		System.out.println("B =" + b); //B = 99
	}

}

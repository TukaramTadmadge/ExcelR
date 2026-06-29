package day3;

public class CallByValueDemo2 {

	public static void main(String[] args) {
		double a=10.1;	
		System.out.println("A =" + a); //A = 10				1st A = 10
		test(a);					//						2nd B = 10
		System.out.println("A =" + a); //A = 10				3rd B = 99
	}									//					4th A = 10	

	private static void test(double b) 
	{
		System.out.println("B =" + b); //B = 10
		b=99.1;
		System.out.println("B =" + b); //B = 99
	}

}

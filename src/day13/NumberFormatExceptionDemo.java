package day13;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		//String str="apple";
		String str="123";
		int n=Integer.parseInt(str);  //NumberFormatException
		System.out.println(n);
		
		
		String s1="123";
		String s2="123";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	}

}

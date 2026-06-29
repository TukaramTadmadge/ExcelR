package day3;

public class StringComstantPoolDemo {

	public static void main(String[] args) {
		String str1=new String("Virat");
		String str2="Apple";
		String str3="Apple";
		String str4=new String("Apple");
		
		System.out.println(str2==str3);  //true
		System.out.println(str3==str4);  //false
		System.out.println(str2.equals(str3));//true
		System.out.println(str3.equals(str4));//true
		
		
		
	}

}

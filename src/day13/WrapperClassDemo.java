package day13;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);  	//10 primitive
		
		Integer obj=new Integer(a);//non primitive
		System.out.println(obj);
		
		
		int b=obj.intValue(); 		//primitive
		System.out.println(b);
		
		
	}

}

//3 types of Strings
//1. Alphabetic String "Apple"       --> convert into an integer				NumberFormatException
//2. Numeric String "123"				int n=Integer.parseInt("123")
//3. Alphanumeric Strings "Apple123" --> convert into an integer
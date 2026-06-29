package day10;

public class ObjectRefDemo {

	public static void main(String[] args) {
		Amitabh a1;
		
		a1=new Abhishek();
		
		System.out.println(a1.qualification);   //qualification is a property  
												//property belongs to ref 
												//ref is of Amitabh
												//therefore quali of Amitabh i.e BCOM will be printed
		
		
		a1.home();				//home is a method 
								//method belongs to object
								//ref is of Abhishek
								//therefore home() of Abhishek i.e New Jalsa will be printed
		

	}

}

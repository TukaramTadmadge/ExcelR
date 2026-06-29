package day7;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Amitabh a1;		//Ref of Amitabh;
		
		a1=new Amitabh();			//P p =new P()
		a1.home();
		
		a1=new Abhishek();			//P  p=new C()   techicle Upcasting
		a1.home();
		
		a1=new Aradhya();
		a1.home();
		
		Abhishek a2;
		
		a2=new Abhishek();
		a2.home();
		a2.car();
		
		a2=new Aradhya();			//C c=new P()  not allowed
		a2.home();
		a2.car();
		
		
		
	}

}


//final keyword in java
//1. prefixed before a variable      - value cannot be re assigned
//final double PI=3.14 
//final double GRAVITY=9.8;

//2. prefixed before a method      - cannot be overriden

//3. prefixed before a class     - cannot be inherited


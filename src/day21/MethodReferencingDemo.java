package day21;

public class MethodReferencingDemo {

	public static void main(String[] args) {
		Shape s1=(r)->Math.PI*r*r;
		
		System.out.println(s1.area(5.0));
		
		Shape s2=MethodReferencingDemo::test;
		
		System.out.println(s2.area(5.0));
		myPrint("mahendra singh dhoni");
		
		Printer p1=(st1)->System.out.println(st1.toUpperCase());
		p1.printName("mahendra singh dhoni");
		
		Printer p2=MethodReferencingDemo::myPrint;
		p2.printName("mahendra singh dhoni");
		
		MethodReferencingDemo mrd=new MethodReferencingDemo();
		
		Printer p3=mrd::myDisplay;
		p3.printName("Mahendra Singh Dhoni");
		
		
		Printer p4=String::toUpperCase;
		
	}

	
	public static double test(double r)
	{
		return Math.PI*r*r;
	}
	
	public static void myPrint(String str)
	{
		System.out.println("Mr. "+str.toUpperCase());
	}
	
	public void myDisplay(String str)
	{
		System.out.println(str.toLowerCase());
	}
}

package day2;

public class DataTypeConversionDemo {

	public static void main(String[] args) {
		
		System.out.println("*******WIDENING***********");
		int n1=10;
		double d1=n1;						//widening is done IMPLICITLY - allowing 
		
		System.out.println("INT "+n1);  	// INT 10
		System.out.println("DOUBLE "+d1);   // DOUBLE 10.0
		
		System.out.println("*******NARROWING***********");
		double d2=5.75;						//narrowing
		int n2=(int)d2;
		
		System.out.println("INT "+n2);  	// INT 5
		System.out.println("DOUBLE "+d2);   // DOUBLE 5.75
	}

}

package day7;
import static java.lang.Math.*;
public class StaticImportDemo {

	public static void main(String[] args) {
		
		int yearOfBirth=2000;
		int currentYear=2026;
		
		//int age=currentYear-yearOfBirth;
		
		int age=abs(yearOfBirth-currentYear);
		System.out.println(age);
		
		double area=3.14*5*5;
		System.out.println(area);
		
		double area1=PI*5*5;
		System.out.println(area1);
	}

}

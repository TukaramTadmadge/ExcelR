package day7;

import java.util.Scanner;

public class Student 
{

	private int rno;						//instance scope		this is prefixed to the instance scope var
	private String sname;					//instance scope
	private double per;						//instance scope
	private boolean outStationCandidate;  	//instance scope
	static int strength=0;					//static will be class level variable
	
	
	public Student() {}
	public Student(int rno, String sname, double per, boolean outStationCandidate) 
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
		this.outStationCandidate = outStationCandidate;
		strength++;
	}

	public void acceptStudent()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll Number");
		this.rno = sc.nextInt();
		
		System.out.println("Enter Student Name");
		this.sname = sc.next();
		
		System.out.println("Enter Percentage");
		this.per = sc.nextDouble();
		
		this.outStationCandidate=false;
	}
	
	public void displayStudent()  //non static method
	{
		System.out.println("Student Roll Number is "+this.rno);
		
		System.out.println("Student Roll Name is "+this.sname);
		
		System.out.println("Student Percentage is "+ this.per);
		
		System.out.println("Student Domicile is Out Station Candiate  "+ this.outStationCandidate);
		displayStrength();
	}
	
	public static void displayStrength() //static method
	{
		System.out.println("Total Number of Students in class is "+ Student.strength);
		test();
		int a=20;   //local variable cannot be static
	}
	
	public static void test()
	{
		System.out.println("Static Method Demo");
	}
}


//golden q:why do we create a class?
//golden A:to create its objects?

//silver q:why do we create a object?
//silver A:to call methods of the class



package day4;

import java.util.Scanner;

public class Student 
{

	private int rno;					//instance scope		this is prefixed to the instance scope var
	private String sname;				//instance scope
	private double per;					//instance scope
	private boolean outStationCandidate;  //instance scope
	
	
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
	
	public void displayStudent()
	{
		Student stud=new Student();							//inside Akash
		System.out.println(stud.rno);
		System.out.println(stud.sname);
		System.out.println("Student Roll Number is "+this.rno);
		
		System.out.println("Student Roll Name is "+this.sname);
		
		System.out.println("Student Percentage is "+ this.per);
		
		System.out.println("Student Domicile is Out Station Candiate  "+this.outStationCandidate);
	}
}


//golden q:why do we create a class?
//golden A:to create its objects?

//silver q:why do we create a object?
//silver A:to call methods of the class



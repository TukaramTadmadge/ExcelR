package day6;

import java.util.Scanner;

public class Employee extends Person
{

	protected int eid;							//total Data Members	=3+3 = 6
	protected String desg;
	protected double sal;
	
	public void acceptEmployee()				//total Member Functions = 2+2 =4
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Employee ID");
		this.eid=sc.nextInt();
		System.out.println("Enter Employee Designation");
		this.desg=sc.next();
		System.out.println("Enter Employee Salary");
		this.sal=sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee ID is "+this.eid);
		System.out.println("Employee Designation is "+this.desg);
		System.out.println("Employee Salary is "+this.sal);
	}
}

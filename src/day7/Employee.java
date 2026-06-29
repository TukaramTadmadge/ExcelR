package day7;

import java.util.Scanner;

public class Employee extends Person
{

	protected int eid;							//total Data Members	=3+3 = 6
	protected String desg;
	protected double sal;
	
	public Employee()
	{
		super();
		this.eid=101;
		this.desg="Clerk";
		this.sal=500.0;	
	}
	
	public Employee(String name, int age, String city,int eid,String desg,double sal)
	{
		super(name,age,city);
		this.eid = eid;
		this.desg = desg;
		this.sal = sal;
	}
	
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
		super.displayPerson();//super from my "parent class" invoke the method
	}
}

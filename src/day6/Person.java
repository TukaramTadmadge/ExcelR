package day6;

import java.util.Scanner;

public class Person {						//total Data Members	=3
	
	protected String name;
	protected int age;
	protected String city;
	
//	public Person() {}
//	public Person(String name, int age, String city) 	//AllArgsConstructor
//	{
//		this.name = name;
//		this.age = age;
//		this.city = city;
//	}
//	
	public void acceptPerson()				//total Member Functions = 2
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person name");
		this.name=sc.next();
		System.out.println("Enter Person age");
		this.age=sc.nextInt();
		System.out.println("Enter Person city");
		this.city=sc.next();
	}
	
	public void displayPerson()
	{
		System.out.println("Person name is "+this.name);
		System.out.println("Person age is "+this.age);
		System.out.println("Person city is "+this.city);
	}
	
	
	
}

package day7;

import java.util.Scanner;

public class Person {						//total Data Members	=3
	
	protected String name;
	protected int age;
	protected String city;
	
	public Person() 						//how many data is my NoArgConstructor initializing
	{										//data == total Data Members
		this.name = "Raj";
		this.age = 21;
		this.city = "Pune";
	}
	public Person(String name, int age, String city) 	//AllArgsConstructor
	{													//parameters == total Data Members
		this.name = name;
		this.age = age;
		this.city = city;
	}


	public void displayPerson()
	{
		System.out.println("Person name is "+this.name);
		System.out.println("Person age is "+this.age);
		System.out.println("Person city is "+this.city);
	}
	
	
	
}

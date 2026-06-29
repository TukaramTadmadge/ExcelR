package day23;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		
		//Optional was introduced in java 8 to reduce/eliminate NullPointerException
		
//		String sname=getStudentName(0);
//		System.out.println(sname.length());  //5
		
						//receiver
		Optional<String> sname1=getStudentName(1);
		System.out.println(sname1.get());  //100% sure data is there
		
		if(sname1.isPresent())   //isPresent will return a boolean
		{
			System.out.println("Gift Found");
		}
		else
		{
			System.out.println("I dont like pranks");
		}

		Optional<Student> stud1=getStudentName1(1);
		System.out.println("My fav player is "+ stud1.get().getSname());
		
		System.out.println(sname1.orElse("I dont like pranks!!!"));
		System.out.println(stud1.orElse(new Student(45,"Rohit",88.5)));
		
		stud1.ifPresent(n->System.out.println("send email : Thank you for the gift "+n.getSname()));
		
		
		System.out.println(sname1.orElseGet(()->test()));
		
		try
		{
		System.out.println(sname1.orElseThrow(()-> new StudentNotFoundException("404 : Student not found")));
		}
		catch(StudentNotFoundException ex1)
		{
			System.out.println(ex1.getMessage());
		}
	}
	
	
	public static Optional<String> getStudentName(int rollNumber)		//sender
	{
		if(rollNumber==1)
			return Optional.of(null);  // box with String Rahul in it value gauranteed
		else
			return Optional.empty();
	}
	
	public static Optional<Student> getStudentName1(int rollNumber)
	{
		if(rollNumber==1)
			return Optional.of(new Student(1,"Virat",78.5));  // box with String Rahul in it
		else
			return Optional.empty();
	}
	
	
	public static String test()
	{
		return "Apple";
	}

}


//empty
//null
//undefined
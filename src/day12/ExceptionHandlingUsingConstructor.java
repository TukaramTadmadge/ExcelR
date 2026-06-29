package day12;

public class ExceptionHandlingUsingConstructor {
public static void main(String[] args) {
	
	try
	{
	//Student s1=new Student(18,null,78.5);
	Student s1=new Student(18,"Virat",78.5);
	System.out.println(s1);
	}
	catch(Exception ex1)
	{
		System.out.println(ex1.getMessage());
	}
	
}
}

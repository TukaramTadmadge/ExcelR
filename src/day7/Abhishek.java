package day7;

public class Abhishek extends Amitabh
{	
	@Override
	protected void home()					//method overriding
	{										//method with the same name and same signature
		System.out.println("New Jalsa");	//in Parent/super & child/sub class
	}										//overriding inheritance is mandatory
	
	protected void car()						
	{											
		System.out.println("BMW");
	}
}


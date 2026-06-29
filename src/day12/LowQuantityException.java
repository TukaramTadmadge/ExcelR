package day12;

public class LowQuantityException extends Exception					//checked
//public class LowQuantityException extends RuntimeException              //unchecked
{

	String message;
	
	public LowQuantityException(String message)  //Parameterised Constructor
	{
		super(message);							//RuntimeException parameterised constructor
	}
}

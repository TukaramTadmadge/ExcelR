package day9.ver5;

public class InvalidOTPException extends RuntimeException
{
	public InvalidOTPException(String message)
	{
		super(message);
	}
}
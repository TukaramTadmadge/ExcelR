package day12;

import java.io.FileNotFoundException;
import java.io.IOException;

//direclty     Object indirectly
public class Abhishek extends Amitabh
{	
	protected String qualification="MBA";
	
	//@Override
	//same of wider specifier
	//if i use a narrower it will give Compiler Time Error CTE
	@Override
	public void home() throws RuntimeException					//do not throw anything - allowed
	{															//same exception - allowed
		System.out.println("New Jalsa");						//child exception - allowed
	}															//parent exception - not allowed
	
	public void car()
	{
		System.out.println("BMW");
	}
}


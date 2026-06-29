package day11;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");  //Virat Kohli
		try
		{
		String fullName=br.readLine();
		}
		catch(IOException ex1)
		{
			System.out.println("Invalid Value");
		}

	}

}

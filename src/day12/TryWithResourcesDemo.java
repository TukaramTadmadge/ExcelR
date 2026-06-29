package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResourcesDemo {

	public static void main(String[] args) 
	{
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc=new Scanner(System.in);)
		{
		System.out.println("Enter your name");  //Virat Kohli
		
		String fullName=br.readLine();
		}
		catch(IOException ex1)
		{
			System.out.println("Invalid Value");
		}
		
		//br.close(); //if we forget to close the resource, it might lead to memory leakage
		//sc.close();
	}

}

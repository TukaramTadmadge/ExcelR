package day4;

import java.util.Scanner;

public class Login {

	private String username;		//instance
	private String password;		//instance
	
	
//	public void setUsername(String username)
//	{
//		this.username=username;
//	}
//	
//	public String getUsername()
//	{
//		return this.username;
//	}
//	
//	public void setPassword(String password)
//	{
//		this.password=password;
//	}
//	
//	public String getPassword()
//	{
//		return this.password;
//	}
	
	
	public void acceptLoginDetails()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username");
		this.username = sc.next();
		
		System.out.println("Enter Password");
		this.password = sc.next();
	}
	
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void displayLoginDetails()
	{
		System.out.println("Username is "+ this.username);
		
		System.out.println("Password is "+ this.password);
	}
}

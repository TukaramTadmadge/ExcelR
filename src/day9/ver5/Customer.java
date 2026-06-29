package day9.ver5;

import java.util.Scanner;

public class Customer {

	private String username;
	private String password;
	
	public Customer() {}
	public Customer(String username, String password)
	{
		this.username = username;
		this.password = password;
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
	
	public boolean login(String user,String pass)
	{
		Scanner sc=new Scanner(System.in);
		String generatedCaptcha=CAPCTHAGenerator.generateCaptcha();
		System.out.println("CAPTCHA "+generatedCaptcha);
		System.out.println("Enter Captcha");
		String userEnteredCaptcha=sc.next();
		if(user.equalsIgnoreCase(this.username) && pass.equals(this.password) && generatedCaptcha.equals(userEnteredCaptcha))
		return true;
		else
		return false;
	}
}

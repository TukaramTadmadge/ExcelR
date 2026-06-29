package day13;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionChainingDemo {
public static void main(String[] args) {
	
		try
		{
		double totalCost=getTotalCostOfPuttingCarpet();
		System.out.println("Total Cost of putting carpet is "+totalCost);
		}
		catch(IOException ex1)
		{
			System.out.println(ex1.getMessage());
		}
}

private static double getTotalCostOfPuttingCarpet() throws IOException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter per sq feet carpet cost");
	double price=sc.nextDouble();
	
	System.out.println("Enter Length of room");
	int length=sc.nextInt();
	
	System.out.println("Enter Width of room");
	int width=sc.nextInt();
	
	Rectangle room=new Rectangle(length,width);
	
	try
	{
	//double total=getCost(price,room);
	double total=getCost(price,null);
	return total;
	}
	catch(NullPointerException ex)
	{
		//System.out.println("Message for Programmer, Technicle Message check for null objects");
		//ex.printStackTrace();
		System.out.println("Message for Programmer :" + ex.getCause());
		throw new IOException("Message for Customer, Non Technicle Message Connectivity will resume shortly");
	}
}

private static double getCost(double price, Rectangle room) throws NullPointerException
{
	return price*room.calculateArea();	
}
}
// using netflix : "we are facing network issue currently"  - customer    controller  customer interaction non tech
// RS145 data   technicle message   - log engineer technicle message      service  business logic "technicle
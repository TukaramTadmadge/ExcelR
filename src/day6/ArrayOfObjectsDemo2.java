package day6;

import java.util.Scanner;

public class ArrayOfObjectsDemo2 {

	public static void main(String[] args) {
		Player team[]=new Player[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<team.length;i++)
		{
			System.out.println("Enter Jersey Number");
			int a=sc.nextInt();
			System.out.println("Enter Player Name");
			String b=sc.next();
			System.out.println("Enter Matches Played");
			int c=sc.nextInt();
			System.out.println("Enter Runs Scored");
			int d=sc.nextInt();
			team[i]=new Player(a,b,c,d);	   //AllArgsCosntructor
		}
		
			
		for(int i=0;i<team.length;i++)	//display the custom values
		{
			System.out.println(team[i]);
		}
		
		//search me a jersey number is present
		//accept a jno from user and search the player by that jersey number
		
		System.out.println("Enter Jersey Number to Search");  //7
		int searchJno=sc.nextInt();
		int flag=0;
		for(int i=0;i<team.length;i++)	//display the custom values
		{
			if(team[i].search(searchJno))  //1st iteration team[0]
			{
				System.out.println("Found");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Not Found");
		
		
		//search me a Player name is present
		//accept a player name from user and search the player by that jersey number
		System.out.println("Enter Player Name to Search");
		String searchPname=sc.next();
		
		int flag1=0;
		for(int i=0;i<team.length;i++)	//display the custom values
		{
			if(team[i].search(searchPname))  //1st iteration team[0]
			{
				System.out.println("Found");
				flag1=1;
				break;
			}
		}
		
		if(flag1==0)
			System.out.println("Not Found");
	}

}

//Poly morphism

//Function Overloading									Function Overriding(Inheritance)

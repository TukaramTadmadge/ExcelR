package day6;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Player team[]=new Player[4];
		
		for(int i=0;i<team.length;i++)
		{
			team[i]=new Player();	//NoArgsCosntructor
		}
		
		for(int i=0;i<team.length;i++)	//display the initial values
		{
			System.out.println(team[i]);
		}
		
		for(int i=0;i<team.length;i++)	///accept custom values from user
		{
			team[i].acceptPlayer();
		}
			
		for(int i=0;i<team.length;i++)	//display the custom values
		{
			System.out.println(team[i]);
		}
		
		//search me a jersey number is present
		//accept a jno from user and search the player by that jersey number
		
		
	}

}

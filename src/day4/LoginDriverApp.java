package day4;

public class LoginDriverApp {

	public static void main(String[] args) {
		Login user1=new Login();
//		user1.acceptLoginDetails();
//		user1.displayLoginDetails();
		

		user1.setUsername("ben@gmail.com");
		user1.setPassword("ben@123");
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
		
		int x=10; //local variable : scope is within the method
		
		int y=1;		//local variables must be inialised before usage;
		
		if(x>1)
		{
			int z=1;		//accessible within the {} in which it is declared
		}
		else
		{
			//System.out.println(z);
		}
		test();

		System.out.println(y);
	}

	private static void test() {
//		System.out.println(x);		//cannot access as it is out of scope
//		System.out.println(y);
		
	}
}

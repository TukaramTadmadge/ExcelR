package day5;

public class PlayerDriverApp {

	public static void main(String[] args) {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
							//int String int int
		Player p4=new Player(3,"Vaibhav",20,1500);   //Parameterised  or  AllArgsConstructor
		System.out.println(p4);
						// Player
		Player p5=new Player(p4);
		System.out.println(p5);
		
	}

}

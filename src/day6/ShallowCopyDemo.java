package day6;

public class ShallowCopyDemo {
public static void main(String[] args) {
	Player p1=new Player(18,"Virat",100,5000);
	Player p2=p1;	//shallow copy
	
	p2.setPname("Rohit");
	System.out.println(p1.getPname());//Rohit
	
	System.out.println(p1==p2); //false
}
}

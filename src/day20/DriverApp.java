package day20;

public class DriverApp {

	public static void main(String[] args) {
		
//		Sample s1= null;
//		P p = new C();
//		s1=new GoodMorning();	//eligible candidate for GC
//		s1.greet();
//		
//		s1=new GoodAfternoon();	 //what happens at this line
//		s1.greet();
//		
//		s1=new GoodEvening();	
//		s1.greet();
//		
//		s1=new GoodNight();	
//		s1.greet();
//		
		Sample s2=null;
		s2=()->	System.out.println("Good Morning!!");
		s2.greet();
		
		s2=()->	System.out.println("Good Afternoon!!");
		s2.greet();
		
		s2=()->	System.out.println("Good Evening!!");
		s2.greet();
		
		s2=()->	System.out.println("Good Night!!");
		s2.greet();
		
		
		Shape s3=radius->Math.PI*radius*radius;
		
		System.out.println(s3.area(5.0));
		
		double ans=s3.area(6.0);
		System.out.println(ans);
		
		
		SamplePro s4=(nm,ct)-> System.out.println("Welcome to "+ct +","+nm);
		s4.greet("Pat Cummins","Hyderabad");
		s4.greet("Ajinkya Rahane","Kolkatta");
	}

}

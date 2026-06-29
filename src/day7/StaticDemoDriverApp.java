package day7;

public class StaticDemoDriverApp {

	public static void main(String[] args) {
		Student.displayStrength();  //creating objets is not mandatroy to invoke static methods
		Student s1=new Student(18,"Virat",78.5,true); 			 //strength=3
		
		Student s2=new Student(45,"Rohit",88.5,true);			 //strength=3
		
		Student s3=new Student(33,"Hardik",98.5,true);			 //strength=3
		
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();	
	}

}

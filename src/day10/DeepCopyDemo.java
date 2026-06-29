package day10;

public class DeepCopyDemo {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",78.5);
		
		Student s2=new Student(s1);	//Copy Constructer creates deep copy
		
		s2.setPer(99.9);
		
		System.out.println(s1.getPer());
		
		System.out.println(s1==s2);

	}

}

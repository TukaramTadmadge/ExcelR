package day10;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s1=new Student(18,"Virat",78.5);
		
		Student s2=(Student)s1.clone();   //s2 is deep copy
		
		s2.setPer(99.9);
		
		System.out.println(s1.getPer());  //78.5
		
		System.out.println(s1==s2);		  //false

		System.out.println("HASCODE for Object s1 " +s1.hashCode());
		System.out.println("HASCODE for Object s2 " +s2.hashCode());
	}

}

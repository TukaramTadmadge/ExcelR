package day5;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRno(18);
		s1.setSname("Vaibhav");
		s1.setPer(78.5);
		s1.setOutStationCandidate(true);
		
		//test(s1); //call it explicitly
		
		System.out.println(s1.getSname());
	}

	private static void test(Student s2) 
	{
		
		s2.setRno(18);
		s2.setSname("Vaibhav");
		s2.setPer(78.5);
		s2.setOutStationCandidate(true);	

		s2.setSname("Rohit");
	}
}

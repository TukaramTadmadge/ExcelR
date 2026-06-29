package day4;

public class StudentDriverApp {

	public static void main(String[] args) {
		
		Student s1=new Student();	//bunty object
		
		Student s2=new Student();
		
		Student s3=new Student();

//		System.out.println(s1.rno);  //because private data cannot be access direclty 
//		System.out.println(s1.sname);
		s1.displayStudent();		 //because public data can be access direclty 
		
		s2.displayStudent();
		
		s3.displayStudent();
	}

}

package day23;

public class Student //implements Comparable<Student>
{											

	private int rno;						
	private String sname;					
	private double per;						
	
	public Student() {}		
	public Student(int rno, String sname, double per) throws RuntimeException		
	{
		if(sname==null)
			throw new RuntimeException("Please enter valid name");
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	
	public Student(Student st) 
	{
		this.rno = st.rno;
		this.sname = st.sname;
		this.per = st.per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
//	@Override
//	public int compareTo(Student s1) //compare by rno in ASC order
//	{
//		if(this.rno > s1.rno)
//			return 1;
//		else if(this.rno < s1.rno)
//			return -1;
//		else
//			return 0;
//	}
	
//	@Override
//	public int compareTo(Student s1) //compare by per in DESC order
//	{
//		if(this.per > s1.per)
//			return -1;
//		else if(this.per < s1.per)
//			return 1;
//		else
//			return 0;
//	}
	
	
//	@Override
//	public int compareTo(Student s1) //compare by name in ASC order
//	{
//		return this.sname.compareTo(s1.sname);
//	}
}


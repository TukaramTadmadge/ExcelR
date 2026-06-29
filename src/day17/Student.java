package day17;

public class Student implements Cloneable  
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
	
}


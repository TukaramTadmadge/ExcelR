package day12;

public class Student implements Cloneable   //marker interface is empty interface
{											//use to support that feature

	private int rno;						//instance scope		this is prefixed to the instance scope var
	private String sname;					//instance scope
	private double per;						//instance scope
	
	public Student() {}		//constructor 1
				//		18          null         78.5
	public Student(int rno, String sname, double per) throws Exception		//constructor 2 -AllArgsConstructor
	{
		if(sname==null)
			throw new Exception("Please enter valid name");
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
		protected void finalize() throws Throwable   //destructor
		{
			// TODO Auto-generated method stub
			super.finalize();
		}
}


package day5;

public class Player {

	private int jno;
	private String pname;
	private int mp;
	private int rs;
	
	public Player()	//NoArgsConstructor    srpingboot
	{
		this.jno=18;
		this.pname="Virat";
		mp=100;
		rs=5000;
	}
	
	public Player(int a,String b, int c, int d)	//NoArgsConstructor    srpingboot
	{
		this.jno=a;
		this.pname=b;
		mp=c;
		rs=d;
	}
	
	public Player(Player px)	//Copy Constructor    srpingboot
	{
		this.jno=px.jno;
		this.pname=px.pname;
		mp=px.mp;
		rs=px.rs;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + ", mp=" + mp + ", rs=" + rs + "]";
	}
	
	
}

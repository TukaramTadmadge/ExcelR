package day6;

import java.util.Scanner;

public class Player {

	private int jno;
	private String pname;
	private int mp;
	private int rs;
	
	public Player()	//NoArgsConstructor    srpingboot
	{
		this.jno=18;
		this.pname="Rohit";
		mp=100;
		rs=5000;
	}
	
	public Player(int a,String b, int c, int d)	//AllArgsConstructor    srpingboot
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
		return this.pname;
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
	
	
	public void acceptPlayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey Number");
		this.jno=sc.nextInt();
		System.out.println("Enter Player Name");
		this.pname=sc.next();
		System.out.println("Enter Matches Played");
		this.mp=sc.nextInt();
		System.out.println("Enter Runs Scored");
		this.rs=sc.nextInt();
	}
	
	public boolean search(int sjno)		//method overloading
	{									//2 or multiple functions can have the same name in the same class
		if(this.jno==sjno)				//with different paramter/args list		
			return true;				//for overloading inheritance is not required
		else
			return false;
	}

	public boolean search(String searchPname) {
		if(this.pname.equalsIgnoreCase(searchPname))
			return true;
		else
			return false;
	}
}

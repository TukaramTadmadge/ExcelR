package day9.ver2;

public class Customer {

	private String username;
	private String password;
	
	public Customer() {}
	public Customer(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean login(String user,String pass)
	{
		if(user.equalsIgnoreCase(this.username) && pass.equals(this.password))
		return true;
		else
		return false;
	}
}

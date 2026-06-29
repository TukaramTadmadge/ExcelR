package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUsingStatement {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/excelrworldcupdb", "root", ""
	);
	
	Statement st=connection.createStatement();
	
	String query="update emp set sal=1500 where ename like 'Chris'";
	
	int rows=st.executeUpdate(query);
	System.out.println(rows + " records updated");
	
	st.close();
	connection.close();
}
}

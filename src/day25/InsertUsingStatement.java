package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/excelrworldcupdb", "root", ""
	);
	
	Statement st=connection.createStatement();
	
	String query="insert into emp values(1,'Alice',800.0)";
	
	int rows=st.executeUpdate(query);
	System.out.println(rows + " records inserted");
	
	st.close();
	connection.close();
}
}

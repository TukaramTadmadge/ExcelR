package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//City A
public class CreateTable {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrworldcupdb", "root", ""
		);

		//System.out.println(connection.isClosed()); //false
		
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10) not null,\r\n"
				+ "sal numeric(7,2))";
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		System.out.println("Table Created");
		
		st.close();
		connection.close();
		
	}

}

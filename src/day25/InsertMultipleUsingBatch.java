package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMultipleUsingBatch {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/excelrworldcupdb", "root", ""
	);
	
	Statement st=connection.createStatement();
	
//	String query1="insert into emp values(2,'Ben',900.0)";
//	String query2="insert into emp values(3,'Chris',1000.0)";
	String query3="insert into emp values(4,'David',1100.0)";
	String query4="insert into emp values(5,'Elcid',1200.0)";
						   //0  1   2   3
//	st.addBatch(query1);   //1	1	1	1
//	st.addBatch(query2);
	st.addBatch(query3);
	st.addBatch(query4);
	
	int rows[]=st.executeBatch();
	System.out.println(rows.length + " records inserted");
	
	st.close();
	connection.close();
}
}

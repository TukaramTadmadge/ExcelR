package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUsingStatement {
public static void main(String[] args) throws Exception
{
	Connection connection=ExcelRMySQLConnection.getConnection();
	
	Statement st=connection.createStatement();
	
	String query="delete from emp where ename like 'Elcid'";
	
	int rows=st.executeUpdate(query);
	System.out.println(rows + " records deleted");
	
	st.close();
	connection.close();
}
}

package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class DeleteUsingPreparedStatement {
public static void main(String[] args) throws Exception
{
	Connection con = ExcelRMySQLConnection.getConnection();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee number");
	int a=sc.nextInt();
	
	
	String query="delete from emp where eno=?";
	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, a);
	
	
	int rows=ps.executeUpdate();
	
	System.out.println(rows + " records deleted");
	ps.close();
	con.close();
}
}

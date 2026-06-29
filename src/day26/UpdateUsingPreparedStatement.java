package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		// accept eno and increment the salary of that employee by 500
		Connection con = ExcelRMySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number");
		int a=sc.nextInt();
		
		
		String query="update emp set sal=sal+500 where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, a);
		
		
		int rows=ps.executeUpdate();
		
		System.out.println(rows + " records updated");
		ps.close();
		con.close();

	}

}

package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class UpdateUsingPreparedStatement3 {

	public static void main(String[] args) throws Exception
	{
		// accept eno & increment amount and new name - update the salary of that employee by that amount,also update new name
		Connection con = ExcelRMySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number");
		int a=sc.nextInt();
		
		System.out.println("Enter salary increment");
		double b=sc.nextDouble();
		
		System.out.println("Enter new name");
		String c=sc.next();
		
		
		String query="update emp set ename=?, sal=sal+? where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, c);
		ps.setDouble(2, b);
		ps.setInt(3, a);
		
		
		int rows=ps.executeUpdate();
		
		System.out.println(rows + " records updated");
		ps.close();
		con.close();

	}

}

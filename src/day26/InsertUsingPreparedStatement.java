package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		
		Connection con = ExcelRMySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number");
		int a=sc.nextInt();
		
		System.out.println("Enter employee name");
		String b=sc.next();
		
		System.out.println("Enter employee salary");
		double c=sc.nextDouble();
		
		String query="insert into emp values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		int rows=ps.executeUpdate();
		
		System.out.println(rows + " records inserted");
		ps.close();
		con.close();
		
	}
}

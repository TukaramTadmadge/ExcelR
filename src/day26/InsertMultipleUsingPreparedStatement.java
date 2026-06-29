package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class InsertMultipleUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		
		Connection con = ExcelRMySQLConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Employees you wish to insert");
		int count=sc.nextInt();
		
		String query="insert into emp values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		
		
		
		for(int i=1;i<=count;i++)
		{
		System.out.println("Enter employee number");
		int a=sc.nextInt();
		
		System.out.println("Enter employee name");
		String b=sc.next();
		
		System.out.println("Enter employee salary");
		double c=sc.nextDouble();
		
		
		
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		ps.addBatch();
		}
		
		int rows[]=ps.executeBatch();
		
		System.out.println(rows[1] + " records inserted");
		ps.close();
		con.close();
	}
}


//ORM Object Relational Mapping

//Employee e1=new Employee(8,"Employee",2000.0)    ---> pass e1 --> Hibernate
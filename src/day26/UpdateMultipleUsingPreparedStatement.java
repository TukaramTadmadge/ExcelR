package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class UpdateMultipleUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		
		Connection con = ExcelRMySQLConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Employees you wish to insert");
		int count=sc.nextInt();
		
		String query="insert into emp values(?,?,?)";    //11,12,13
		PreparedStatement psInsert=con.prepareStatement(query);
		
		for(int i=1;i<=count;i++)
		{
		System.out.println("Enter employee number");
		int a=sc.nextInt();
		
		System.out.println("Enter employee name");
		String b=sc.next();
		
		System.out.println("Enter employee salary");
		double c=sc.nextDouble();
		
		
		
		
		psInsert.setInt(1, a);
		psInsert.setString(2, b);
		psInsert.setDouble(3, c);
		psInsert.addBatch();
		}
		
		int rows[]=psInsert.executeBatch();
		
		System.out.println(rows.length + " records inserted");
		psInsert.close();
		
		
		
		String query1="delete from emp where eno=11";    
		String query2="delete from emp where eno=12";
		String query3="delete from emp where eno=13";
		Statement sDelete=con.createStatement();
		
		sDelete.addBatch(query1);
		sDelete.addBatch(query2);
		sDelete.addBatch(query3);
		
		int rows1[]=sDelete.executeBatch();
		
		System.out.println(rows1.length + " records deleted");
		psInsert.close();
		
		
		
		con.close();
	}
}


//ORM Object Relational Mapping

//Employee e1=new Employee(8,"Employee",2000.0)    ---> pass e1 --> Hibernate
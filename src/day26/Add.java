package PreparedStatementMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import MySQLConnection.MysqlConnection;

public class Add extends Thread{
	@Override
	
	 public void run() {
		try {
		Connection con = MysqlConnection.getConnection();
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

		con.close();
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

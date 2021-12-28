package com.xworkz.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After loading and registration");
			
			String url="jdbc:mysql://localhost:3306/liberary";
			String username="root";
			String password="Ka01m@8647";
			
			 mysql=DriverManager.getConnection(url, username, password);
			if(!mysql.isClosed())
			{
				System.out.println("mysql database is open");
				
				String str="insert into Books_Details values(12,'Marvel secret','Jim Shooter',1500.5,2020,'V7')";
				Statement stat=mysql.createStatement();
				int rowsAffected=stat.executeUpdate(str);
				System.out.println("no of rows affected "+rowsAffected);
			}
			
			System.out.println("After connecting");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			try {
				
					mysql.close();
					System.out.println("Closed the resource");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}

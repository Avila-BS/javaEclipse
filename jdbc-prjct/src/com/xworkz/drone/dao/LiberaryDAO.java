package com.xworkz.drone.dao;
import com.xworkz.drone.dto.LiberaryDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.xworkz.drone.constants.LiberaryConstant;

public class LiberaryDAO {
	
	public boolean save(LiberaryDTO dto)
	{
		Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			mysql=DriverManager.getConnection(LiberaryConstant.URL,LiberaryConstant.USERNAME, LiberaryConstant.PASSWORD);
			//Book_Id,Book_Name,Author_Name,Book_Price,Publish_Year
			String sql="insert into Books_Details values("+dto.getBookId()+",'"+dto.getBookName()+"','"+dto.getAuthorName()+"',"+dto.getBookPrice()+","+dto.getPublishYear()+",'"+dto.getBookVolume()+"')";
			java.sql.Statement stat=mysql.createStatement();
			int rowsAffected=stat.executeUpdate(sql);
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(mysql!=null)
			try {
				
					mysql.close();
					System.out.println("Closed the resource");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public boolean deleteOperation(int id)
	{
		Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			mysql=DriverManager.getConnection(LiberaryConstant.URL,LiberaryConstant.USERNAME, LiberaryConstant.PASSWORD);
			//Book_Id,Book_Name,Author_Name,Book_Price,Publish_Year
			String sql="delete from Books_Details where Book_Id="+id;
			java.sql.Statement stat=mysql.createStatement();
			int rowsAffected=stat.executeUpdate(sql);
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(mysql!=null)
			try {
				
					mysql.close();
					System.out.println("Closed the resource");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
			
		return false;
		
		}
}

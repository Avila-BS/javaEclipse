package com.xworkz.drone.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.drone.constants.LiberaryConstant;

import com.xworkz.drone.dto.IceCreamDTO;

public class IceCreamDAO {
	
	public boolean save(IceCreamDTO dto)
	{
		Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			mysql=DriverManager.getConnection(LiberaryConstant.URL,LiberaryConstant.USERNAME, LiberaryConstant.PASSWORD);
			//Book_Id,Book_Name,Author_Name,Book_Price,Publish_Year
			String sql="insert into IceCream_details values("+dto.getCreamId()+",'"+dto.getCflavour()+"','"+dto.getcName()+"',"+dto.getCprice()+")";
			java.sql.Statement stat=mysql.createStatement();
			int rowsAffected=stat.executeUpdate(sql);
			System.out.println(sql);
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
			String sql="delete from IceCream_details where cream_id="+id;
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

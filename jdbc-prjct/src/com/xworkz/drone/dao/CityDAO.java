package com.xworkz.drone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.drone.dto.CityDTO;
import com.xworkz.stat.utils.DBUtil;


public class CityDAO {
	Connection mysql=null;
	public boolean save(CityDTO dto)
	{
		Connection mysql=null;
		mysql=DBUtil.createConnection();
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//mysql=DriverManager.getConnection(LiberaryConstant.URL,LiberaryConstant.USERNAME, LiberaryConstant.PASSWORD);
			//+dto.getCid()+",'"+dto.getcName()+"',"+dto.getcPoupulation()+",'"+dto.getcFamousFor()+"'
			
			String sql="insert into City_details values(?,?,?,?)";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, dto.getCid());
			stat.setObject(2, dto.getcName());
			stat.setObject(3, dto.getcPoupulation());
			stat.setObject(4, dto.getcFamousFor());
			int rowsAffected=stat.executeUpdate();
			System.out.println(sql);
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
			
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(mysql);
		}
		
		return false;
	}

	public boolean deleteOperation(int id)
	{
           mysql=DBUtil.createConnection();
		
		try {
			
	
			String sql="delete from city_details where city_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			int rowsAffected=stat.executeUpdate();
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		return false;
	}
	
	public void readOperationById(int id)
	{
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="select * from city_details where city_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object city_id=result.getObject(1);
				System.out.println("City_id- "+city_id);
				Object city_name=result.getObject(2);
				System.out.println("City_Name - "+city_name);
				Object city_population=result.getObject(3);
				System.out.println("City_Population - "+city_population);
				Object city_famousFor=result.getObject(4);
				System.out.println("City_FamousFor -"+city_famousFor);
				
			}
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
		
		
		
		
	}
	
	public void displayAll()
	{
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="select * from City_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object city_id=result.getObject(1);
				Object city_name=result.getObject(2);
				Object city_population=result.getObject(3);
				Object city_famousFor=result.getObject(4);
				System.out.println("Cityy_id- "+city_id+" "+"City_Name- "+city_name+" "+"City_population- "+city_population+" "+"city_FamousFor- "+city_famousFor);
			}
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
		
		
		
		
	}
	
	public void displayTotalRows()
	{
mysql=DBUtil.createConnection();
		
		try {
			
	
			String sql="select count(*) from City_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in Country_detailss table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}
	
		
	
		
		
		



}

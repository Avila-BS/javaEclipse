package com.xworkz.drone.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.drone.dto.FestivalDTO;
import com.xworkz.stat.utils.DBUtil;


public class FestivalDAO {
	Connection mysql=null;
	public boolean save(FestivalDTO dto)
	{
		mysql=DBUtil.createConnection();
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//mysql=DriverManager.getConnection(LiberaryConstant.URL,LiberaryConstant.USERNAME, LiberaryConstant.PASSWORD);
			//String sql="insert into festival_detailss values("+dto.getFid()+",'"+dto.getFname()+"',"+dto.getfDate()+",'"+dto.getfState()+"')";-->concatenation causes Sql injection
			//java.sql.Statement stat=mysql.createStatement();
			String sql="insert into festival_detailss values(?,?,?,?)";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, dto.getFid());
			stat.setObject(2, dto.getFname());
			stat.setObject(3, dto.getfDate());
			stat.setObject(4, dto.getfState());
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
			
			String sql="delete from festival_detailss where festival_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			int rowsAffected=stat.executeUpdate();
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
		} catch (SQLException e) {
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
			
			
			String sql="select * from festival_detailss where festival_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object festival_id=result.getObject(1);
				System.out.println("Festival_id- "+festival_id);
				Object festival_name=result.getObject(2);
				System.out.println("Festival_Name - "+festival_name);
				Object festival_date=result.getObject(3);
				System.out.println("Festival_Date - "+festival_date);
				Object festival_state=result.getObject(4);
				System.out.println("Festival_state -"+festival_state);
				
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
			
			
			String sql="select * from festival_detailss";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object festival_id=result.getObject(1);
				Object festival_name=result.getObject(2);
				Object festival_date=result.getObject(3);
				Object festival_state=result.getObject(4);
				System.out.println("Festival_id- "+festival_id+" "+"Festival_Name- "+festival_name+" "+"Festival_date- "+festival_date+"  "+"festival_State- "+festival_state);
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
			
	
			String sql="select count(*) from festival_detailss";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in festival_detailss table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}
	
		
	

	

}

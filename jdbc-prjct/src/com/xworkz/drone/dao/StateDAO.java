package com.xworkz.drone.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.drone.dto.StateDTO;
import com.xworkz.stat.utils.DBUtil;


public class StateDAO  {
	Connection mysql=null;
	public boolean save(StateDTO dto)
	{
		mysql=DBUtil.createConnection();
		
		
		try {
			
			
			String sql="insert into State_details values(?,?,?,?)";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, dto.getSid());
			stat.setObject(2, dto.getSname());
			stat.setObject(3, dto.getsCode());
			stat.setObject(4, dto.getsCapital());
			int rowsAffected=stat.executeUpdate();
			System.out.println(sql);
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
			
		} catch (SQLException e) {
		
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
			
			String sql="delete from State_details where state_id=?";
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
			
			
			String sql="select * from State_details where state_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object sid=result.getObject(1);
				System.out.println("State_id- "+sid);
				Object name=result.getObject(2);
				System.out.println("State_Name - "+name);
				Object code=result.getObject(3);
				System.out.println("state_code - "+code);
				Object capital=result.getObject(4);
				System.out.println("State_Capital -"+capital);
				
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
			
			
			String sql="select * from State_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object state_id=result.getObject(1);
				Object state_name=result.getObject(2);
				Object state_code=result.getObject(3);
				Object state_Capital=result.getObject(4);
				System.out.println("State_id- "+state_id+" "+"State_Name- "+state_name+" "+"State_code- "+state_code+" "+"State_capital- "+state_Capital);
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
			
	
			String sql="select count(*) from State_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in State_details table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}
	


}

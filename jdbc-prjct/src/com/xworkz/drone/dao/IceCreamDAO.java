package com.xworkz.drone.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.drone.dto.IceCreamDTO;
import com.xworkz.stat.utils.DBUtil;

public class IceCreamDAO {
	Connection mysql=null;
	public boolean save(IceCreamDTO dto)
	{
		mysql=DBUtil.createConnection();
		
		try {
			
			String sql="insert into Icecream_details values(?,?,?,?)";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, dto.getCreamId());
			stat.setObject(2, dto.getCflavour());
			stat.setObject(3, dto.getcName());
			stat.setObject(4, dto.getCprice());
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
		
			String sql="delete from IceCream_details where cream_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			int rowsAffected=stat.executeUpdate();
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
	
	public void readOperationById(int id)
	{
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="select * from IceCream_details where cream_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object cream_id=result.getObject(1);
				System.out.println("IceCream_id- "+cream_id);
				Object cream_flav=result.getObject(2);
				System.out.println("Icecream-flavour - "+cream_flav);
				Object Icecream_Name=result.getObject(3);
				System.out.println("Icecream_Name - "+Icecream_Name);
				Object price=result.getObject(4);
				System.out.println("Icecream_price -"+price);
				
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
			
			
			String sql="select * from IceCream_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object id=result.getObject(1);
				Object flav=result.getObject(2);
				Object name=result.getObject(3);
				Object price=result.getObject(4);
				System.out.println("Icecream_id- "+id+" "+"IceCream_Flavour- "+flav+" "+"IceCream_Name- "+name+"  "+"Icecream_Price- "+price);
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
			
	
			String sql="select count(*) from IceCream_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in IceCream_detailss table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}


}

package com.xworkz.drone.dao;
import com.xworkz.drone.dto.TrainDTO;
import com.xworkz.stat.utils.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class TrainDAO {
	Connection mysql=null;
	
	
	public boolean save(TrainDTO dto)
	{
		
		mysql=DBUtil.createConnection();
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//mysql=DriverManager.getConnection(LiberaryConstant.URL,LiberaryConstant.USERNAME, LiberaryConstant.PASSWORD);
			//+dto.getCid()+",'"+dto.getcName()+"',"+dto.getcPoupulation()+",'"+dto.getcFamousFor()+"'
			
			String sql="insert into Train_detailss values(?,?,?,?,?,?,?,?)";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, dto.getTrainId());
			stat.setObject(2, dto.getTrainNo());
			stat.setObject(3, dto.getBoarding());
			stat.setObject(4, dto.getDestination());
			stat.setObject(5, dto.getSeatNo());
			stat.setObject(6, dto.getTicketPrice());
			stat.setObject(7, dto.getClasss());
			stat.setObject(8, dto.getName());
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
	
	public boolean deleteByTrainNo(String TrainNo)
	{
		 mysql=DBUtil.createConnection();
			
			try {
				
		
				String sql="delete from train_detailss where train_no=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, TrainNo);
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
	
	public boolean deleteByTrainNoAndTrainId(String TrainNo,int tid)
	{
		 mysql=DBUtil.createConnection();
			
			try {
				
		
				String sql="delete from train_detailss where train_No=? and train_Id=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, TrainNo);
				stat.setObject(2, tid);
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
	
	public TrainDTO getByTrainNo(String trainNo)
	{
     mysql=DBUtil.createConnection();
		TrainDTO dtoo=null;
		try {
			
			
			String sql="select * from train_detailss where train_no=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, trainNo);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int train_id=result.getInt(1);
				System.out.println("train_id- "+train_id);
				String train_no=result.getString(2);
				System.out.println("train_No - "+train_no);
				String boarding=result.getString(3);
				System.out.println("boarding - "+boarding);
				String destination=result.getString(4);
				System.out.println("destination -"+destination);
				int seat_No=result.getInt(5);
				System.out.println("seat_No- "+seat_No);
				double ticketPrice=result.getDouble(6);
				System.out.println("train_Price - "+ticketPrice);
				String classs=result.getString(7);
				System.out.println("Class - "+classs);
				String name=result.getString(8);
				System.out.println("name -"+name);
				
			dtoo=new TrainDTO(train_id,train_no,boarding,destination,seat_No,ticketPrice,classs,name); 	
				return dtoo;
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
			
		
		return null;
	}
	
public Collection<TrainDTO> getAll()
{
	
	mysql=DBUtil.createConnection();
	Collection<TrainDTO> details=new ArrayList<TrainDTO>();
	TrainDTO dtoo=new TrainDTO();
	
	
	try {
		
		
		String sql="select * from Train_detailss";
		PreparedStatement stat=mysql.prepareStatement(sql);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			
			int train_id=result.getInt(1);
			String train_no=result.getString(2);
			String boarding=result.getString(3);
			String destination=result.getString(4);
			int seat_No=result.getInt(5);
			double ticketPrice=result.getDouble(6);
			String classs=result.getString(7);
			String name=result.getString(8);
			
			dtoo.setTrainId(train_id);
			dtoo.setTrainNo(train_no);
			dtoo.setBoarding(boarding);
			dtoo.setDestination(destination);
			dtoo.setSeatNo(seat_No);
			dtoo.setTicketPrice(ticketPrice);
			dtoo.setClasss(classs);
			dtoo.setName(name);
			
			details.add(dtoo);
			
			System.out.println("Train_id- "+train_id+" "+"Train_No- "+train_no+" "+"boarding- "+boarding+" "+"destination- "+destination+"  "+"Seat No- "+seat_No+"  "+"Ticket Price- "+ticketPrice+"  "+"Class- "+classs+"  "+"name- "+name);
			
			
	
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
		
	return details;
}

public Collection<TrainDTO> getAllByBoarding(String boardingg)
{
	
	mysql=DBUtil.createConnection();
	Collection<TrainDTO> details=new ArrayList<TrainDTO>();
	TrainDTO dtoo=new TrainDTO();
	
	
	try {
		
		
		String sql="select * from Train_detailss where boarding=?";
		PreparedStatement stat=mysql.prepareStatement(sql);
		stat.setObject(1, boardingg);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			
			int train_id=result.getInt(1);
			String train_no=result.getString(2);
			String boarding=result.getString(3);
			String destination=result.getString(4);
			int seat_No=result.getInt(5);
			double ticketPrice=result.getDouble(6);
			String classs=result.getString(7);
			String name=result.getString(8);
			
			dtoo.setTrainId(train_id);
			dtoo.setTrainNo(train_no);
			dtoo.setBoarding(boarding);
			dtoo.setDestination(destination);
			dtoo.setSeatNo(seat_No);
			dtoo.setTicketPrice(ticketPrice);
			dtoo.setClasss(classs);
			dtoo.setName(name);
			
			details.add(dtoo);
			
			System.out.println("Train_id- "+train_id+" "+"Train_No- "+train_no+" "+"boarding- "+boarding+" "+"destination- "+destination+"  "+"Seat No- "+seat_No+"  "+"Ticket Price- "+ticketPrice+"  "+"Class- "+classs+"  "+"name- "+name);
			
			
	
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
		
	return details;
}

public Collection<TrainDTO> getAllByDestination(String dest)
{
	
	mysql=DBUtil.createConnection();
	Collection<TrainDTO> details=new ArrayList<TrainDTO>();
	TrainDTO dtoo=new TrainDTO();
	
	
	try {
		
		
		String sql="select * from Train_detailss where destination=?";
		PreparedStatement stat=mysql.prepareStatement(sql);
		stat.setObject(1, dest);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			
			int train_id=result.getInt(1);
			String train_no=result.getString(2);
			String boarding=result.getString(3);
			String destination=result.getString(4);
			int seat_No=result.getInt(5);
			double ticketPrice=result.getDouble(6);
			String classs=result.getString(7);
			String name=result.getString(8);
			
			dtoo.setTrainId(train_id);
			dtoo.setTrainNo(train_no);
			dtoo.setBoarding(boarding);
			dtoo.setDestination(destination);
			dtoo.setSeatNo(seat_No);
			dtoo.setTicketPrice(ticketPrice);
			dtoo.setClasss(classs);
			dtoo.setName(name);
			
			details.add(dtoo);
			
			System.out.println("Train_id- "+train_id+" "+"Train_No- "+train_no+" "+"boarding- "+boarding+" "+"destination- "+destination+"  "+"Seat No- "+seat_No+"  "+"Ticket Price- "+ticketPrice+"  "+"Class- "+classs+"  "+"name- "+name);
			
			
	
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
		
	return details;
}

public boolean updateDestinationByTrainNo(String newDest,String trainNo)
{
	mysql=DBUtil.createConnection();
	try {
		
		
		String sql="Update train_detailss "+ "set destination=?"+"where train_no=? ";
		PreparedStatement stat=mysql.prepareStatement(sql);
		stat.setObject(1, newDest);
		stat.setObject(2, trainNo);
		int rowsAffected=stat.executeUpdate();
		if(rowsAffected==1)
		{
			System.out.println("updated: "+rowsAffected);
			return true;
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
		
	
	
	return false;
}

public boolean updateDestinationAndBoardingByTrainNo(String newDest,String newBoarding,String trainNo)
{
	mysql=DBUtil.createConnection();
	try {
		
		
		String sql="Update train_detailss "+ "set destination=?,boarding=?"+"where train_no=? ";
		PreparedStatement stat=mysql.prepareStatement(sql);
		stat.setObject(1, newDest);
		stat.setObject(2, newBoarding);
		stat.setObject(3, trainNo);
		int rowsAffected=stat.executeUpdate();
		if(rowsAffected==1)
		{
			System.out.println("updated new dest and new boarding: "+rowsAffected);
			return true;
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
		
	
	
	return false;
}

public int getTotal()
{
	mysql=DBUtil.createConnection();
	
	try {
		

		String sql="select count(*) from train_detailss";
		PreparedStatement stat=mysql.prepareStatement(sql);
		ResultSet result=stat.executeQuery();
		result.next();
		int count=result.getInt(1);
		System.out.println("No of rows in train_detailss table - "+count);
		return count;
		
		
	}  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		DBUtil.closeConnection(mysql);
	}
	return 0;
}

public double getMaxPrice()
{
	mysql=DBUtil.createConnection();
	double maxPrice=0;
	
try {
		

		String sql="select max(ticket_price) from train_detailss";
		PreparedStatement stat=mysql.prepareStatement(sql);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			 maxPrice=result.getDouble(1);
			System.out.println("MaxPrice= "+maxPrice);
		}
		
		
		
	}  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		DBUtil.closeConnection(mysql);
	}
	
	return maxPrice;
}

public double getMinPrice()
{
	mysql=DBUtil.createConnection();
	double minPrice=0;
	
try {
		

		String sql="select min(ticket_price) from train_detailss";
		PreparedStatement stat=mysql.prepareStatement(sql);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			 minPrice=result.getDouble(1);
			System.out.println("MinPrice= "+minPrice);
		}
		
		
		
	}  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		DBUtil.closeConnection(mysql);
	}
	
	return minPrice;
}

}

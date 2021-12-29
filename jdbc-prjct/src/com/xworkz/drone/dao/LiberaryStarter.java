package com.xworkz.drone.dao;
import com.xworkz.drone.dto.LiberaryDTO;

public class LiberaryStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book_Id,Book_Name,Author_Name,Book_Price,Publish_Year
		
		LiberaryDTO dto=new LiberaryDTO(12,"The Daughters tale","Mark Twain",650.00,2002,"V7");
		
		LiberaryDAO dao=new LiberaryDAO();
		//dao.save(dto);
		dao.deleteOperation(12);
		
		

	}

}

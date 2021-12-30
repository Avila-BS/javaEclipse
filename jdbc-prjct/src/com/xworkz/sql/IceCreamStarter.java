package com.xworkz.sql;
import com.xworkz.drone.dto.IceCreamDTO;
import com.xworkz.drone.dao.IceCreamDAO;

public class IceCreamStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IceCreamDTO dto1=new IceCreamDTO(1,"Amul Ice Cream","Chocolate",99.99f);
		IceCreamDTO dto2=new IceCreamDTO(2,"Baskin Robbins","Vanilla",299.99f);
		IceCreamDTO dto3=new IceCreamDTO(3,"London Dairy","Butter Scotch",90.00f);
		IceCreamDTO dto4=new IceCreamDTO(4,"Kwality Walls","Black Current",165.00f);
		IceCreamDTO dto5=new IceCreamDTO(5,"Cornetto","Caramel",133.00f);
		IceCreamDTO dto6=new IceCreamDTO(6,"NOTO","Oreo",120.00f);
		IceCreamDTO dto7=new IceCreamDTO(7,"Kwality Walls","Black Current",165.00f);
		
		IceCreamDAO dao=new IceCreamDAO();
		
	    dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto6);
		dao.save(dto7);
		
		dao.deleteOperation(7);
		
		dao.readOperationById(2);
		
		dao.displayAll();
		dao.displayTotalRows();
		
		
		

	}

}

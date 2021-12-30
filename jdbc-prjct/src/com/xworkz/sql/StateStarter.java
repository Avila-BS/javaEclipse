package com.xworkz.sql;
import  com.xworkz.drone.dto.StateDTO;
import com.xworkz.drone.dao.StateDAO;


public class StateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateDTO dto1=new StateDTO(1,"Karnataka",80,"Banglore");
		StateDTO dto2=new StateDTO(2,"Madhya Pradesh",48,"Bhopal");
		StateDTO dto3=new StateDTO(3,"Tamil Nadu",44,"Chennai");
		StateDTO dto4=new StateDTO(4,"Punjab",147,"Chandigarh");
		StateDTO dto5=new StateDTO(5,"Jharkhand",92,"Ranchi");
		StateDTO dto6=new StateDTO(6,"Madhya Pradesh",48,"Bhopal");
		
		StateDAO dao =new StateDAO();
		
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto6);

		
		dao.deleteOperation(6);
		dao.readOperationById(2);
		
		dao.displayAll();
		
		dao.displayTotalRows();
	}

}

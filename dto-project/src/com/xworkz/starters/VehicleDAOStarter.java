package com.xworkz.starters;
import com.xworkz.dto.examples.dao.VehicleDAO;
import com.xworkz.dto.examples.VehicleDTO;

public class VehicleDAOStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleDAO dao=new VehicleDAO();
		VehicleDTO vehicle1=new VehicleDTO("Toyota","Red",5,15.0f,"Diesel");
		VehicleDTO vehicle2=new VehicleDTO("Swift","Black",6,17.0f,"Petrol");
		VehicleDTO vehicle3=new VehicleDTO();
		VehicleDTO vehicle4=new VehicleDTO("BMW","White",8,42.0f,"Diesel");
		VehicleDTO vehicle5=new VehicleDTO("Scoda","Blue",7,30.0f,"Petrol");
		VehicleDTO vehicle7=new VehicleDTO();
		
		dao.add(vehicle1);
		dao.add(vehicle7);
		dao.add(vehicle5);
		dao.add(null);
		dao.add(vehicle4);
		dao.add(vehicle3);
		dao.add(vehicle2);
		dao.add(null);
		
		dao.delete(1);
		dao.delete(4);
		
		

	}

}

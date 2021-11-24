package com.xworkz.starters;

import com.xworkz.dto.examples.BusRouteDTO;
import com.xworkz.dto.examples.dao.BusRouteDAO;
import com.xworkz.implementation.busRouteDao.BusRouteImp;
import com.xworkz.implementation.busRouteDao.BusRouteManager;

public class BusRouteStarter {

	public static void main(String[] args) {
		
		BusRouteDAO daos=new BusRouteImp();
		
		BusRouteDTO dto1=new BusRouteDTO(1,"Virajpet","Madikeri","Baabu");
		BusRouteDTO dto2=new BusRouteDTO(2,"Somwarpet","Kushal Nagar","Ganesh");
		BusRouteDTO dto3=new BusRouteDTO(3,"Gonikoppa","Ponnampet","Raaju");
		daos.save(dto1);
		daos.save(dto2);
		
		
		
		
		
		BusRouteManager manager=new BusRouteManager(daos);
		
		manager.saveRoute(dto3);
		
		manager.findRoute("Ponnampet");
		
		manager.displayRoute();
		

	}

}

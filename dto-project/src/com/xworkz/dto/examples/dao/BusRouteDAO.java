package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.BusRouteDTO;

public interface BusRouteDAO {
	
	 BusRouteDTO[] busRouteDTO=new BusRouteDTO[3];
	
void save(BusRouteDTO dto);

void findByDestination(String name);

void displayDetails();

}

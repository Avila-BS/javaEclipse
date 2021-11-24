package com.xworkz.implementation.busRouteDao;
import com.xworkz.dto.examples.BusRouteDTO;
import com.xworkz.dto.examples.dao.BusRouteDAO;



public class BusRouteManager {
	
	private BusRouteDAO dao;
	
	public BusRouteManager(BusRouteDAO dao)
	{
		this.dao=dao;
		System.out.println("Invoked BusRouteManager parameterised constructor");
	}
	
	public void saveRoute(BusRouteDTO dto)
	{
		if(this.dao!=null && dto!=null )
		{
			dao.save(dto);
		}
		else
		{
			System.out.println("dto or dao cannot be null");
		}
	}
	
	public void findRoute(String destination)
	{
		if(this.dao!=null && destination!=null)
		{
			dao.findByDestination(destination);
		}
		
		else
		{
			System.out.println(" dao or destination cannot be null");
		}
	}
	
	public void displayRoute()
	{
		if(this.dao!=null)
		{
			dao.displayDetails();
		}
		else
		{
			System.out.println("  dao cannot be null");
		}
	}
	

}

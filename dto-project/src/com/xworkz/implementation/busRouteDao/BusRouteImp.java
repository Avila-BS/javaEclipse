package com.xworkz.implementation.busRouteDao;
import com.xworkz.dto.examples.BusRouteDTO;
import com.xworkz.dto.examples.dao.BusRouteDAO;

public class BusRouteImp implements BusRouteDAO {
	
	private BusRouteDTO[] busRouteDTO=new BusRouteDTO[3];
	private int count=0;
	
	public BusRouteImp()
	{
		System.out.println("Invoked no arg constructor from BusRouteImp");
	}
	
	public void save(BusRouteDTO dto)
	{
		if(dto!=null && this.count<this.busRouteDTO.length)
		{
			this.busRouteDTO[count]=dto;
			System.out.println("busrouteDTO added at index"+count);
			System.out.println("id- "+dto.getId());
			System.out.println("id- "+dto.getStartPoint());
			System.out.println("id- "+dto.getDestination());
			System.out.println("id- "+dto.getDriverName());
			
			this.count++;
		
		}
		else
		{
			System.out.println("busRouteDTO is full or you have passed null");
		}
		
	}

	public void findByDestination(String name)
	{
		if(name!=null)
		{
			for(int key=0;key<this.busRouteDTO.length;key++)
			{
				BusRouteDTO route=this.busRouteDTO[key];
			
				if(route!=null)
				{
					String destination=route.getDestination();
					
					if(name.equals(destination))
					{
						System.out.println(name +" Destination name matched at index "+key );
					}
					else
					{
						System.out.println("Destination not matched");
					}
				}
				else
				{
					System.out.println("route cannot be null");
				}
			}
		}
		else
		{
			System.out.println("Name that u pass cannot be null");
		}
		
	}

	public void displayDetails()
	{
		for(int lock=0;lock<this.busRouteDTO.length;lock++)
		{
			BusRouteDTO contents=busRouteDTO[lock];
			
			if(contents!=null)
			{
				int id=contents.getId();
				String startPoint=contents.getStartPoint();
				String destination=contents.getDestination();
				String driver=contents.getDriverName();
				
				System.out.println("ID "+id);
				System.out.println("Start Point "+startPoint);
				System.out.println("Destination "+destination);
				System.out.println("driver name  "+driver);
			}
		}
		
	}

	

}

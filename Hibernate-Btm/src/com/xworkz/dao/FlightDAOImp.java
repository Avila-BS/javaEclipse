package com.xworkz.dao;

import org.hibernate.cfg.Configuration;

import com.xworkz.dto.entity.FlightEntity;

public class FlightDAOImp implements FlightDAO {
	@Override
	public void save(FlightEntity entity)
	{
		System.out.println("invoked save: ".concat(entity.toString()));
		
		Configuration configuration=new Configuration();
		
		configuration.configure();
	}

}

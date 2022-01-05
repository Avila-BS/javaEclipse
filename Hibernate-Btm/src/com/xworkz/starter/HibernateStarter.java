package com.xworkz.starter;
import com.xworkz.dao.FlightDAO;
import com.xworkz.dao.FlightDAOImp;
import com.xworkz.dto.entity.FlightEntity;

public class HibernateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlightDAO dao=new FlightDAOImp();
		
		dao.save(new FlightEntity());

	}

}

package com.xworkz.sql;
import com.xworkz.drone.dto.TrainDTO;

import java.util.Collection;

import com.xworkz.drone.dao.TrainDAO;


public class TrainStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainDTO dto1=new TrainDTO(1,"15609","Banglore","Hyderabad",26,900.00,"A","Akola Purna Express");
		TrainDTO dto2=new TrainDTO(2,"07789","Delhi","Bombay",52,1700.00,"D","Shatabdhi Express");
		TrainDTO dto3=new TrainDTO(3,"14657","Amritsar","Saharsa",15,400.00,"E","Danapur Express");
		TrainDTO dto4=new TrainDTO(4,"13209","Mysore","Banglore",8,150.00,"A","Anga Express");
		TrainDTO dto5=new TrainDTO(6,"07567","New Delhi","Vishakapatnam",26,800.00,"C","Bhagalpur Express");
		TrainDTO dto6=new TrainDTO(7,"17564","Madhapur","Anand Vihar",26,200.00,"B","Baidyanath Express");
		
		TrainDAO dao=new TrainDAO();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto6);
		
		dao.deleteByTrainNo("07567");
		
		dao.deleteByTrainNoAndTrainId("17564", 7);
		
		TrainDTO check=dao.getByTrainNo("07789");
		System.out.println(check);
		
		Collection<TrainDTO> output=dao.getAll();
		System.out.println(output);
		
		
		Collection<TrainDTO> res=dao.getAllByBoarding("Amritsar");
		System.out.println(res);


		Collection<TrainDTO> find=dao.getAllByDestination("Banglore");
		System.out.println(find);
		
		dao.updateDestinationByTrainNo("Agra", "13209");
		
		dao.updateDestinationAndBoardingByTrainNo("Pune", "Punjab", "15609");
		
		int total=dao.getTotal();
		System.out.println(total);
		
		double max=dao.getMaxPrice();
		System.out.println(max);
		
		double min=dao.getMinPrice();
		System.out.println(min);
		}

}

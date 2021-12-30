package com.xworkz.sql;
import com.xworkz.drone.dto.FestivalDTO;
import com.xworkz.drone.dao.FestivalDAO;

public class FestivalStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FestivalDTO dto=new FestivalDTO(1,"Sankranthi",14,"Karnataka");
		FestivalDTO dto1=new FestivalDTO(2,"Puthri",28,"Karnataka");
		FestivalDTO dto2=new FestivalDTO(3,"Onam",07,"Kerala");
		FestivalDTO dto3=new FestivalDTO(4,"Sunburn Festival",25,"Goa");
		FestivalDTO dto4=new FestivalDTO(5,"Gochi",19,"Himachal Pradesh");
		FestivalDTO dto5=new FestivalDTO(6,"Bahu Mela",22,"Jammu and Kashmir");
		FestivalDTO dto6=new FestivalDTO(7,"Dasara",12,"Karnataka");
		FestivalDTO dto7=new FestivalDTO(8,"Gudi Padva",27,"Maharashtra");
		FestivalDTO dto8=new FestivalDTO(9,"Rath Yara",8,"Odhisha");
		FestivalDTO dto9=new FestivalDTO(10,"Pongal",27,"Tamil Nadu");
		FestivalDTO dto10=new FestivalDTO(11,"Pongal",27,"Tamil Nadu");
		FestivalDAO dao=new FestivalDAO();
		
	    dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto6);
		dao.save(dto7);
		dao.save(dto8);
		dao.save(dto9);
		dao.save(dto10);
		
		dao.deleteOperation(11);
		
		dao.readOperationById(5);
		dao.displayAll();
		dao.displayAll();

	}

}

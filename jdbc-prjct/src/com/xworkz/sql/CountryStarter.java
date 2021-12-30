package com.xworkz.sql;
import com.xworkz.drone.dto.CountryDTO;
import com.xworkz.drone.dao.CountryDAO;

public class CountryStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CountryDTO dto1=new CountryDTO(1,"INDIA",91,"Asia");
	CountryDTO dto2=new CountryDTO(2,"Algeria",213,"Africa");
	CountryDTO dto3=new CountryDTO(3,"Canada",1,"North America");
	CountryDTO dto4=new CountryDTO(4,"Brazil",55,"South America");
	CountryDTO dto5=new CountryDTO(5,"Vatican",379,"Europe");
	CountryDTO dto6=new CountryDTO(6,"Tasmania",3,"Australia");
	CountryDTO dto7=new CountryDTO(7,"China",86,"Asia");
	CountryDTO dto8=new CountryDTO(8,"SRI LANKA",95,"Asia");
	CountryDTO dto9=new CountryDTO(9,"IRAN",97,"Asia");
	
	
	CountryDAO dao=new CountryDAO();
	dao.save(dto1);
	dao.save(dto2);
	dao.save(dto3);
	dao.save(dto4);
	dao.save(dto5);
	dao.save(dto6);
	dao.save(dto7);
	dao.save(dto8);
	dao.save(dto9);
	
	dao.deleteOperation(3);
	
	dao.readOperationById(8);
	
	dao.displayAll();
	
	dao.displayTotalRows();

	}

}

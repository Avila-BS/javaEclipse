package com.xworkz.starters;
import com.xworkz.dto.examples.dao.ChargerDAO;
import com.xworkz.dto.examples.ChargerDTO;

public class ChargerDAOStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChargerDAO dao=new ChargerDAO();
		ChargerDTO chargerDTO=new ChargerDTO("REDMI",2.50f,"SOLAR",2.5f,"Lithium-ion");
		ChargerDTO chargerDTO1=new ChargerDTO("One-plus",4.50f,"AC",3.5f,"Lithium-ion");
		ChargerDTO chargerDTO2=new ChargerDTO("Samsung",3.50f,"DC",3.0f,"Lead-acid");
		ChargerDTO chargerDTO3=new ChargerDTO();
		dao.add(chargerDTO);
		dao.add(chargerDTO1);
		dao.add(chargerDTO1);
		dao.add(chargerDTO3);
		dao.add(null);
		
		dao.delete(4);
		
	}

}

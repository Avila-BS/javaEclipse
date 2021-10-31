package com.xworkz.starters;
import com.xworkz.dto.examples.ItachiDTO;
import com.xworkz.dto.examples.dao.HitachiDAO;
public class HitachiDAOStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HitachiDAO dao=new HitachiDAO();
		  ItachiDTO hitachi0=new ItachiDTO("Toyco",70000.0f,95.0f,"yellow",8);
		  ItachiDTO hitachi1=new ItachiDTO();
		  ItachiDTO hitachi2=new ItachiDTO("TATA",80000.0f,85.0f,"Orange",10);
		  ItachiDTO hitachi3=new ItachiDTO();
		  ItachiDTO hitachi4=new ItachiDTO();
		  dao.add(null);
		  dao.add(hitachi0);
		  dao.add(hitachi1);
		  dao.add(hitachi2);
		  dao.add(hitachi3);
		  dao.add(hitachi4);
		  dao.add(hitachi2);
		  
		  dao.delete(5);
		
		  
		

	}

}

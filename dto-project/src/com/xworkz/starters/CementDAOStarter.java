package com.xworkz.starters;
import com.xworkz.dto.examples.CementDTO;
import com.xworkz.dto.examples.dao.CementDAO;

public class CementDAOStarter {
	public static void main(String[] args)
	{
		CementDAO dao=new CementDAO();
		CementDTO cementdto=new CementDTO("Birla",400.0f,35.00f,false,"Ordinary");
		dao.add(cementdto);
		CementDTO cementdto1=new CementDTO("ultra-tech",350.0f,37.00f,true,"Ordinary");
		dao.add(cementdto1);
		CementDTO cementdto2=new CementDTO("CNBM",550.0f,57.00f,true,"Rapid-hardening");
		dao.add(cementdto2);
		
		dao.delete(0);
		
		
	}

}

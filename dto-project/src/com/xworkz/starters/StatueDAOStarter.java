package com.xworkz.starters;
import com.xworkz.dto.examples.StatueDTO;
import com.xworkz.dto.examples.dao.StatueDAO;
public class StatueDAOStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatueDAO dao=new StatueDAO();
		StatueDTO statue=new StatueDTO("SHIVA",100.0f,"Black","Kore","stone");
		StatueDTO statue1=new StatueDTO("Mahatma Gandhi",150.0f,"White","kinetic","bronze");
		StatueDTO statue2=new StatueDTO("Buddha",250.0f,"Mud","Assembled","Marble");
		StatueDTO statue3=new StatueDTO();
		
		dao.add(statue);
		dao.add(statue1);
		dao.add(statue2);
		dao.add(statue3);
		dao.add(statue1);
		dao.add(statue);
		dao.add(statue2);
		dao.add(statue1);
		
		dao.delete(4);
		

	}

}

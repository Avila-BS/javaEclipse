package com.xworkz.starters;
import com.xworkz.dto.examples.DishDTO;
import com.xworkz.dto.examples.dao.DishDAO;

public class DishDTOStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DishDAO dishdao=new DishDAO();
		DishDTO dish=new DishDTO("Videocon",3500.0f,35,22.4f,"Home- Service");
		DishDTO dish1=new DishDTO("TataSky",2500.0f,45,25.4f,"Industry- Service");
		DishDTO dish2=new DishDTO();
		dishdao.add(null);
		dishdao.add(dish2);
		dishdao.add(dish1);
		dishdao.add(dish);
		
		dishdao.delete(0);
		
		
		
		
	}

}

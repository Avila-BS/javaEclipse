package com.xworkz.starters;
import com.xworkz.dto.examples.FoodDTO;
import com.xworkz.dto.examples.dao.FoodDAO;
import com.xworkz.dto.examples.FoodType;

public class FoodDAOStarter {

	public static void main(String[] args) {
		FoodDAO fooddao=new FoodDAO();
		
		FoodDTO dto=new FoodDTO(1,"Biriyani",FoodType.SOUTH_INDIAN,200.00,2);
		FoodDTO dto1=new FoodDTO(2,"French-fries",FoodType.ITALIAN,150.00,3);
		FoodDTO dto2=new FoodDTO(3,"Prawns",FoodType.SEA_FOOD,250.00,4);
		
		fooddao.add(dto);
		fooddao.add(dto1);
		fooddao.add(dto2);
		
		fooddao.updatePriceByName("Prawns",300.0f);
		fooddao.updateQuantityByName("French-fries",4);
		fooddao.findByName("fish");
		fooddao.findByNameAndPrice("Biriyani",200.00);
		fooddao.findByNameAndType("French-fries",FoodType.ITALIAN);
		fooddao.displayDetails();
		fooddao.totalFoodItems();
				
		
		

	}

}

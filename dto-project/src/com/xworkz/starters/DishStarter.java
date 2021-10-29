package com.xworkz.starters;
import com.xworkz.dto.examples.DishDTO;

public class DishStarter {

	public static void main(String[] args) {
		DishDTO dish=new DishDTO();
		dish.setName("Airtel");
		dish.setCost(2899.0f);
		dish.setRadius(45);
		dish.setFrequency(23.45f);
		dish.setType("multi-satellite");
		
		
		System.out.println(dish.getName());
		System.out.println(dish.getCost());
		System.out.println(dish.getRadius());
		System.out.println(dish.getFrequency());
		System.out.println(dish.getType());
		
		DishDTO dish2=new DishDTO("Videocon",3500.0f,35,22.4f,"Home- Service");
		System.out.println(dish2.getName());
		System.out.println(dish2.getCost());
		System.out.println(dish2.getRadius());
		System.out.println(dish2.getFrequency());
		System.out.println(dish2.getType());
	}

}

package com.xworkz.inheitance;
import com.xworkz.inheritance.FoodOperator.Food;


public class FoodStarter {

	public static void main(String[] args) {
		Food food=new Food();
		Food food1=new Food(1,"Pasta");
		
		boolean set=food.equals(food1);
		System.out.println(set);
		
		System.out.println("*******************");
		
		boolean set1=food.equals(null);
		System.out.println(set1);

		System.out.println("*******************");
		
		Food food2=new Food(1,"Biriyani");
		boolean set2=food.equals(food2);
		System.out.println(set2);
		
	}

}

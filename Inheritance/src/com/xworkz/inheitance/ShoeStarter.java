package com.xworkz.inheitance;
import com.xworkz.inheritance.ShoeOperartor.Shoe;

public class ShoeStarter {

	public static void main(String[] args) {
		
		Shoe shoe=new Shoe();
		shoe.setBrand("Puma");
		shoe.setGender('F');
		

		Shoe shoe1=new Shoe();
		shoe.setBrand("Nike");
		shoe.setGender('F');
		
		boolean face=shoe.equals(shoe1);
		System.out.println(face);
		
		boolean face1=shoe.equals(9);
		System.out.println(face1);
		

	}

}

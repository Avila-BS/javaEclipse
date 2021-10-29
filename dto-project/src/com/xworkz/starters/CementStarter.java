package com.xworkz.starters;
import com.xworkz.dto.examples.CementDTO;

public class CementStarter {

	public static void main(String[] args) {
		CementDTO cement=new CementDTO();
		cement.setCompany("Ultra-tech");
		cement.setPrice(330.0f);
		cement.setQuantity(31.65f);
		cement.setQuality(true);
		cement.setType("Ordinary");
		
		System.out.println(cement.getCompany());
		System.out.println(cement.getPrice());
		System.out.println(cement.getQuantity());
		System.out.println(cement.isQuality());
		System.out.println(cement.getType());
		
		CementDTO cement1=new CementDTO("ACC",310.0f,32.65f,true,"Rapid-hardening");
		
		System.out.println(cement1.getCompany());
		System.out.println(cement1.getPrice());
		System.out.println(cement1.getQuantity());
		System.out.println(cement1.isQuality());
		System.out.println(cement1.getType());
		
				
		

	}

}

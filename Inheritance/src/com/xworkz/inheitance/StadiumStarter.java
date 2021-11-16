package com.xworkz.inheitance;
import com.xworkz.inheritance.stadiumOperator.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		
		Stadium stadium=new Stadium();
		stadium.setName("Arun Jaitley");
		stadium.setCity("Delhi");
		stadium.setAreaInMeters(41820.0f);
		
		
		Stadium stadium1=new Stadium();
		stadium1.setName("Jawaharlal Nehru");
		stadium1.setCity("Delhi");
		stadium1.setAreaInMeters(41828.0f);
		
		boolean see=stadium.equals(stadium1);
		System.out.println(see);
		
		

	}

}

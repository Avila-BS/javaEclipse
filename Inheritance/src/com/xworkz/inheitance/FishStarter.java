package com.xworkz.inheitance;

import com.xworkz.inheritance.fishOperator.Fish;
import com.xworkz.inheritance.fishOperator.FishType;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		fish.setName("CatFish");
		fish.setType(FishType.BONY);
		fish.setPrice(150.0f);
		fish.setColor("silver");

		Fish fish1=new Fish();
		fish1.setName("Salmon");
		fish1.setType(FishType.CARTILAGINOUS);
		fish1.setPrice(150.0f);
		fish1.setColor("silver");
		
		boolean op=fish.equals(fish1);
		System.out.println(op);
		
		System.out.println("*******************");

		Fish fish3=new Fish();
		fish3.setName("CatFish");
		fish3.setType(FishType.BONY);
		fish3.setPrice(250.0f);
		fish3.setColor("black");
		
		boolean op1=fish.equals(fish3);
		System.out.println(op1);

		
		
	}

}

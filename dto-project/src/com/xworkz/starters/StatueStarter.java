package com.xworkz.starters;
import com.xworkz.dto.examples.StatueDTO;

public class StatueStarter {

	public static void main(String[] args) {
		StatueDTO statue=new StatueDTO();
		statue.setName("Buddha");
		statue.setHeight(128.0f);
		statue.setColor("golden");
		statue.setType("Venus");
		statue.setMaterial("marble");
		
		System.out.println(statue.getName().concat(" ").concat(String.valueOf(statue.getHeight())).concat(" ").concat(statue.getColor()).concat(" ").concat(statue.getType()).concat(" ").concat(statue.getMaterial()));
				
		StatueDTO statue1=new StatueDTO("SHIVA",100.0f,"Black","Kore","stone");
		System.out.println(statue1.getName().concat(" ").concat(String.valueOf(statue1.getHeight())).concat(" ").concat(statue1.getColor()).concat(" ").concat(statue1.getType()).concat(" ").concat(statue1.getMaterial()));
		
		
		

	}

}

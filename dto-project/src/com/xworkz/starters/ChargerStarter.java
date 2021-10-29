package com.xworkz.starters;
import com.xworkz.dto.examples.ChargerDTO;

public class ChargerStarter {

	public static void main(String[] args) {
		ChargerDTO chargerDTO=new ChargerDTO();
		chargerDTO.setBrand("SAMSUNG");
		chargerDTO.setCurrent(4.0f);
		chargerDTO.setPowerSource("AC");
		chargerDTO.setCableLength(1.5f);
		chargerDTO.setTypeOfBattery("Lead acid");
		
		System.out.println(chargerDTO.getBrand().concat(" ").concat(String.valueOf(chargerDTO.getCurrent())).concat(" ").concat(chargerDTO.getPowerSource()).concat(" ").concat(String.valueOf(chargerDTO.getCableLength())).concat(" ").concat(chargerDTO.getTypeOfBattery()));
		
		ChargerDTO chargerDTO2=new ChargerDTO("REDMI",2.50f,"SOLAR",2.5f,"Lithium-ion");
		System.out.println(chargerDTO2.getBrand().concat(" ").concat(String.valueOf(chargerDTO2.getCurrent())).concat(" ").concat(chargerDTO2.getPowerSource()).concat(" ").concat(String.valueOf(chargerDTO2.getCableLength())).concat(" ").concat(chargerDTO2.getTypeOfBattery()));
		
		
	}

}

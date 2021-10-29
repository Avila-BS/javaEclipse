package com.xworkz.starters;
import com.xworkz.dto.examples.BlueToothDTO;

public class BlueToothStarter {

	public static void main(String[] args) {
		BlueToothDTO bluetooth=new BlueToothDTO();
		bluetooth.setBrand("One-plus");
		bluetooth.setType("head-set");
		bluetooth.setCost(9900.0f);
		bluetooth.setFrequency(2.45f);
		bluetooth.setVersion(2.0f);
		
		System.out.println(bluetooth.getBrand().concat(" ").concat(bluetooth.getType()).concat(" ").concat(String.valueOf(bluetooth.getCost())).concat(" ").concat(String.valueOf(bluetooth.getFrequency())).concat(" ").concat(String.valueOf(bluetooth.getVersion())));
		
     BlueToothDTO bluetooth1=new BlueToothDTO("SONY","Wire-less",8500.0f,2.50f,2.0f);
     System.out.println(bluetooth1.getBrand().concat(" ").concat(bluetooth1.getType()).concat(" ").concat(String.valueOf(bluetooth1.getCost())).concat(" ").concat(String.valueOf(bluetooth1.getFrequency())).concat(" ").concat(String.valueOf(bluetooth1.getVersion())));
     
     
	}

}

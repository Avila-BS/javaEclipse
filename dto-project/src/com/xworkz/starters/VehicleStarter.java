package com.xworkz.starters;
import com.xworkz.dto.examples.VehicleDTO;

public class VehicleStarter {

	public static void main(String[] args) {
		
VehicleDTO vehicle=new VehicleDTO();
vehicle.setBrand("BMW");
vehicle.setColor("white");
vehicle.setGears(8);
vehicle.setPrice(42.30f);
vehicle.setFuel("Petrol");

System.out.println(vehicle.getBrand());
System.out.println(vehicle.getColor());
System.out.println(vehicle.getGears());
System.out.println(vehicle.getPrice());
System.out.println(vehicle.getFuel());

VehicleDTO vehicle1=new VehicleDTO("Toyota","Red",5,15.0f,"Diesel");

System.out.println(vehicle1.getBrand());
System.out.println(vehicle1.getColor());
System.out.println(vehicle1.getGears());
System.out.println(vehicle1.getPrice());
System.out.println(vehicle1.getFuel());
	}

}

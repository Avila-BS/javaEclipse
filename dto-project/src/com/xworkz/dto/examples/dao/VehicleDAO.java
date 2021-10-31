package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.VehicleDTO;

public class VehicleDAO {
	
	private VehicleDTO[] vehicledtoContainer=new VehicleDTO[7];
    private int count;
					     
					     public VehicleDAO()
					     {
					    	 System.out.println("invoked VehicleDAO");
					     }
					     
					     public void add(VehicleDTO vehicle)
					     {
					    	 if(this.count<this.vehicledtoContainer.length && vehicle!=null)
					    	 {
					    		 this.vehicledtoContainer[count]=vehicle;
					    		 System.out.println("added at index: ".concat(String.valueOf(count)).concat(" ").concat("Brand: ").concat(String.valueOf(vehicle.getBrand())).concat(" ").concat("Color: ").concat(String.valueOf(vehicle.getFuel())));
					    	count++;
					    	}
					    		 
					    		 
					    	 else
					    	 {
					    		 System.out.println("container is full or u have passed null");
					    	 }
					     }
					     
					     public void delete(int index)
					     {
					    	this.vehicledtoContainer[index]=null; 
					    	System.out.println("deleted container at index: ".concat(String.valueOf(index)));
					    	
					    	
					     }
						
						

					}
















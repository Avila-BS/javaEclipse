package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.ChargerDTO;
public class ChargerDAO {
	     private ChargerDTO[] chargerdtoContainer=new ChargerDTO[6];
	     private int count;
	     
	     public ChargerDAO()
	     {
	    	 System.out.println("invoked ChargerDAO");
	     }
	     
	     public void add(ChargerDTO charger)
	     {
	    	 if(this.count<this.chargerdtoContainer.length && charger!=null)
	    	 {
	    		 this.chargerdtoContainer[count]=charger;
	    		 count++;
	    		 System.out.println("added at index: ".concat(String.valueOf(count)).concat(" ").concat("brand: ").concat(String.valueOf(charger.getBrand())).concat(" ").concat("cable Length: ").concat(String.valueOf(charger.getCableLength())));
	    	 }
	    	 else
	    	 {
	    		 System.out.println("container is full or u have passed null");
	    	 }
	     }
	     
	     public void delete(int index)
	     {
	    	this.chargerdtoContainer[index]=null; 
	    	System.out.println("deleted container at index: ".concat(String.valueOf(index)));
	    	
	    	
	     }
		
		

	}




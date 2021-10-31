package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.CementDTO;

public class CementDAO {
     private CementDTO[] cementdtoContainer=new CementDTO[5];
     private int count;
     
     public CementDAO()
     {
    	 System.out.println("invoked CementDAO");
     }
     
     public void add(CementDTO cement)
     {
    	 if(this.count<this.cementdtoContainer.length && cement!=null)
    	 {
    		 this.cementdtoContainer[count]=cement;
    		 count++;
    		 System.out.println("added at index: ".concat(String.valueOf(count)).concat(" ").concat("quantity: ").concat(String.valueOf(cement.getQuantity())).concat(" ").concat("company: ").concat(String.valueOf(cement.getCompany())));
    	 }
    	 else
    	 {
    		 System.out.println("container is full or u have passed null");
    	 }
     }
     
     public void delete(int index)
     {
    	this.cementdtoContainer[index]=null; 
    	System.out.println("deleted container at index: ".concat(String.valueOf(index)));
    	
    	
     }
	
	

}

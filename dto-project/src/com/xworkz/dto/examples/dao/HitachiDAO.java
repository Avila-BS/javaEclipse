package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.ItachiDTO;


public class HitachiDAO {
	private ItachiDTO[] itachidtoContainer=new ItachiDTO[10];
    private int count;
			     
			     public HitachiDAO()
			     {
			    	 System.out.println("invoked HitachiDAO");
			     }
			     
			     public void add(ItachiDTO itachi)
			     {
			    	 if(this.count<this.itachidtoContainer.length && itachi!=null)
			    	 {
			    		 this.itachidtoContainer[count]=itachi;
			    		 System.out.println("added at index: ".concat(String.valueOf(count)).concat(" ").concat("Company: ").concat(String.valueOf(itachi.getCompany())).concat(" ").concat("Color: ").concat(String.valueOf(itachi.getColor())));
			    		 count++;
			    	 }
			    		 
			    		 
			    	 else
			    	 {
			    		 System.out.println("container is full or u have passed null");
			    	 }
			     }
			     
			     public void delete(int index)
			     {
			    	this.itachidtoContainer[index]=null; 
			    	System.out.println("deleted container at index: ".concat(String.valueOf(index)));
			    	
			    	
			     }
				
				

			}










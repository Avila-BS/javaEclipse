package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.StatueDTO;

public class StatueDAO {
		private StatueDTO[] statuedtoContainer=new StatueDTO[10];
	    private int count;
				     
				     public StatueDAO()
				     {
				    	 System.out.println("invoked StatueDAO");
				     }
				     
				     public void add(StatueDTO statue)
				     {
				    	 if(this.count<this.statuedtoContainer.length && statue!=null)
				    	 {
				    		 this.statuedtoContainer[count]=statue;
				    		 System.out.println("added at index: ".concat(String.valueOf(count)).concat(" ").concat("Name: ").concat(String.valueOf(statue.getName())).concat(" ").concat("Color: ").concat(String.valueOf(statue.getColor())));
				    	count++; }
				    		 
				    		 
				    	 else
				    	 {
				    		 System.out.println("container is full or u have passed null");
				    	 }
				     }
				     
				     public void delete(int index)
				     {
				    	this.statuedtoContainer[index]=null; 
				    	System.out.println("deleted container at index: ".concat(String.valueOf(index)));
				    	
				    	
				     }
					
					

				}













package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.DishDTO;

public class DishDAO {
	
		     private DishDTO[] dishdtoContainer=new DishDTO[4];
		     private int count;
		     
		     public DishDAO()
		     {
		    	 System.out.println("invoked DishDAO");
		     }
		     
		     public void add(DishDTO dish)
		     {
		    	 if(this.count<this.dishdtoContainer.length && dish!=null)
		    	 {
		    		 this.dishdtoContainer[count]=dish;
		    		 //count++;
		    		 System.out.println("added at index: ".concat(String.valueOf(count)).concat(" ").concat("Name: ").concat(String.valueOf(dish.getName())).concat(" ").concat("Radius: ").concat(String.valueOf(dish.getRadius())));
		    	count++; }
		    	 else
		    	 {
		    		 System.out.println("container is full or u have passed null");
		    	 }
		     }
		     
		     public void delete(int index)
		     {
		    	this.dishdtoContainer[index]=null; 
		    	System.out.println("deleted container at index: ".concat(String.valueOf(index)));
		    	
		    	
		     }
			
			

		}







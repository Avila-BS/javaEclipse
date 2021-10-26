package com.xworkz.demo.television;

 class SamsungClass {
    private String color="black";
    
  
	
		// TODO Auto-generated method stub
	SamsungClass(float price)
	{
		System.out.println(price+"k");
	}
	
	 boolean working()
	{
		System.out.println("invoked working");
		return true;
	}
	
	 String getColor()
	    {
		String shade=this.color;
		System.out.println(shade);
	    	return this.color;
	    }
	    String setColor(String col ) 
	    {
	    	this.color=col;
	    	return this.color;
	    }
	
 }		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	



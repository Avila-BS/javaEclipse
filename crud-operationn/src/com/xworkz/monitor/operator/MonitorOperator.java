package com.xworkz.monitor.operator;

public class MonitorOperator {
	private String[] names=new String[5];
	private int count=0;
	
	public MonitorOperator()
	{
		System.out.println("invoked MonitorOperator");
	}
	
	public void add(String brandName)
	{
		System.out.println("invoked add");
		
	 if(brandName!=null && this.count<this.names.length)
	 {
		 this.names[count]=brandName;
		 count++;
		 System.out.println("Added brand name ".concat(brandName));
	 }
	 else
	 {
		 System.out.println("Brand name cannot be null or names are full"); 
	 }
		 
	}
	
	public void displayBrandNames()
	{
		System.out.println("invoked displayBrandNames");
		for(int brand=0;brand<this.names.length;brand++)
		{
			String store=this.names[brand];
			System.out.println(store);
		}
	}

	
		

	

}

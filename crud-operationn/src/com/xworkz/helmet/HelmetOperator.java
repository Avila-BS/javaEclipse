package com.xworkz.helmet;

public class HelmetOperator {
	private String[] container=new String[3];
	private int count=0;
	
	public HelmetOperator()
	{
		System.out.println("invoked constructor");
	}
	
	public void add(String helmetBrand)
	{
		System.out.println("Invoked add");
		
		if(helmetBrand!=null && this.count<this.container.length)
		{
			this.container[count]=helmetBrand;
			count++;
			System.out.println(helmetBrand);
		}
		else
		{
			System.out.println("null or container is full");
		}
	}
	
	public void displayBrandNames()
	{
		for(int brand=0;brand<this.container.length;brand++)
		{
			String name=container[brand];
			System.out.println(name);
		}
	}
	

}

package com.xworkz.inheritance.fishOperator;



public class Fish {
	private String name;
	private FishType type;
	private float price;
	private String color;
	
	public Fish()
	{
		System.out.println("Invoked no arg constructor");
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Headset");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Fish)
		{
			System.out.println("Ref is Fish");
			Fish casted=(Fish)obj;
			String castedName=casted.getName();
			FishType castedType=casted.getType();
			if(this.name.equals(castedName)&& this.type.equals(castedType))
			{
				System.out.println("name and type are matching");
				return true;
			}
			else
			{
				System.err.println("name or type is not matching");
			}
		}
		else
		{
			System.err.println(" Ref is not a match");
			
		}
		}
	else
		{
			System.err.println("Referance cannot be null!!");
		}
		return false;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}

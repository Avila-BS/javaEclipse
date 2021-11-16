package com.xworkz.inheritance.FoodOperator;


public class Food {
	private String name="Biriyani";
	private float price=250.0f;
	private int quantity=1;
	private boolean quality=true;
	
	public Food()
	{
		System.out.println("Invoked no arg constructor");
	}
	
	public Food(int quantity,String name)
	{
		System.out.println("Invoked parametirized constructor");
		this.quantity=quantity;
		this.name=name;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Food");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Food)
		{
			System.out.println("Ref is Food");
			Food casted=(Food)obj;
			String castedName=casted.getName();
			Boolean castedQuality=casted.isQuality();
			if(this.name.equals(castedName)&& this.quality==castedQuality)
			{
				System.out.println("name and quality are matching");
				return true;
			}
			else
			{
				System.err.println("name or quality is not matching");
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	

}

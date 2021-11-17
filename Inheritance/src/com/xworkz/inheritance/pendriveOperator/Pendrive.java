package com.xworkz.inheritance.pendriveOperator;

public class Pendrive {
	
	private float capacity;
	private boolean working;
	private String brand;
	private float price;
	
	public Pendrive()
	{
		System.out.println("Invoked no arg cons");
	}
	
	public String toString()
	{
		System.out.println("Invoked toString from Pendrive");
		System.out.println(this.capacity);
		System.out.println(this.working);
		System.out.println(this.brand);
		System.out.println(this.price);
		
		return this.brand;
	}
	
	public int hashCode()
	{
		System.out.println("Invoked hashCode from Pendrive");
		return 7;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Pendrive");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Pendrive)
		{
			System.out.println("Ref is Pendrive");
			Pendrive casted=(Pendrive)obj;
			String castedBrand=casted.getBrand();
			float castedPrice=casted.getPrice();
			if(this.brand.equals(castedBrand)&& this.price==castedPrice)
			{
				System.out.println("brand and price are matching");
				return true;
			}
			else
			{
				System.err.println("brand or price is not matching");
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

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

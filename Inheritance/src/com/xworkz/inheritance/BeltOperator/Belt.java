package com.xworkz.inheritance.BeltOperator;



public class Belt {
	private float price;
	private String material;
	private char size;
	private char gender;
	
	public Belt()
	{
	System.out.println("Invoked no arg cons");	
	}

	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Food");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Belt)
		{
			System.out.println("Ref is belt");
			Belt casted=(Belt)obj;
			float castedPrice=casted.getPrice();
			char castedGender=casted.getGender();
			if(this.price==castedPrice && this.gender==castedGender)
			{
				System.out.println("price and gender are matching");
				return true;
			}
			else
			{
				System.err.println("price and gender is not matching");
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}

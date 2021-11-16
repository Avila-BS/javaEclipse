package com.xworkz.inheritance.ShoeOperartor;



public class Shoe {
	private String brand;
	private int size;
	private String Color;
	private char gender;
	
	public Shoe()
	{
		
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Shoe");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Shoe)
		{
			System.out.println("Ref is belt");
			Shoe casted=(Shoe)obj;
			String castedBrand=casted.getBrand();
			char castedGender=casted.getGender();
			if(this.brand.equals(castedBrand) && this.gender==castedGender)
			{
				System.out.println("brand and gender are matching");
				return true;
			}
			else
			{
				System.err.println("brand or gender is not matching");
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

}

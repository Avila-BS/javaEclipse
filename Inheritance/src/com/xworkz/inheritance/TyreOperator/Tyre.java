package com.xworkz.inheritance.TyreOperator;



public class Tyre {
	private String brand;
	private TyreType type;
	private float price;
	
	public Tyre()
	{
		
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Tyre");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Tyre)
		{
			System.out.println("Ref is Tyre");
			Tyre casted=(Tyre)obj;
			String castedBrand=casted.getBrand();
			TyreType castedType=casted.getType();
			if(this.brand.equals(castedBrand)&& this.type.equals(castedType))
			{
				System.out.println("brand and type are matching");
				return true;
			}
			else
			{
				System.err.println("brand or type is not matching");
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

	public TyreType getType() {
		return type;
	}

	public void setType(TyreType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

}

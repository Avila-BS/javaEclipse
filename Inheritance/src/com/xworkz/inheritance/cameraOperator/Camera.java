package com.xworkz.inheritance.cameraOperator;



public class Camera {
	
	private String brand;
	private int modelNo;
	private float price;
	private String company;
	
	
	public Camera()
	{
		System.out.println("Invoked no arg constructor");
	}
	
	public String toString()
	{
		System.out.println("Invoked toString from Camera");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.company);
		
		return "returned Camera";
	}

	public int hashCode()
	{
		System.out.println("Invoked hashCode from Camera");
		return this.modelNo;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Camera");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Camera)
		{
			System.out.println("Ref is Camera");
			Camera casted=(Camera)obj;
			String castedBrand=casted.getBrand();
			String castedCompany=casted.getCompany();
			if(this.brand.equals(castedBrand)&& this.company.equals(castedCompany))
			{
				System.out.println("brand and company are matching");
				return true;
			}
			else
			{
				System.err.println("brand or company is not matching");
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

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}

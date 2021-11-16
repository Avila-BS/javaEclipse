package com.xworkz.inheritance.headset;



public class Headset {
	
	private String brand;
	private HeadsetType type;
	private String battery;
	private int warranty;
	
	public Headset()
	{
		System.out.println("invoked no arg headset constructor");
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Headset");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Headset)
		{
			System.out.println("Ref is Headset");
			Headset casted=(Headset)obj;
			String castedBrand=casted.getBrand();
			int castedWarranty=casted.getWarranty();
			String castedBattery=casted.getBattery();
			if(this.brand.equals(castedBrand)&& this.warranty==castedWarranty && this.battery.equals(castedBattery))
			{
				System.out.println("brand,warranty and battery are matching");
				return true;
			}
			else
			{
				System.err.println("brand or warranty or battery is not matching");
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

	public HeadsetType getType() {
		return type;
	}

	public void setType(HeadsetType type) {
		this.type = type;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	

}

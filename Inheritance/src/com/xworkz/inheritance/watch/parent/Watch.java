package com.xworkz.inheritance.watch.parent;

public class Watch {
	private String brand;
	private WatchType type;
	private float price;
	
	public Watch()
	{
		System.out.println("Invoked watch no argument constructor");
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from watch");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Watch)
		{
			System.out.println("Ref is Watch");
			Watch casted=(Watch)obj;
			String castedBrand=casted.getBrand();
			WatchType castedWatchType=casted.getType();
			if(this.brand.equals(castedBrand)&& this.type.equals(castedWatchType))
			{
				System.out.println("brand and watchType are matching");
				return true;
			}
			else
			{
				System.err.println("brand or watchtype is not matching");
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

	public WatchType getType() {
		return type;
	}

	public void setType(WatchType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}

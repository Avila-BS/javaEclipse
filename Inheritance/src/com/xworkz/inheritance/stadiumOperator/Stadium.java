package com.xworkz.inheritance.stadiumOperator;



public class Stadium {
	
	private String name;
	private String city;
	private float areaInMeters;
	
	public Stadium()
	{
		
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Stadium");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Stadium)
		{
			System.out.println("Ref is belt");
			Stadium casted=(Stadium)obj;
			String castedName=casted.getName();
			float castedArea=casted.getAreaInMeters();
			if(this.name.equals(castedName) && this.areaInMeters==castedArea)
			{
				System.out.println("Name and area are matching");
				return true;
			}
			else
			{
				System.err.println("name or area is not matching");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}
	

}

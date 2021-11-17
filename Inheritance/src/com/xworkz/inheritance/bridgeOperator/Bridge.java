package com.xworkz.inheritance.bridgeOperator;



public class Bridge {
	
	private String name;
	private float length;
	private float cost;
	private int openYear;
	
	public Bridge()
	{
		System.out.println("Invoked no arg constructor");
	}

	public Bridge(String name, float length, float cost, int openYear) {
		super();
		this.name = name;
		this.length = length;
		this.cost = cost;
		this.openYear = openYear;
	}
	
	public String toString()
	{
		System.out.println(this.name);
		System.out.println(this.length);
		System.out.println(this.cost);
		System.out.println(this.openYear);
		
		return "returned Bridge";
	}
	
	public int hashCode()
	{
		System.out.println("Invoked hashcode from bridge");
		return 4;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Bridge");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Bridge)
		{
			System.out.println("Ref is Bridge");
			Bridge casted=(Bridge)obj;
			String castedName=casted.getName();
			float castedLength=casted.getLength();
			if(this.name.equals(castedName)&& this.length==castedLength)
			{
				System.out.println("name and length are matching");
				return true;
			}
			else
			{
				System.err.println("name or length is not matching");
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

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getOpenYear() {
		return openYear;
	}

	public void setOpenYear(int openYear) {
		this.openYear = openYear;
	}

}

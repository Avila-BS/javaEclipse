package com.xworkz.inheritance.bag;



public class Bag {
	private float price=1500.0f;
	private ColorType type=ColorType.BLUE;
	private int sections=4;
	
	public Bag()
	{
		System.out.println("Invoked bag no arg constructor");
	}
	public Bag(float price,ColorType type,int sections)
	{
		System.out.println("Invoked bag float,ColorType,int constructor");
		this.price=price;
		this.type=type;
		this.sections=sections;
	}
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from bag");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Bag)
		{
			System.out.println("Ref isBag");
			Bag casted=(Bag)obj;
			float castedPrice=casted.getPrice();
			int  castedSections=casted.getSections();
			if(this.price==castedPrice&& this.sections==castedSections )
			{
				System.out.println("price and sections are matching");
				return true;
			}
			else
			{
				System.err.println("price or section is not matching");
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

	public ColorType getType() {
		return type;
	}

	public void setType(ColorType type) {
		this.type = type;
	}

	public int getSections() {
		return sections;
	}

	public void setSections(int sections) {
		this.sections = sections;
	}
}
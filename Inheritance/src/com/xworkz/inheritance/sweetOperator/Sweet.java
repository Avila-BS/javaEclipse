package com.xworkz.inheritance.sweetOperator;

public class Sweet {
	private String name;
	private ColorType type;
	private float price;
	private ShapeType shape;
	
	public Sweet()
	{
		System.out.println("Invoked no arg Sweet Cons");
	}

	public Sweet(String name, ColorType type, float price, ShapeType shape) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.shape = shape;
	}
	
	public String toString()
	{
		System.out.println("Invoked toString from Sweet");
		System.out.println("this.name");
		System.out.println("this.type");
		System.out.println("this.price");
		System.out.println("this.shape");
		return "returned Sweet";
	}
	
	public int hashCode()
	{
		System.out.println("Invoked hashCode from sweet");
		return 5;
		
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Sweet");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof Sweet)
		{
			System.out.println("Ref is Watch");
			Sweet casted=(Sweet)obj;
			String castedName=casted.getName();
			ColorType castedColorType=casted.getType();
			if(this.name.equals(castedName)&& this.type.equals(castedColorType))
			{
				System.out.println("name and colorType are matching");
				return true;
			}
			else
			{
				System.err.println("name or color type is not matching");
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

	public ColorType getType() {
		return type;
	}

	public void setType(ColorType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ShapeType getShape() {
		return shape;
	}

	public void setShape(ShapeType shape) {
		this.shape = shape;
	}
	
	

}

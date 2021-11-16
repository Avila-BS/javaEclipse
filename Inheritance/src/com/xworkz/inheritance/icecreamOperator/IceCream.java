package com.xworkz.inheritance.icecreamOperator;



public class IceCream {
	private String name;
	private FlavourType flavour;
	private IceCreamType type;
	
	public IceCream()
	{
		System.out.println("Invoked no arg cons");
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from IceCream");
		if(obj!=null)
		{
			System.out.println("reference is not null");
		
		if(obj instanceof IceCream)
		{
			System.out.println("Ref is IceCream");
			IceCream casted=(IceCream)obj;
			String castedName=casted.getName();
			FlavourType castedFlavour=casted.getFlavour();
			if(this.name.equals(castedName) && this.flavour.equals(castedFlavour))
			{
				System.out.println("Name and flavours are matching");
				return true;
			}
			else
			{
				System.err.println("Name or flavour is not matching");
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

	public FlavourType getFlavour() {
		return flavour;
	}

	public void setFlavour(FlavourType flavour) {
		this.flavour = flavour;
	}

	public IceCreamType getType() {
		return type;
	}

	public void setType(IceCreamType type) {
		this.type = type;
	}
	

}

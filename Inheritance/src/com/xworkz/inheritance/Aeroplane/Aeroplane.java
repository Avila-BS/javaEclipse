package com.xworkz.inheritance.Aeroplane;



public class Aeroplane {
private String no;
private String company;
private boolean government;

public Aeroplane()
{
	System.out.println("Invoked no arg constructor");
}
public Aeroplane(String no,String company,boolean government)
{
	System.out.println("Invoked  parameterised constructor");
	this.no=no;
	this.company=company;
	this.government=government;
}
 
public boolean equals(Object obj)
{
	System.out.println("Invoked equals method from Aeroplane");
	if(obj!=null)
	{
		System.out.println("reference is not null");
	
	if(obj instanceof Aeroplane)
	{
		System.out.println("Ref is Aeroplane");
		Aeroplane casted=(Aeroplane)obj;
		String castedNo=casted.getNo();
		boolean castedgov=casted.isGovernment();
		if(this.no==castedNo&& this.government==castedgov )
		{
			System.out.println("no and gov are matching");
			return true;
		}
		else
		{
			System.err.println("no or gov is not matching");
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

public String getNo() {
	return no;
}

public void setNo(String no) {
	this.no = no;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public boolean isGovernment() {
	return government;
}

public void setGovernment(boolean government) {
	this.government = government;
}


}

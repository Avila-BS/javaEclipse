package com.xworkz.inheritance.NewspaperOperator;



public class Newspaper {
private String name="Indian Express";
private String lang="English";
private int since=1957;

public Newspaper()
{
	
}

public boolean equals(Object obj)
{
	System.out.println("Invoked equals method from Newspaper");
	if(obj!=null)
	{
		System.out.println("reference is not null");
	
	if(obj instanceof Newspaper)
	{
		System.out.println("Ref is Newspaper");
		Newspaper casted=(Newspaper)obj;
		String castedName=casted.getName();
		int castedSince=casted.getSince();
		if(this.name.equals(castedName) && this.since==castedSince)
		{
			System.out.println("name and quality are matching");
			return true;
		}
		else
		{
			System.err.println("name or quality is not matching");
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

public String getLang() {
	return lang;
}

public void setLang(String lang) {
	this.lang = lang;
}

public int getSince() {
	return since;
}

public void setSince(int since) {
	this.since = since;
}

}

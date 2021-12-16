package com.xworkz.collections.daos;

public class EqualsSearch implements StringMatch{
	
	public boolean evaluate(String element,String value)
	{
		System.out.println("Invoked evaluate for equals");		
		return element.equals(value);
		
	}
	
	

}




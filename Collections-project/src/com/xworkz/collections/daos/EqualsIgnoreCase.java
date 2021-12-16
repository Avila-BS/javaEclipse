package com.xworkz.collections.daos;

public class EqualsIgnoreCase implements StringMatch {
	
	public boolean evaluate(String element,String value) {
		return element.equalsIgnoreCase(value);
	}

}

package com.xworkz.collections.daos;

public class EndsWithMatches  implements StringMatch 
{
	public boolean evaluate(String element,String value) {
		return element.toLowerCase().endsWith(value.toLowerCase());
	}
		 
}


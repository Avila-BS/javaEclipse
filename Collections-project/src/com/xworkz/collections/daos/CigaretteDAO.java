package com.xworkz.collections.daos;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CigaretteDAO {
private Collection<String> cigdaos=new ArrayList<String>();
	
	public CigaretteDAO()
	{
		this.cigdaos.add("Camel");
		this.cigdaos.add("NewPort");
		this.cigdaos.add("Marlboro");
		this.cigdaos.add("Kool");
		this.cigdaos.add("LuckyStrike");
		
		
	}
 public boolean find(StringMatch search,String value)
 {
	 Iterator<String> itr=cigdaos.iterator();
	 while(itr.hasNext())
	 {
	String element=(String)itr.next();
	if(search.evaluate(element,value))
	{
		return true;
	}
	
	
	 }
	 return false;
 }
 
 
}




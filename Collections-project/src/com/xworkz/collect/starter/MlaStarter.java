package com.xworkz.collect.starter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MlaStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<String> set=new HashSet<String>();
		
		set.add("Abhay Patil");
		set.add("Sanjay Patil");
		set.add("Patil A S");
		set.add("MALAKA REDDY");
		set.add("SIDDU SAVADI");
		
		for(String element:set)
		{
			System.out.println(element);
		}
		
		System.out.println("=========================");
		
		set.forEach((e)->System.out.println(e));//lamda expression
		
		System.out.println("=========================");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element);
		}
		
		

	}

}

package com.xworkz.collect.starter;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class MallStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		
		list.add("Mantri");
		list.add("Orion");
		list.add("Phoneix");
		list.add("Central");
		list.add("Habitat");
		
		for(String element:list)
		{
			System.out.println(element);
		}
		
		System.out.println("=========================");
		
		list.forEach((e)->System.out.println(e));//lamda expression
		
		System.out.println("=========================");
		
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element);
		}
		
		System.out.println("=========================");
		

		ListIterator<String> itr1=list.listIterator(list.size());
		while(itr1.hasPrevious())
		{
			String element1=itr1.previous();
			System.out.println(element1);
			
		}
		
		System.out.println("=========================");
		
		
		
		System.out.println("=========================");
		
		
		for(int i=0;i<list.size();i++)
		{
			String element=list.get(i);
			System.out.println(element);
		}
	}

}

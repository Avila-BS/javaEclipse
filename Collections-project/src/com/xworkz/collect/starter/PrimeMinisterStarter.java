package com.xworkz.collect.starter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinisterStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> prime=new ArrayList<String>();
		
		prime.add("Narendra Modhi");
		prime.add("Manmohan Singh");
		prime.add("Vajpayee");
		prime.add("Narasimha Rao");
		prime.add("Chandra Shekhar");
		
		for(String element:prime)
		{
			System.out.println(element);
		}
		
		System.out.println("=========================");
		
		prime.forEach((e)->System.out.println(e));//lamda expression
		
		System.out.println("=========================");
		
		ListIterator<String> itr=prime.listIterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element);
		}
		
		System.out.println("=========================");
		

		ListIterator<String> itr1=prime.listIterator(prime.size());
		while(itr1.hasPrevious())
		{
			String element1=itr1.previous();
			System.out.println(element1);
			
		}
		
		System.out.println("=========================");
		
		
		
		for(int i=0;i<prime.size();i++)
		{
			String element=prime.get(i);
			System.out.println(element);
		}

	}

}

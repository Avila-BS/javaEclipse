package com.xworkz.maps;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryAndStates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> countryAndState=new HashMap<String,String>();
		countryAndState.put("India", "Maharashtra");
		countryAndState.put("Angola", "Luanda");
		countryAndState.put("Japan", "Tokyo");
		countryAndState.put("Morocco", "Rabat");
		countryAndState.put("Nigeria", "Abuja");

		Set<String> set=countryAndState.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());

		Collection<String> collection=countryAndState.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String,String>> entryset=countryAndState.entrySet();
		Iterator<Map.Entry<String,String>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> element=itr.next();
			System.out.println("Country - " + element.getKey() . concat(" ,State - ") + " " .concat(element.getValue())+ " " . concat("state"));

			System.out.println(System.lineSeparator());

			}
		entryset.forEach((entry) -> System.out.println("Country- " + entry.getKey() . concat(" ,State -  ") + " " .concat(entry.getValue())));
		

	}

}

package com.xworkz.maps;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Long,String> aadharNoAndName=new HashMap<Long,String>();
		aadharNoAndName.put(839827869608l, "Avila");
		aadharNoAndName.put(856912347593l, "Thashma");
		aadharNoAndName.put(365214987562l, "Sahana");
		aadharNoAndName.put(156948627139l, "Harshi");
		aadharNoAndName.put(259784136259l, "Chaithu");

		Set<Long> set=aadharNoAndName.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());

		Collection<String> collection=aadharNoAndName.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<Long,String>> data=aadharNoAndName.entrySet();
		Iterator<Map.Entry<Long,String>> itr=data.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Long,String> element=itr.next();
			System.out.println(element.getKey() + ( " is aadhar number of ") + " " .concat(element.getValue()));

			System.out.println(System.lineSeparator());

			//data.forEach((entry) -> System.out.println(entry.getKey() + (" is aadhar number of") + " " .concat(entry.getValue())));
		}
		data.forEach((entry) -> System.out.println(entry.getKey() + (" is aadhar number of") + " " .concat(entry.getValue())));
		

	}

}

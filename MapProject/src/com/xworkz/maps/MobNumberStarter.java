package com.xworkz.maps;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobNumberStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Long,String> name=new HashMap<Long,String>();
		name.put(8861765078l, "Avila");
		name.put(9535536335l, "Reena");
		name.put(9611569368l, "Akshala");
		name.put(6366218217l, "Sada");
		name.put(9591820834l, "Gahana");

		Set<Long> set=name.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());

		Collection<String> collection=name.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<Long,String>> entryset=name.entrySet();
		Iterator<Map.Entry<Long,String>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Long,String> element=itr.next();
			System.out.println("Mob no of " + (element.getValue())+" is " + element.getKey() );

			System.out.println(System.lineSeparator());

			
			}
		entryset.forEach((entry) ->System.out.println("Mob no of " + (entry.getValue())+" is " + entry.getKey()));

	}

}

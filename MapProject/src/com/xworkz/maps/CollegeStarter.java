package com.xworkz.maps;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class CollegeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> college=new HashMap<String,Integer>();
		college.put("Pragathi",1000 );
		college.put("Vidyanikethan", 788 );
		college.put("NIEIT",2500);
		college.put("VidyaVikas", 1999);
		college.put("GSSS",2000 );

		Set<String> set=college.keySet();
        set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

        System.out.println(System.lineSeparator());

        Collection<Integer> collection=college.values();
        collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

        System.out.println(System.lineSeparator());

        Set<Map.Entry<String, Integer>> entryset=college.entrySet();
        Iterator<Map.Entry<String,Integer>> itr=entryset.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String,Integer> element =itr.next();
        	System.out.println("No of students in " + element.getKey()+ " College are "+(element.getValue()));

        	System.out.println(System.lineSeparator());

			      }
        entryset.forEach((entry) ->System.out.println("No of students in " + entry.getKey()+ " College are "+(entry.getValue())));

	}

}

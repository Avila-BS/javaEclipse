package com.xworkz.collect.starter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirportNameStream {

	public static void main(String[] args) {
		
		String name1="Kempegowda International Airport";
		String name2="Chennai International Airport ";
		String name3="Chatrapati Shivagi International Airport";
		String name4="Trivandrum International Airport";
		String name5="Lengpui International Airport";
		String name6="Agatti International Airport";
		String name7="Indira Gandhi International Airport";
		String name8="Calicut International Airport";
		String name9="Kempegowda International Airport";
		
		Stream<String> airportStream=Stream.of(name1,name2,name3,name4,name5,name6,name7,name8,name9,"Dabolim Airport","Chandigarh airport","Jaipur International Airport","Rajiv Gandhi International Airport","Pune Airport","Manglore","Biju Pathanak","Thiruchirapalli","Bagdogra","Veer Savarkar");
		         List<String> temp  =airportStream.filter((e1)->e1.startsWith("C")).map(String::toLowerCase).collect(Collectors.toList());
		        temp.forEach((e)->System.out.println(e));

	}

}

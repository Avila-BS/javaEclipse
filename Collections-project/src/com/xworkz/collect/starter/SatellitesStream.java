package com.xworkz.collect.starter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SatellitesStream {

	public static void main(String[] args) {
		
		Stream<String> satelliteNames = Stream.of("Aryabhatta","Bhaskara Sega-I","Rohini TechnologyPayload","Rohini RS-1",
				"Rohini RS-D1","Apple","Bhaskara-II","INSAT-1A","Rohini RS-D2","INSAT-1B","SROSS-1","IRS-1A","SROSS-2",
				"INSAT-1C","INSAT-1D","IRS-1B","INSAT-2DT","SROSS-C","INSAT-2A","INSAT-2B");
		
		List<String> tempCollectstream= satelliteNames.sorted().collect(Collectors.toList());
		tempCollectstream.forEach((e)->System.out.println(e));
		
		System.out.println("======printing in descending order======");

		Stream<String> satelliteNames1 = Stream.of("Aryabhatta","Bhaskara Sega-I","Rohini TechnologyPayload","Rohini RS-1",
				"Rohini RS-D1","Apple","Bhaskara-II","INSAT-1A","Rohini RS-D2","INSAT-1B","SROSS-1","IRS-1A","SROSS-2",
				"INSAT-1C","INSAT-1D","IRS-1B","INSAT-2DT","SROSS-C","INSAT-2A","INSAT-2B");
		
		List<String> tempCollectstream1= satelliteNames1.sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		tempCollectstream1.forEach((f)->System.out.println(f));
		
		
		

	}

}

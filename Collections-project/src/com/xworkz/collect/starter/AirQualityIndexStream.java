package com.xworkz.collect.starter;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndexStream {

	public static void main(String[] args) {
		Stream<Integer> airQuality=Stream.of(50,150,300,225,450,475,77,89,226,321,176,298,356,245,45,83,431,229,196,321);
		List<Integer> tempAirQualityStream=airQuality.filter((e)->e<100).sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		
		tempAirQualityStream.forEach((e)->System.out.println(e));
	}

}

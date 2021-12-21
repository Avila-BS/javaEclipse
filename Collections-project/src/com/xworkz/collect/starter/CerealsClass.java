package com.xworkz.collect.starter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CerealsClass {

	public static void main(String[] args) {
		
		Stream<Double> cerealsStream=Stream.of(2.5d,6.5d,4.5d,1.5d,3.75d,10.5d,15.5d,7.0d,6.25d,9.75d,3.0d,4.80d,10.00d,1.0d,1.25d,1.50d,2.26d,4.78d,6.7d,7.79d);
                   List<Double> tempCereals =cerealsStream.filter((e1)->e1>4).sorted().collect(Collectors.toList());
		
                   tempCereals.forEach((e)->System.out.println(e));
		
	}

}

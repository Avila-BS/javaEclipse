package com.xworkz.inheitance;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.inheritance.cricketOperator.CricketBat;
import com.xworkz.inheritance.cricketOperator.CricketBatType;

public class CricketBatStarter {

	public static void main(String[] args) {
		CricketBat bat=new CricketBat();
		bat.setCompanyName("Adidas");
		bat.setType(CricketBatType.ENGLISH_WILLOW);
		bat.setPrice(5247.0f);
		bat.setWood("Maple-wood");
		
		CricketBat bat1=new CricketBat();
		bat1.setCompanyName("Adidas");
		bat1.setType(CricketBatType.ENGLISH_WILLOW);
		bat1.setPrice(2247.0f);
		bat1.setWood("	Willow-wood");
		
		boolean equal=bat.equals(bat1);
		System.out.println(equal);
		
		System.out.println("***********************");
		
		String ret=bat.toString();
		System.out.println(ret);
		
		System.out.println("***********************");
		int hash=bat1.hashCode();
		System.out.println(hash);
		
		System.out.println("***********************");
		
		Class classs=bat.getClass();
		System.out.println(classs.getName());
		System.out.println(classs.getPackage());
		System.out.println(classs.getSuperclass());
		System.out.println(classs.getMethods().length);
		System.out.println(classs.getFields().length);
		System.out.println(classs.getConstructors().length);
		
		System.out.println("***********************");
		
		Constructor[] constructors=classs.getConstructors();
		
		for(int i=0;i<constructors.length;i++)
		{
			Constructor constructor=constructors[i];
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());
			
		}
		
		System.out.println("***********************");
		
		
		Method[] methods=classs.getMethods();
		
		for(int j=0;j<methods.length;j++)
		{
			Method method=methods[j];
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getModifiers());
			
			
		}
		
		
		

	}

}

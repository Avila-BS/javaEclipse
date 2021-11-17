package com.xworkz.inheitance;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.inheritance.bridgeOperator.Bridge;

public class BridgeStarter {

	public static void main(String[] args) {
		Bridge bridge=new Bridge();
		bridge.setName("Golden gate bridge");
		bridge.setLength(217.98f);
		bridge.setCost(27.56f);
		bridge.setOpenYear(1999);
		
		Bridge bridge1=new Bridge("VikramShila",300.0f,40.0f,1975);
		
		boolean check=bridge.equals(bridge1);
		System.out.println(check);
		
		System.out.println("***********************");
		
		System.out.println(bridge.toString());
		
		System.out.println("***********************");
		
		System.out.println(bridge.hashCode());

		System.out.println("***********************");
		
		Class classs=bridge.getClass();
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

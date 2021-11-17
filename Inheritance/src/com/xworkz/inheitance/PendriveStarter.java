package com.xworkz.inheitance;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.inheritance.pendriveOperator.Pendrive;
public class PendriveStarter {

	public static void main(String[] args) {
		Pendrive drive=new Pendrive();
		drive.setCapacity(12.25f);
		drive.setWorking(true);
		drive.setBrand("SanDisk");
		drive.setPrice(1000.0f);
		
		Pendrive drive1=new Pendrive();
		drive1.setCapacity(8.25f);
		drive1.setWorking(false);
		drive1.setBrand("SanDisk");
		drive1.setPrice(1000.0f);
		
		boolean check=drive.equals(drive1);
		System.out.println(check);
		
		System.out.println("***********************");
		
		System.out.println(drive.toString());
		
		System.out.println("***********************");
		
		System.out.println(drive1.hashCode());
		
		System.out.println("***********************");
		
		Class classs=drive.getClass();
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

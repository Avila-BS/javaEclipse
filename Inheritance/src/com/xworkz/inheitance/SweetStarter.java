package com.xworkz.inheitance;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.inheritance.sweetOperator.ColorType;
import com.xworkz.inheritance.sweetOperator.ShapeType;
import com.xworkz.inheritance.sweetOperator.Sweet;

public class SweetStarter {

	public static void main(String[] args) {
		Sweet sweet=new Sweet();
		sweet.setName("Champakali");
		sweet.setType(ColorType.YELLOW);
		sweet.setPrice(35.0f);
		sweet.setShape(ShapeType.CIRCLE);
		
		Sweet sweet1=new Sweet("Laddoo",ColorType.YELLOW,20.0f,ShapeType.CIRCLE);
		
		boolean check=sweet.equals(sweet1);
		System.out.println(check);
		
		System.out.println("***********************");
		
		System.out.println(sweet.toString());
		
		System.out.println("***********************");
		
		System.out.println(sweet.hashCode());
		
		System.out.println("***********************");
		
		Class classs=sweet1.getClass();
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

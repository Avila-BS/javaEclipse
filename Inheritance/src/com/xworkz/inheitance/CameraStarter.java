package com.xworkz.inheitance;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.inheritance.cameraOperator.Camera;

public class CameraStarter {

	public static void main(String[] args) {
		Camera cam=new Camera();
		cam.setBrand("Nikon");
		cam.setModelNo(7);
		cam.setPrice(25000.0f);
		cam.setCompany("Nikon");
		
		Camera cam1=new Camera();
		cam1.setBrand("Nikon");
		cam1.setModelNo(7);
		cam1.setPrice(25000.0f);
		cam1.setCompany("Nikon");
		

		boolean check=cam.equals(cam1);
		System.out.println(check);
		
		System.out.println("***********************");
		
		System.out.println(cam.toString());
		
		System.out.println("***********************");
		
		System.out.println(cam1.hashCode());
		
		System.out.println("***********************");
		
		Class classs=cam1.getClass();
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

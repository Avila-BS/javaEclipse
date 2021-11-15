package com.xworkz.inheritance.child.carFactory;
import com.xworkz.inheritance.parent.factory.Factory;

public class CarFactory extends Factory{
	
	public CarFactory()
	{
		super();
		System.out.println("Invoked car factory no arg constructor");
	}
	
	public void manufacture()
	{
		System.out.println("Invoked manufacture from carfactory");
	}
	public void shutdown()
	{
		System.out.println("Invoked shutdown from carfactory");
	}
	
	public int hashCode()
	{
		System.out.println("Invoked hashCode from carfactory");
		return 6;
	}
	}
	


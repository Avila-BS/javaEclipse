package com.xworkz.main.starter;
import com.xworkz.inheritance.parent.factory.Factory;
import com.xworkz.inheritance.child.carFactory.CarFactory;
import com.xworkz.inheritance.sugarFactory.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {
		Factory factory=new Factory();
		factory.manufacture();
		factory.open();
		factory.shutdown();
		System.out.println(factory);
		System.out.println(factory.toString());
		System.out.println(factory.hashCode());
		
		Factory factory1=new CarFactory();
		factory1.manufacture();
		factory1.shutdown();
		CarFactory fact=(CarFactory)factory1;
		fact.open();
		System.out.println(factory1);
		System.out.println(factory1.toString());
		System.out.println(factory1.hashCode());
		
		SugarFactory factory2=new SugarFactory();
		factory2.manufacture();
		System.out.println(factory2);
		System.out.println(factory2.toString());
		System.out.println(factory2.hashCode());
		factory2.open();
		factory2.shutdown();
		

	}

}

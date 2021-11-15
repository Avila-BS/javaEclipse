package com.xworkz.inheritance.sugarFactory;
import com.xworkz.inheritance.parent.factory.Factory;

public class SugarFactory extends Factory {
	
	public SugarFactory()
	{
		System.out.println("invoked no arg Sugar Factory");
	}
   public void manufacture()
   {
	   System.out.println("Invoked manufacture from Sugarfactory");
	}
   public String toString()
   {
	   System.out.println("Invoked toString from Sugar Factory");
	   return "Sugar Factory";
   }
   public int hashCode()
   {
	   System.out.println("Invoked hashCodefrom Sugar Factory");
	   return 7;
   }
}

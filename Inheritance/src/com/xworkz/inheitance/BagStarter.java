package com.xworkz.inheitance;
import com.xworkz.inheritance.bag.Bag;
import com.xworkz.inheritance.bag.ColorType;

public class BagStarter {

	public static void main(String[] args) {
		Bag bag=new Bag();
		/*bag.getPrice();
		bag.getType();
		bag.getSections();*/
		
		Bag bag1=new Bag();
		bag1.setPrice(1500.0f);
		bag1.setType(ColorType.BLUE);
		bag1.setSections(4);
		
		boolean test=bag.equals(bag1);
		System.out.println(test);
		
		System.out.println("*******************");
		
		Bag bag2=new Bag(2000.0f,ColorType.BLACK,5);
		bag2.getPrice();
		bag2.getType();
		bag2.getSections();
		
		
		boolean test1=bag2.equals(bag1);
		System.out.println(test1);

	}

}

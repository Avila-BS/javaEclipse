package com.xworkz.ward.mainn;
import com.xworkz.warddrobe.operator.WarddrobeOperator;
public class WarddrobeStarter {

	public static void main(String[] args) {
		WarddrobeOperator operator=new WarddrobeOperator();
		boolean check=operator.add("t-shirt");
		if(check)
		{
			System.out.println("added");
		}
		else
		{
			System.out.println("not added");
		}
		operator.add("pant");
		operator.add("kurti");
		operator.add("saree");
		operator.add("bag");
		
		operator.update(1, "jewellery");
		operator.delete(3);
		
		operator.displayThings();
		
		boolean status=operator.match("bag");
		if(status)
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("not matched");
		}
		
		boolean checkMatch=operator.matchFirstChar("bag");
		if(checkMatch)
		{
			System.out.println("first char matched");
		}
		else
		{
			System.out.println("not matched");
		}
		
	
		
		boolean checkLast=operator.matchLastChar("kurti");
		if(checkLast)
		{
			System.out.println("last char matched");
		}
		else
		{
			System.out.println("not matched");
		}
		
		

	}

}

package com.xworkz.warddrobe.operator;

public class WarddrobeOperator {
	private String[] wardrobe=new String[5];
	private int count=0;
	
	public WarddrobeOperator()
	{
		System.out.println("invoked no arg constructor");
	}
	
	public boolean add(String thing)
	{
		if(thing!=null && this.count<this.wardrobe.length)
		{
			this.wardrobe[count]=thing;
			count++;
			System.out.println("added ".concat(thing));
			return true;
		}
		else
		{
			System.out.println("thing cannot be null or wardrobe is full");
		}
		return false;
	}

	public boolean update(int index,String newThing)
	{
		if(newThing!=null && index<this.wardrobe.length && index>=0)
		{
		this.wardrobe[index]=newThing;
		System.out.println("added new thing ".concat(newThing));
		return true;
		}
		else
		{
			System.out.println("newThing is null or index given is less than 0 or is greater than the length");
		}
		return false;
		
	}
	public boolean delete(int number)
	{
		if(number>=0 && number<this.wardrobe.length)
		{
			this.wardrobe[number]=null;
			System.out.println("deleted wardrobe"+number +" index item");
			return true;
		}
		else
		{
			System.out.println("number cannot be greater than the length and it cannot be less than 0");
			return false;
		}
	}
	public void displayThings()
	{
		for(int materials=0;materials<this.wardrobe.length;materials++)
		{
			String access=this.wardrobe[materials];
			System.out.println(access);
		}
	}
	public boolean match(String thing)
	{
		System.out.println("invoked match");
		for(int set=0;set<this.wardrobe.length;set++)
		{
			String tempThing=this.wardrobe[set];
			if(tempThing!=null)
			{
				if(tempThing.equals(thing))
				{
					System.out.println("given thing matched with ".concat(tempThing));
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean matchFirstChar(String ch)
	{
		Character firstChar=ch.charAt(0);
		for(int point=0;point<this.wardrobe.length;point++)
		{
			String items=wardrobe[point];
			if(items!=null)
			{
			Character firstCharacter=items.charAt(0);
			if(firstCharacter.equals(firstChar))
			{
				System.out.println("first character of "+ch+" matched with "+this.wardrobe[point]);
				return true;
			}
			}
		}
		return false;
	}
	
	public boolean matchLastChar(String last)
	{
		
		Character lastChar=last.charAt(last.length()-1);
		for(int bet=0;bet<this.wardrobe.length;bet++)
		{
			String itemss=wardrobe[bet];
			
			if(itemss!=null)
			{
			Character lastCharacter=itemss.charAt(itemss.length()-1);
			if(lastCharacter.equals(lastChar))
			{
				System.out.println("last character of "+last+" matched with "+this.wardrobe[bet]);
				return true;
			}
			}
		}
		return false;
	}
	
	
}



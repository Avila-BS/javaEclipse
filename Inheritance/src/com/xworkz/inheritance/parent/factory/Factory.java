package com.xworkz.inheritance.parent.factory;

public class Factory {
	public Factory()
	{
		System.out.println("invoked factory no arg constructor");
	}
public void manufacture() 
{
	System.out.println("invoked manufacture from factory");
}

public void open()
{
	System.out.println("invoked open from factory");
}
public void shutdown()
{
	System.out.println("invoked shutdown from factory");
}

public String toString()
{
	System.out.println("invoked toString from factory");
	return "Factory";
}
public int hashCode()
{
	System.out.println("invoked hashCode from factory");
	return 5;
}

}
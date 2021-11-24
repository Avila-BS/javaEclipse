package com.xworkz.interfacee.internetOperator;

public class AirtelInternet implements Internet {
	
	public AirtelInternet()
	{
		System.out.println("invoked AirtelInternet no arg constructor");
	}
	
	public boolean connect()
	{
		System.out.println("invoked connect from AirtelInternet");
		return true;
	}
	
	public int speed()
	{
		System.out.println("invoked speed from AirtelInternet");
		return 8;
	}

	public void disconnect()
	{
		System.out.println("invoked disconnect from AirtelInternet");
	}
}

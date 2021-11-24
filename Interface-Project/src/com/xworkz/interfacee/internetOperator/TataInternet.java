package com.xworkz.interfacee.internetOperator;

public class TataInternet implements Internet {
	
	public TataInternet()
	{
		System.out.println("Invoked TataInternet no arg constructor");
	}
	
	public boolean connect()
	{
		System.out.println("invoked connect from TataInternet");
		return false;
	}
	
	public int speed()
	{
		System.out.println("invoked speed from TataInternet");
		return 1;
	}

	public void disconnect()
	{
		System.out.println("invoked disconnect from TataInternet");
	}

}

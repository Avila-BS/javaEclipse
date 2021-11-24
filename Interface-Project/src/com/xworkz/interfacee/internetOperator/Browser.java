package com.xworkz.interfacee.internetOperator;

public class Browser {
	
	private Internet internet;
	
	
	public Browser(Internet internet)
	{
		System.out.println("Invoked Internet parameterized constructor from Browser");
		this.internet=internet;
	}
	
	public void browse()
	{
		System.out.println("Invoked method browse");
		
		if(this.internet!=null)
		{
			boolean connect=internet.connect();
			int speed=internet.speed();
			
			if(connect==true && speed>1)
			{
				System.out.println("Internet connected");
			}
			else if(connect==false)
			{
				Browser.errorConnecting();
			}
			
			}
		else
		{
			System.out.println("implementation is not provided");
		}
	}
	
	public static void errorConnecting()
	{
		System.out.println("error in connecting ");
	}

}

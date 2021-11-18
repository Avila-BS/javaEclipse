package com.xworkz.inheritance.abstractBank;

public class IciciBank extends Bank {
	
	public IciciBank()
	{
		super("ICICI","456dgdh8866");
		
		
	}
	
	public void provideLoan()
    {
    	System.out.println("invoked provide Loan from Icici Bank");
    }
	
	public void openAccount()
	{
    	System.out.println("invoked Open account from icici bank");
	}
	
	public  void closeAccount()
	{
		System.out.println("invoked Close account from icici bank");
	}
	
	
}

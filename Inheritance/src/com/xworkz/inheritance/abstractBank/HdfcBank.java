package com.xworkz.inheritance.abstractBank;

public class HdfcBank extends Bank {
	
	public HdfcBank(String name,String code)
	{
		super("HDFC","456ghdj78bhj");
	}
	
	public void provideLoan()
    {
    	System.out.println("invoked provide Loan from Hdfc bank");
    }
	
	public void openAccount()
	{
    	System.out.println("invoked Open account from hdfc bank");
	}
	
	public  void closeAccount()
	{
		System.out.println("invoked Close account from hdfc bank");
	}
	
	


}

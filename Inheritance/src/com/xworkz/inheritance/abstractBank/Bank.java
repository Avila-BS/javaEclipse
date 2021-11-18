package com.xworkz.inheritance.abstractBank;

public abstract class Bank {
	private String name;
	private String ifscCode;
	
	public Bank(String name,String ifscCode)
	{
		this.name=name;
		this.ifscCode=ifscCode;
		System.out.println("Invoked String,String parameterized constructor");
	}
	
	public abstract void provideLoan();
	
	public abstract void openAccount();
	
	public abstract void closeAccount();
	
	public String getBankName()
	{
		System.out.println("Invoked get Bank Name");
		
		String bankName=this.name;
		return bankName;
	}
	
	public String getIfscCode()
	{
		System.out.println("Invoked get Ifsc code");
		
		String ifsc=this.ifscCode;
		return ifsc;
		
	}

}

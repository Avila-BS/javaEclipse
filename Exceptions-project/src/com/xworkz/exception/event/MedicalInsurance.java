package com.xworkz.exception.event;
import com.xworkz.exception.voterEligibility.CashLessException;


public class MedicalInsurance {
	
	public MedicalInsurance()
	{
		System.out.println("Invoked no-arg constructor");
	}
	
	
	public void canAvailCashless(String name,double totalHoursIn) throws CashLessException
	{
		if(name!=null && name.length()>2 && name.length()<=26 && totalHoursIn>=24 )
		{
			System.out.println("Can avail cashless Medical Insurance");
		}
		
		else
		{
			System.err.println("Cannot avail cashless Medical Insurance");
			
			throw new CashLessException();
		}
	}

}

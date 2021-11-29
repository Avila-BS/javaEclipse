package com.xworkz.exception;

import com.xworkz.exception.voterEligibility.CashLessException;
import com.xworkz.exception.event.MedicalInsurance;

public class InsuranceStarter {
	
	public static void main(String[] args) throws CashLessException
	{
		MedicalInsurance insurance=new MedicalInsurance();
		
		insurance.canAvailCashless("Janaki", 28);
		
		System.out.println("found no exceptions");
	}
}

package com.xworkz.interfacee.hospitalRules;

public class PatientHospitalRules implements HospitalRules {
	
	public String register()
	{
		System.out.println("invoked register from patient hospital rules");
		
		return "online";
	}
	
	public double payAdvance()
	{
		System.out.println("invoked payAdvance from patient hospital rules");
		return 15.50;
	}
	
	public boolean validInsurance()
	{
		System.out.println("invoked validInsurance from patient hospital rules");
		return true;
	}

}

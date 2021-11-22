package com.xworkz.interfacee.ElectionRules;

public class CitizenElectionRules implements ElectionRules {
	
	public CitizenElectionRules()
	{
		System.out.println("invoked no arg cons");
	}
	
	public int validAge()
	{
		System.out.println("Invoked validAge from Citizen election rules");
		return 20;
	}
	
	public int wardNo()
	{
		System.out.println("Invoked wardNo from Citizen election rules");
		return 180;
	}

	public String address()
	{
		System.out.println("Invoked wardNo from Citizen election rules");
		return "Virajpet,Madikeri";
	}
}

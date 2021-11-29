package com.xworkz.exception.event;
import com.xworkz.exception.voterEligibility.NotEligibleForVote;
public class ElectrolCommission {
	
	public ElectrolCommission()
	{
		System.out.println("Invoked ElectrolCommission no-arg constructor");
	}
	
	public void canVote(String name,int age) throws NotEligibleForVote
	{
		if(name!=null && name.length()>2 && name.length()<=26 && age>18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
			throw new NotEligibleForVote();
		}
	}

}

package com.xworkz.exception.event;
import com.xworkz.exception.voterEligibility.NotAPrimeMemberException;


public class AmazonPrime {
	
	
	public void freeDelivery(boolean primeMember,String country) throws NotAPrimeMemberException
	{
		if(primeMember && country=="India")
		{
			System.out.println("Free delivery is available");
		}
		
		else
		{
			System.err.println("Free delivery is not available ");
			throw new NotAPrimeMemberException();
		}
	}

}

package com.xworkz.exception;
import com.xworkz.exception.event.AmazonPrime;
import com.xworkz.exception.voterEligibility.NotAPrimeMemberException;

public class AmazonStarter {

	public static void main(String[] args) throws NotAPrimeMemberException {
		
		AmazonPrime prime=new AmazonPrime();
		
		prime.freeDelivery(true, "India");
		
		System.out.println("no data issue");
		
		
		
	}

}

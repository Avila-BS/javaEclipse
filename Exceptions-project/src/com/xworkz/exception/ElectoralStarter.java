package com.xworkz.exception;
import com.xworkz.exception.event.ElectrolCommission;
import com.xworkz.exception.voterEligibility.NotEligibleForVote;

public class ElectoralStarter {

	public static void main(String[] args)throws NotEligibleForVote {
		
		ElectrolCommission election=new ElectrolCommission();
		 
		election.canVote("Av", 22);
		
		System.out.println("code is error free");
		

	}

}

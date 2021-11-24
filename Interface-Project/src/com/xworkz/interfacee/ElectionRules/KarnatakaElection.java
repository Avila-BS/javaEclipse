package com.xworkz.interfacee.ElectionRules;

public class KarnatakaElection {
private ElectionRules electionRules;

public KarnatakaElection(ElectionRules electionRules)
{
	this.electionRules=electionRules;
}

public void electionProcedure()
{
	System.out.println("Invoked method electionProcedure");
	
	if(this.electionRules!=null)
	{
		int age=electionRules.validAge();
		int wardNo=electionRules.wardNo();
		String address=electionRules.address();
		
		int length=address.length();
		System.out.println(length);
		
		if(age>=18 && wardNo>=1 && wardNo<=300 && length>10 && length<50 )
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.err.println("Not eligible");
		}
		}
	else
	{
		System.err.println("implementation is not provided");
	}
}

}
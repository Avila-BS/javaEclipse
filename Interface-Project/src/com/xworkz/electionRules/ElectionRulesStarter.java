package com.xworkz.electionRules;
import com.xworkz.interfacee.ElectionRules.KarnatakaElection;
import com.xworkz.interfacee.ElectionRules.ElectionRules;
import com.xworkz.interfacee.ElectionRules.CitizenElectionRules;


public class ElectionRulesStarter {

	public static void main(String[] args) {
		ElectionRules rules=new CitizenElectionRules();
		
		KarnatakaElection election=new KarnatakaElection(rules);
		
		//System.out.println(election);
		 election.electionProcedure();
		 
		

	}

}

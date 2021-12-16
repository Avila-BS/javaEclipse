package com.xworkz.collect.starter;
import com.xworkz.collections.daos.BiscuitDAO;
import com.xworkz.collections.daos.EndsWithMatches;
import com.xworkz.collections.daos.EqualsIgnoreCase;
import com.xworkz.collections.daos.EqualsSearch;
import com.xworkz.collections.daos.StartsWithMatch;
import com.xworkz.collections.daos.StringMatch;

public class BiscuitStarter {

	public static void main(String[] args) {
		
		BiscuitDAO biscuitDAO=new BiscuitDAO();
		
		StringMatch stringMatch=new EqualsSearch();
		boolean result=biscuitDAO.find(stringMatch, "Oreo");
		System.out.println(result);
		
		
		StringMatch stringMatch1=new EqualsIgnoreCase();
		boolean result1=biscuitDAO.find(stringMatch1, "OREO");
		System.out.println(result1);
		
		StringMatch stringMatch2=new StartsWithMatch();
		boolean result2=biscuitDAO.find(stringMatch2, "Or");
		System.out.println(result2);
		
		
		StringMatch stringMatch3=new EndsWithMatches();
		boolean result3=biscuitDAO.find(stringMatch3, "eo");
		System.out.println(result3);
		
		
		
	}

}

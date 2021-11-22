package com.xworkz.interfaceMain;
import com.xworkz.interfacee.hospitalRules.HospitalRules;
import com.xworkz.interfacee.hospitalRules.PatientHospitalRules;

import com.xworkz.interfacee.HostelOperator.HostelRules;

import com.xworkz.interfacee.HostelOperator.StudentHostelRules;


public class HospitalRulesStarter {

	public static void main(String[] args) {
		HospitalRules rules=new PatientHospitalRules();
		
		String reg=rules.register();
		double adv=rules.payAdvance();
		boolean ins=rules.validInsurance();
		
		System.out.println(reg);
		System.out.println(adv);
		System.out.println(ins);
		
		System.out.println("                                       ");
		
		HostelRules rule=new StudentHostelRules();
		
		boolean check=rule.admission();
		
		double time=rule.closeTime();
		
		String gender=rule.gender();
		
		System.out.println(check);
		System.out.println(time);
		System.out.println(gender);
		
		

	}

}

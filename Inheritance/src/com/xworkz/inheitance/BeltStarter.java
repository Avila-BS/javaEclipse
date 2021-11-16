package com.xworkz.inheitance;

import com.xworkz.inheritance.BeltOperator.Belt;

public class BeltStarter {

	public static void main(String[] args) {
		Belt belt=new Belt();
		belt.setPrice(999.99f);
		belt.setGender('M');
		
		Belt belt1=new Belt();
		belt1.setPrice(999.99f);
		belt1.setGender('M');
		
		boolean res=belt.equals(belt1);
		System.out.println(res);
		
		System.out.println("*******************");
		
		Belt belt2=new Belt();
		belt2.setPrice(999.99f);
		belt2.setGender('F');
		

		boolean res1=belt.equals(belt2);
		System.out.println(res1);
		

	}

}

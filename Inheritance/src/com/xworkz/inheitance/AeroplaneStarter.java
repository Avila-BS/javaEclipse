package com.xworkz.inheitance;
import com.xworkz.inheritance.Aeroplane.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
		Aeroplane air=new Aeroplane();
		air.setNo("N2828F");
		air.setCompany("UNITED");
		air.setGovernment(false);
		
		Aeroplane air1=new Aeroplane("N2828F","UNITED",false);
	

		boolean set=air.equals(air1);
		System.out.println(set);
	}

}

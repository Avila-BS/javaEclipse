package com.xworkz.inheitance;
import com.xworkz.inheritance.TyreOperator.Tyre;
import com.xworkz.inheritance.TyreOperator.TyreType;

public class TyreStarter {

	public static void main(String[] args) {
		Tyre tyre=new Tyre();
		tyre.setBrand("Apollo");
		tyre.setType(TyreType.SUMMER);
		tyre.setPrice(3455.0f);
		
		Tyre tyre1=new Tyre();
		tyre1.setBrand("Apollo");
		tyre1.setType(TyreType.SUMMER);
		tyre1.setPrice(3455.0f);
		
		boolean type=tyre.equals(tyre1);
		System.out.println(type);
		
	}

}

package com.xworkz.inheitance;
import com.xworkz.inheritance.icecreamOperator.FlavourType;
import com.xworkz.inheritance.icecreamOperator.IceCream;
import com.xworkz.inheritance.icecreamOperator.IceCreamType;

public class IceCreamStarter {

	public static void main(String[] args) {
		IceCream ice=new IceCream();
		ice.setName("Ben and Jerry");
		ice.setFlavour(FlavourType.BUTTERSCOTCH);
		ice.setType(IceCreamType.MOCHI);
		
		IceCream ice1=new IceCream();
		ice.setName("Walls");
		ice.setFlavour(FlavourType.BUTTERSCOTCH);
		ice.setType(IceCreamType.MOCHI);
		
		boolean check=ice.equals(ice1);
		System.out.println(check);

	}

}

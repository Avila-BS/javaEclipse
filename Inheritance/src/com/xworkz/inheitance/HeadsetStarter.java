package com.xworkz.inheitance;
import com.xworkz.inheritance.headset.Headset;
import com.xworkz.inheritance.headset.HeadsetType;

public class HeadsetStarter {

	public static void main(String[] args) {
		Headset headset=new Headset();
		headset.setBrand("Sony");
		headset.setType(HeadsetType.BLUETOOTH);
		headset.setBattery("lead-acid");
		headset.setWarranty(2);
		
		
		
		Headset set2=new Headset();
		set2.setBrand("philips");
		set2.setType(HeadsetType.BLUETOOTH);
		set2.setBattery("lithium-ion");
		set2.setWarranty(1);
		
		if(headset==set2)
		{
			System.out.println("both are pointing to same memory");
		}
		
		boolean res=headset.equals(set2);
		System.out.println(res);
		
		System.out.println("*******************");
		
		boolean result=headset.equals(null);
		System.out.println(result);
		
		System.out.println("*******************");
		
		boolean output=headset.equals(true);
		System.out.println(output);
		
		System.out.println("*******************");
		
		
		Headset headset1=new Headset();
		headset1.setBrand("Sony");
		headset1.setType(HeadsetType.BLUETOOTH);
		headset1.setBattery("lead-acid");
		headset1.setWarranty(2);
		
		Headset headset3=new Headset();
		headset3.setBrand("Sony");
		headset3.setType(HeadsetType.BLUETOOTH);
		headset3.setBattery("lead-acid");
		headset3.setWarranty(2);
		

		boolean output1=headset1.equals(headset3);
		System.out.println(output1);
		

	}

}

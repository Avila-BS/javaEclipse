package com.xworkz.inheitance;
import com.xworkz.inheritance.watch.parent.Watch;
import com.xworkz.inheritance.watch.parent.WatchType;

public class WatchStarter {

	public static void main(String[] args)
	{
	Watch watch=new Watch();
	watch.setBrand("Fastrack");
	watch.setType(WatchType.ANALOG);
	watch.setPrice(3495.50f);
	
	Watch watch1=new Watch();
	watch1.setBrand("Fastrack");
	watch1.setType(WatchType.ANALOG);
	watch1.setPrice(3495.50f);
	
	
	if(watch==watch1)
	{
		System.out.println("both pointing to same memory ");
	}
	
	boolean check=watch.equals(watch1);
	System.out.println(check);
	
	Watch watch2=new Watch();
	watch2.setBrand("Fastrack");
	watch2.setType(WatchType.POCKET);
	watch2.setPrice(3495.50f);
	
	Watch watch3=new Watch();
	watch3.setBrand("Fastrack");
	watch3.setType(WatchType.ANALOG);
	watch3.setPrice(3495.50f);
	

	boolean checks=watch2.equals(watch3);
	System.out.println(checks);
	

	}

}

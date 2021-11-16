package com.xworkz.inheitance;
import com.xworkz.inheritance.socksOperator.Socks;

public class SocksStarter {

	public static void main(String[] args) {
		Socks socks=new Socks();
		socks.setPrice(200.0f);
		socks.setSize('M');
		
		Socks socks1=new Socks();
		socks1.setPrice(201.0f);
		socks1.setSize('F');
		
		boolean key=socks.equals(socks1);
		System.out.println(key);
		

	}

}

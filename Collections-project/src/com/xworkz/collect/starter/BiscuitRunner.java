package com.xworkz.collect.starter;
import com.xworkz.collections.daos.BiscuitDAO;


public class BiscuitRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiscuitDAO daos=new BiscuitDAO();
		

		boolean match1 = daos.find((a1, a2) -> a1.equals(a2), "Oreo");
		System.out.println(match1);
		
		boolean match2 = daos.find((b1, a2) -> b1.toUpperCase().startsWith(a2.toUpperCase()), "Dark");
		System.out.println(match2);
		
		
		boolean match3 = daos.find((x, y) -> x.equalsIgnoreCase(y), "BOUrbON");
		System.out.println(match3);
		

		boolean match4= daos.find((b,c) -> b.toUpperCase().endsWith(c.toUpperCase()), "tasy");
		System.out.println(match4);
		
		

	}

}

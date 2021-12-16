package com.xworkz.collect.starter;
import com.xworkz.collections.daos.CigaretteDAO;

public class CigRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CigaretteDAO dao=new CigaretteDAO();
		
		boolean match1 = dao.find((a1, a2) -> a1.equals(a2), "Kool");
		System.out.println(match1);
		
		boolean match2 = dao.find((b1, a2) -> b1.toUpperCase().startsWith(a2.toUpperCase()), "New");
		System.out.println(match2);
		
		
		boolean match3 = dao.find((x, y) -> x.equalsIgnoreCase(y), "CAMEL");
		System.out.println(match3);
		

		boolean match4= dao.find((b,c) -> b.toUpperCase().endsWith(c.toUpperCase()), "shbjh");
		System.out.println(match4);

	}

}

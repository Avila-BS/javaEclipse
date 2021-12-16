package com.xworkz.collect.starter;
import com.xworkz.collections.daos.PaintDAO;

public class PaintRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaintDAO dao=new PaintDAO();
		

		boolean match1 = dao.find((c,d) -> c.equals(d), "Dulux");
		System.out.println(match1);
		
		boolean match2 = dao.find((e,f) -> e.toUpperCase().startsWith(f.toUpperCase()), "on");
		System.out.println(match2);
		
		
		boolean match3 = dao.find((x, y) -> x.equalsIgnoreCase(y), "SiaN");
		System.out.println(match3);
		

		boolean match4= dao.find((a,v) -> a.toUpperCase().endsWith(v.toUpperCase()), "shbjh");
		System.out.println(match4);


	}

}

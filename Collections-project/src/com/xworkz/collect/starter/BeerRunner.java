package com.xworkz.collect.starter;
import com.xworkz.collections.daos.BeerDAO;
import com.xworkz.collections.daos.StringMatch;

public class BeerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMatch match=new StringMatch()
				{
			public boolean evaluate(String element,String value)
			{
				System.out.println("Invoked anonymous class");
				return element.equals(value);
				
			}
			
				};
				
				BeerDAO dao=new BeerDAO();
				
			boolean result=dao.find(match, "KingFisher");
			
			System.out.println(result);
			
			boolean result1=dao.find(new StringMatch()
					{
				public boolean evaluate(String element,String value)
				{
					System.out.println("Invoked anonymous");
					return element.endsWith(value);
					
				}
				
					}, "re");
			
			
			System.out.println(result1);
			
			boolean match1 = dao.find((a1, a2) -> a1.equals(a2), "bb");
			System.out.println(match1);
			
			boolean match2 = dao.find((b1, a2) -> b1.toUpperCase().startsWith(a2.toUpperCase()), "bud");
			System.out.println(match2);
			
			boolean match3 = dao.find((x, y) -> x.equalsIgnoreCase(y), "TUboRguE");
			System.out.println(match3);
			
	

}
}

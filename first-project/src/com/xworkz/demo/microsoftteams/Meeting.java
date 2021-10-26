package com.xworkz.demo.microsoftteams;


 public class Meeting {
	
	public static String platform="Google Meets";
	protected static boolean mic=true;

	
		// TODO Auto-generated method stub
	public Meeting()
	{
		System.out.println("invoked Discussion");
	}
		
	public Meeting(String company)	
	{
		System.out.println("Company name is :"+company);
	}
	public Meeting(int hours)
	{
		System.out.println("Meeting in hours :"+hours);
	}
	
	public static void subject()
	{
		System.out.println("invoked subject");
	}
	
	 static String course(String sub)
	{
		System.out.println(sub);
		return sub;
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	

	
	
	
		
		
	

}

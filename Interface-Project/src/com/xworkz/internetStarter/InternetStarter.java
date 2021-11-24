package com.xworkz.internetStarter;
import com.xworkz.interfacee.internetOperator.Internet;
import com.xworkz.interfacee.internetOperator.AirtelInternet;
import com.xworkz.interfacee.internetOperator.TataInternet;
import com.xworkz.interfacee.internetOperator.Browser;

public class InternetStarter {

	public static void main(String[] args) {
		
		Internet internet=new AirtelInternet();
		
		Browser browser=new Browser(internet);
		
		browser.browse();
		
		System.out.println("******************************");
		
		
		Internet internet1=new TataInternet();
		
		Browser browser1=new Browser(internet1);
		
		browser1.browse();
		
		
		
		
		

	}

}

package com.xworkz.helmet.name;
import com.xworkz.helmet.HelmetOperator;
public class HelmetRunner {

	public static void main(String[] args) {
		HelmetOperator ref=new HelmetOperator();
		ref.add("Bell");
		ref.add("HJC");
		ref.add("Arai");
		ref.add(null);
		ref.add("Shark");
		ref.add("Shoei");
		ref.displayBrandNames();

	}

}

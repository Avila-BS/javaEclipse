package com.xworkz.monitor.mains;
import com.xworkz.monitor.operator.MonitorOperator;

public class MonitorStarter {

	public static void main(String[] args) {
		MonitorOperator operator=new MonitorOperator();
		operator.add("Apple");
		operator.add(null);
		operator.add("Samsung");
		operator.add(null);
		String name="Acer";
		operator.add(name);
		operator.add("Hp");
		operator.add("Dell");
		
		operator.displayBrandNames();
		

	}

}

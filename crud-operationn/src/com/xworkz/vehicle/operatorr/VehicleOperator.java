package com.xworkz.vehicle.operatorr;

public class VehicleOperator {
 private String[] modelNo=new String[5];
 private int count=0;
 
 public VehicleOperator()
 {
	 System.out.println("invoked no arg constructor");
 }
 
 public void add(String modelNumber)
 {
	 System.out.println("invoked add");
	 if(modelNumber!=null && this.count<this.modelNo.length)
	 {
		 modelNo[count]=modelNumber;
		 count++;
		 System.out.println("added Model number ".concat(modelNumber));
	 }
	 else
	 {
		 System.out.println("Model number cannot be null or is full");
	 }
 }
 
 public void displayModelNumbers()
 {
	 System.out.println("invoked displayModelNumbers");
	 for(int number=0;number<this.modelNo.length;number++)
	 {
		 String models=modelNo[number];
		 System.out.println(models);
	 }
 }
 
	

}

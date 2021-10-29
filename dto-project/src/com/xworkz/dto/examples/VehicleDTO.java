package com.xworkz.dto.examples;

public class VehicleDTO {
 private String brand;
 private String color;
 private int gears;
 private float price;
 private String fuel;
 
 public VehicleDTO()
 {
	 
 }

public VehicleDTO(String brand, String color, int gears, float price, String fuel) {
	super();
	this.brand = brand;
	this.color = color;
	this.gears = gears;
	this.price = price;
	this.fuel = fuel;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getGears() {
	return gears;
}

public void setGears(int gears) {
	this.gears = gears;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getFuel() {
	return fuel;
}

public void setFuel(String fuel) {
	this.fuel = fuel;
}
 
 
}

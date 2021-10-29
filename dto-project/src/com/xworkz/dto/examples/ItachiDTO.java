package com.xworkz.dto.examples;

public class ItachiDTO {
private String company;
private float price;
private float weight;
private String color;
private int tyres;

public ItachiDTO()
{
	
}

public ItachiDTO(String company, float price, float weight, String color, int tyres) {
	super();
	this.company = company;
	this.price = price;
	this.weight = weight;
	this.color = color;
	this.tyres = tyres;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getTyres() {
	return tyres;
}

public void setTyres(int tyres) {
	this.tyres = tyres;
}


}

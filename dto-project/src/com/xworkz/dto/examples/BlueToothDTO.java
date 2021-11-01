package com.xworkz.dto.examples;


public class BlueToothDTO {
	private String brand;
	private String type;
	private float cost;
	private float frequency;
	private float version;
	
	public BlueToothDTO()
	{
		
	}
	

	public BlueToothDTO(String brand, String type, float cost, float frequency, float version) {
		super();
		this.brand = brand;
		this.type = type;
		this.cost = cost;
		this.frequency = frequency;
		this.version = version;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}
	
	

}

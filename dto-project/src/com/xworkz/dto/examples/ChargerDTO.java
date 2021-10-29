package com.xworkz.dto.examples;

public class ChargerDTO {
	private String brand;
	private float current;
	private String powerSource;
	private float cableLength;
	private String typeOfBattery;
	
	public ChargerDTO()
	{
		
	}

	public ChargerDTO(String brand, float current, String powerSource, float cableLength, String typeOfBattery) {
		super();
		this.brand = brand;
		this.current = current;
		this.powerSource = powerSource;
		this.cableLength = cableLength;
		this.typeOfBattery = typeOfBattery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
		this.current = current;
	}

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	public float getCableLength() {
		return cableLength;
	}

	public void setCableLength(float cableLength) {
		this.cableLength = cableLength;
	}

	public String getTypeOfBattery() {
		return typeOfBattery;
	}

	public void setTypeOfBattery(String typeOfBattery) {
		this.typeOfBattery = typeOfBattery;
	}
	
	

}

package com.xworkz.dto.examples;

public class DishDTO {
	private String name;
	private float cost;
	private int radius;
	private float frequency;
	private String type;
	
	public DishDTO()
	{
		
	}

	public DishDTO(String name, float cost, int radius, float frequency, String type) {
		super();
		this.name = name;
		this.cost = cost;
		this.radius = radius;
		this.frequency = frequency;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
	
}

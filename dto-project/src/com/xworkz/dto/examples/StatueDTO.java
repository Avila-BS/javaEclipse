package com.xworkz.dto.examples;

public class StatueDTO {
	private String name;
    private float height;
	private String color;
	private String type;
	private String material;
	
	public StatueDTO()
	{
		
	}
	

	public StatueDTO(String name, float height, String color, String type, String material) {
		super();
		this.name = name;
		this.height = height;
		this.color = color;
		this.type = type;
		this.material = material;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	

}

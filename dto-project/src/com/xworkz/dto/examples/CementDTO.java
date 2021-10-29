package com.xworkz.dto.examples;

public class CementDTO {
	private String company;
	private float price;
	private float quantity;
	private boolean quality;
	private String type;
	
	public CementDTO()
	{
		
	}

	public CementDTO(String company, float price, float quantity, boolean quality, String type) {
		super();
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
		this.type = type;
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

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
	
}

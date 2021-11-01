package com.xworkz.dto.examples;
//import com.xworkz.dto.examples.FoodType;

//enum FoodType
//{
	//VEG,NON_VEG,ITALIAN,SOUTH_INDIAN,SEA_FOOD;
//}

public class FoodDTO {
	private int id;
	private String name;
	private FoodType type=FoodType.ITALIAN;
	private double price;
	private int quantity;
	
	public FoodDTO()
	{
		
	}

	public FoodDTO(int id, String name, FoodType type, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}

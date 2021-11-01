package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.FoodDTO;
import com.xworkz.dto.examples.FoodType;

public class FoodDAO {
	private FoodDTO[] foodContainer=new FoodDTO[5];
	private int count;
	private static int totalFoodItems;
	
	public FoodDAO()
	{
		System.out.println("invoked foodDAO");
	}
	
	public void add(FoodDTO foodDto)
	{
		if(foodDto!=null && this.count<this.foodContainer.length)
		{
			this.foodContainer[count]=foodDto;
			System.out.println("added foodDTO at index:".concat(String.valueOf(this.count)).concat(" ").concat("Id-").concat(String.valueOf(foodDto.getId())));
			this.count++;
		}
		else
		{
			System.out.println("container is full or you have passed null");
		}
	}
	
	public void updatePriceByName(String name,double price)
	{
		if(name!=null && price>0)
		{
			for(int plate=0;plate<this.foodContainer.length;plate++)
			{
				FoodDTO food=this.foodContainer[plate];
				if(food!=null)
				{
					String nameOfFood=food.getName();
					if(nameOfFood.equals(name))
					{
						System.out.println("name matched ".concat(name).concat(" ").concat(",updating price"));
						food.setPrice(price);
						System.out.println("updated price- "+food.getPrice());
						
					}
					else
					{
						System.out.println("name matched ");
					}
				}
				else
				{
					System.out.println("food cannot be null ");
				}
			}
		}
	}
	public void updateQuantityByName(String name,int quantity)
	{
		if(name!=null && quantity>0)
		{
			for(int quant=0;quant<this.foodContainer.length;quant++)
			{
				FoodDTO food=this.foodContainer[quant];
				if(food!=null)
				{
					String nameOfFood=food.getName();
					if(nameOfFood.equals(name))
					{
						System.out.println("name matched ".concat(name).concat(" ").concat(",updating quantity"));
						food.setQuantity(quantity);
						System.out.println("updated quantity- "+food.getQuantity());
						
					}
					else
					{
						System.out.println("name not matched ");
					}
				}
				else
				{
					System.out.println("food cannot be null ");
				}
			}
		}
		
	}
	
	public void findByName(String name)
	{
		if(name!=null)
		{
			for(int key=0;key<this.foodContainer.length;key++)
			{
				FoodDTO food1=foodContainer[key];
				if(food1!=null)
				{
					String name1=food1.getName();
					if(name1.equals(name))
					{
						System.out.println("Name matched at index :".concat(String.valueOf(key)).concat(" name: ").concat(name1));
					}
					else
					{
						System.out.println("Name not matched");
					}
				}
				else
				{
					System.out.println("food1 cannot be null");
				}
			}
		}
	}
	
	public void findByNameAndPrice(String name1,double price)
	{
		
			if(name1!=null && price>0)
			{
				for(int space=0;space<this.foodContainer.length;space++)
				{
					FoodDTO food2=this.foodContainer[space];
					if(food2!=null)
					{
						String nameOfFood=food2.getName();
						double priceOfFood=food2.getPrice();
						if(nameOfFood.equals(name1) && price==priceOfFood)
						{
							System.out.println("name and price matched, name:  ".concat(name1).concat(" ").concat(",price ").concat(String.valueOf(price)));
							
							
						}
						else
						{
							System.out.println("name or price not matched ");
						}
					}
					else
					{
						System.out.println("food cannot be null ");
					}
				}
			}
		
	}
	public void findByNameAndType(String name2,FoodType type)
	{
		
			if(name2!=null && type!=null)
			{
				for(int star=0;star<this.foodContainer.length;star++)
				{
					FoodDTO food3=this.foodContainer[star];
					if(food3!=null)
					{
						String nameOfFood=food3.getName();
						FoodType typeOfFood=food3.getType();
						if(nameOfFood.equals(name2) && typeOfFood.equals(type))
						{
							System.out.println("name and type matched, name:  ".concat(name2).concat(" ").concat(",type: ").concat(String.valueOf(type)));
							
							
						}
						else
						{
							System.out.println("name or type not matched ");
						}
					}
					else
					{
						System.out.println("food cannot be null ");
					}
				}
			}

}
	public void displayDetails()
	{
		for(int sun=0;sun<this.foodContainer.length;sun++)
		{
			FoodDTO display=this.foodContainer[sun];
			if(display!=null)
			{
			int displayID=display.getId();
			String displayName=display.getName();
			FoodType displayType=display.getType();
			double displayPrice=display.getPrice();
			int displayQuantity=display.getQuantity();
			System.out.println("id: "+displayID+" index: "+sun);
			System.out.println("Name: "+displayName+" index: "+sun);
			System.out.println("Type: "+displayType+" index: "+sun);
			System.out.println("Price: "+displayPrice+" index: "+sun);
			System.out.println("Quantity :"+displayQuantity+" index: "+sun);
			
		}
	}
}
	public void totalFoodItems()
	{
		for(int total=0;total<this.foodContainer.length;total++)
		{
			FoodDTO dto=foodContainer[total];
			if(dto!=null)
			{
				int totalItems=dto.getQuantity();
				FoodDAO.totalFoodItems=FoodDAO.totalFoodItems+totalItems;
			}
			
		}
		System.out.println("total food items: "+FoodDAO.totalFoodItems);
	}
}

package com.xworkz.inheritance.socksOperator;

public class Socks {
	

		private char size;
		private float price;
		private String material;
		private String type;
		
		public Socks()
		{
			
		}
		public boolean equals(Object obj)
		{
			System.out.println("Invoked equals method from Socks");
			if(obj!=null)
			{
				System.out.println("reference is not null");
			
			if(obj instanceof Socks)
			{
				System.out.println("Ref is Socks");
				Socks casted=(Socks)obj;
				float castedPrice=casted.getPrice();
				char castedSize=casted.getSize();
				if(this.price==castedPrice && this.size==castedSize)
				{
					System.out.println("price and size are matching");
					return true;
				}
				else
				{
					System.err.println("price or size is not matching");
				}
			}
			else
			{
				System.err.println(" Ref is not a match");
				
			}
			}
		else
			{
				System.err.println("Referance cannot be null!!");
			}
			return false;
		}
		public char getSize() {
			return size;
		}
		public void setSize(char size) {
			this.size = size;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		

	}




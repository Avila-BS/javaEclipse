package com.xworkz.collection.product;
import com.xworkz.collection.product.ProductDTO;
import com.xworkz.collections.daos.ProductDAO;

public class ProductStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDAO daoo=new ProductDAO();
		ProductDTO dto1=new ProductDTO("Television",78,1499.99f,"Sony");
		
	ProductDTO match=daoo.find((a,b)->
	{
	if(a.getName().equals(b.getName())&&a.getPrice()==(b.getPrice()))
	{
		return a;
	}
	return null;
	},dto1);
	
	System.out.println(match);
		

	}

}

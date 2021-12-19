package com.xworkz.collections.daos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.product.ProductDTO;

public class ProductDAO {
	
	private Collection<ProductDTO> product=new ArrayList<ProductDTO>();
	

	ProductDTO dto=new ProductDTO("Iron box",78,1499.99f,"Bajaj");
	ProductDTO dto1=new ProductDTO("Television",78,1499.99f,"Sony");
	ProductDTO dto2=new ProductDTO("Refrigerator",12,15000.99f,"Whirlpool");
	ProductDTO dto4=new ProductDTO("Air Conditioner",35,8000.99f,"Bosch");
	ProductDTO dto5=new ProductDTO("Laptop",22,42000.00f,"HP");
	ProductDTO dto6=new ProductDTO("Stabilizer",48,5000.00f,"V-Guard");
	ProductDTO dto7=new ProductDTO("Straightner",8,4000.00f,"Philips");
	ProductDTO dto8=new ProductDTO("Washing Machine",12,45000.0f,"LG");
	ProductDTO dto3=new ProductDTO("Charger",77,500.00f,"MI");
	
	
	public ProductDAO()
	{
	this.product.add(dto);
	this.product.add(dto1);
	this.product.add(dto2);
	this.product.add(new ProductDTO("Iron box",78,1499.99f,"Bajaj"));
	this.product.add(dto3);
	this.product.add(dto4);
	this.product.add(dto5);
	this.product.add(dto6);
	this.product.add(dto7);
	this.product.add(dto8);
	
	
	}
	
	public ProductDTO find(DTOMatch search,ProductDTO value)
	{
		
		Iterator<ProductDTO> itr=product.iterator();
		 while(itr.hasNext())
		 {
		ProductDTO element=itr.next();
		if(search.evaluate(element,value) != null)
		{
			return element;
		}
		
		
		 }
		return null;
	}
	
	
}


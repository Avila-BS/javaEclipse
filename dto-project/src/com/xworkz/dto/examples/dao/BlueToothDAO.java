package com.xworkz.dto.examples.dao;
import com.xworkz.dto.examples.BlueToothDTO;

public class BlueToothDAO {
	private BlueToothDTO[] bluetoothContainer=new BlueToothDTO[3];
	private int count=0;
	
	public BlueToothDAO()
	{
		System.out.println("Invoked bluetooth DAO");
	}
	
	public void add(BlueToothDTO bluetoothDTO)
	{
		if(this.count<this.bluetoothContainer.length && this.bluetoothContainer!=null) 
		{
		this.bluetoothContainer[count]=bluetoothDTO;
		System.out.println("bluetoothDTO added to bluetoothContainer at index ".concat(String.valueOf(this.count).concat(" BRAND: ").concat(bluetoothDTO.getBrand())));
		count++;
		}
		else
		{
			System.out.println("The container is full or you have passed null");
		}
	}
	
	public void delete(int index)
	{
		if(index>=0 && index<this.bluetoothContainer.length)
		{
			this.bluetoothContainer[index]=null;
			System.out.println("deleted container at index :".concat(String.valueOf(index)));
		}
	}
	

}

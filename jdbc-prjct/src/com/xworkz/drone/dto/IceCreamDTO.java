package com.xworkz.drone.dto;

import java.io.Serializable;

public class IceCreamDTO implements Serializable {
	
	private int creamId;
	private String cflavour;
	private String cName;
	private float cprice;
	
	public IceCreamDTO()
	{
		
	}

	public IceCreamDTO(int creamId, String cflavour, String cName, float cprice) {
		super();
		this.creamId = creamId;
		this.cflavour = cflavour;
		this.cName = cName;
		this.cprice = cprice;
	}

	public int getCreamId() {
		return creamId;
	}

	public void setCreamId(int creamId) {
		this.creamId = creamId;
	}

	public String getCflavour() {
		return cflavour;
	}

	public void setCflavour(String cflavour) {
		this.cflavour = cflavour;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public float getCprice() {
		return cprice;
	}

	public void setCprice(float cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [creamId=" + creamId + ", cflavour=" + cflavour + ", cName=" + cName + ", cprice=" + cprice
				+ "]";
	}
	
	
	

}

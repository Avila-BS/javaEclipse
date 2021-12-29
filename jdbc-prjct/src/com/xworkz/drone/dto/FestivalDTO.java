package com.xworkz.drone.dto;

import java.io.Serializable;

public class FestivalDTO implements Serializable {
	private int fid;
	private String fname;
	private int fDate;
	private String fState;
	
	public FestivalDTO()
	{
		
	}

	public FestivalDTO(int fid, String fname, int fDate, String fState) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fDate = fDate;
		this.fState = fState;
	}

	public int getFid() {
		return fid;
	}

	public String getFname() {
		return fname;
	}

	public int getfDate() {
		return fDate;
	}

	public String getfState() {
		return fState;
	}

	@Override
	public String toString() {
		return "FestivalDTO [fid=" + fid + ", fname=" + fname + ", fDate=" + fDate + ", fState=" + fState + "]";
	}
	
	
	

}

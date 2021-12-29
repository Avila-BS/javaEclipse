package com.xworkz.drone.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {
	
	private int sid;
	private String sname;
	private int sCode;
	private String sCapital;
	
	public StateDTO()
	{
		
	}

	public StateDTO(int sid, String sname, int sCode, String sCapital) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sCode = sCode;
		this.sCapital = sCapital;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public int getsCode() {
		return sCode;
	}

	public String getsCapital() {
		return sCapital;
	}

	@Override
	public String toString() {
		return "StateDTO [sid=" + sid + ", sname=" + sname + ", sCode=" + sCode + ", sCapital=" + sCapital + "]";
	}
	
	

}

package com.xworkz.dto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="flight_details")
public class FlightEntity implements Serializable {
	
	@Column(name="f_id")
	private int f_id;
	@Column(name="f_name")
	private String f_name;
	@Column(name="f_dest")
	private String f_dest;
	@Column(name="f_source")
	private String f_source;
	
public FlightEntity()
{
	
}

public int getF_id() {
	return f_id;
}

public void setF_id(int f_id) {
	this.f_id = f_id;
}

public String getF_name() {
	return f_name;
}

public void setF_name(String f_name) {
	this.f_name = f_name;
}

public String getF_dest() {
	return f_dest;
}

public void setF_dest(String f_dest) {
	this.f_dest = f_dest;
}

public String getF_source() {
	return f_source;
}

public void setF_source(String f_source) {
	this.f_source = f_source;
}

@Override
public String toString() {
	return "FlightEntity [f_id=" + f_id + ", f_name=" + f_name + ", f_dest=" + f_dest + ", f_source=" + f_source + "]";
}


}

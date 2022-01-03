package com.xworkz.drone.dto;

import java.io.Serializable;

public class TrainDTO implements Serializable {
	private int trainId;
	private String trainNo;
	private String boarding;
	private String destination;
	private int seatNo;
	private double ticketPrice;
	private String classs;
	private String name;
	
	
	
	public TrainDTO()
	{
		
	}

	public TrainDTO(int trainId, String trainNo, String boarding, String destination, int seatNo, double ticketPrice,
			String classs, String name) {
		super();
		this.trainId = trainId;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNo = seatNo;
		this.ticketPrice = ticketPrice;
		this.classs = classs;
		this.name = name;
	}

	public int getTrainId() {
		return trainId;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public String getBoarding() {
		return boarding;
	}

	public String getDestination() {
		return destination;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public String getClasss() {
		return classs;
	}

	public String getName() {
		return name;
	}
	
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "TrainDTO [trainId=" + trainId + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination="
				+ destination + ", seatNo=" + seatNo + ", ticketPrice=" + ticketPrice + ", classs=" + classs + ", name="
				+ name + "]";
	}
	
	
	
	
	

}

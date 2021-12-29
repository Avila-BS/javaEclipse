package com.xworkz.drone.dto;

import java.io.Serializable;

public class LiberaryDTO implements Serializable {
	//Book_Id,Book_Name,Author_Name,Book_Price,Publish_Year
	private int bookId;
	private String bookName;
	private String authorName;
	private double bookPrice;
	private int publishYear;
	private String bookVolume;
	
	public LiberaryDTO()
	{
		
	}

	public LiberaryDTO(int bookId, String bookName,String authorName, double bookPrice, int publishYear, String bookVolume) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName=authorName;
		this.bookPrice = bookPrice;
		this.publishYear = publishYear;
		this.bookVolume = bookVolume;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public String getBookVolume() {
		return bookVolume;
	}

	@Override
	public String toString() {
		return "LiberaryDTO [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice
				+ ", publishYear=" + publishYear + ", bookVolume=" + bookVolume + "]";
	}
	
	

}

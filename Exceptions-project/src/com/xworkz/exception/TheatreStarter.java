package com.xworkz.exception;
import com.xworkz.exception.event.TicketType;
import com.xworkz.exception.event.Theatre;
public class TheatreStarter {

	public static void main(String[] args) {
	
		
		Theatre theatre=new Theatre("Mugilupete");
		
		theatre.bookTicket("Mugilupete",TicketType.GANDHI_CLASS, 5);
		
		theatre.bookTicket1("Mugilupete", TicketType.MIDDLE_CLASS, 5);
		
		theatre.bookTicket2("Mugilupete", TicketType.BALCONY, 2);
		
		System.out.println("No logical error in the code");

	}

}


package com.day4;

class BookTickets {

	static private BookTickets tickets = null;

	public static int ticket;
	public static int bookedTicket ;
	
    //constructor
	BookTickets(int ticket) {
		this.ticket = ticket;
		this.bookedTicket = 0;
	}
	
	//getBookTickets
	public static BookTickets getBookTickets(int ticket) {
		if (tickets == null) {
			tickets = new BookTickets(ticket);
		} else {
			tickets = null;
		}
		return tickets;
	}
	
	//bookTicket
	BookTickets bookTickets() {
		if (tickets.bookedTicket < ticket ) {
			System.out.println("booked");
		}
		else {
			System.out.println("not available tickets");
		}
		return tickets;
	}

	//display
	public void display() {
		System.out.println("BookTickets : " +ticket);
		System.out.println("AvailableTickets : " +ticket);
		
	}

}

public class Singleton1 {

	public static void main(String[] args) {
		BookTickets tickets = BookTickets.getBookTickets(100);
		tickets.bookTickets();
		tickets.display();
	}

}

package com.event.ticketing.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Customer")
public class Customer {

	@Id
	private String _id;

	private String name;
	private String contactNumber;
	private String email;
	private String passWord;
	private List<Event> eventDetails;
	private List<Ticket> ticketDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public List<Event> getEventDetails() {
		return eventDetails;
	}
	public void setEventDetails(List<Event> eventDetails) {
		this.eventDetails = eventDetails;
	}
	public List<Ticket> getTicketDetails() {
		return ticketDetails;
	}
	public void setTicketDetails(List<Ticket> ticketDetails) {
		this.ticketDetails = ticketDetails;
	}
	
}

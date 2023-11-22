package com.event.ticketing.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Ticket")
public class Ticket {
	
	@Id
	private String _id;
	
	private Long ticketId;
    private Long eventId;
    private Long userId;
    private String ticketType;
    private int quantity;
    private double totalPrice;
    private boolean isCancelled;
    private LocalDateTime purchaseDateTime;
    private LocalDateTime cancelDateTime;
    
	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isCancelled() {
		return isCancelled;
	}
	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	public LocalDateTime getPurchaseDateTime() {
		return purchaseDateTime;
	}
	public void setPurchaseDateTime(LocalDateTime purchaseDateTime) {
		this.purchaseDateTime = purchaseDateTime;
	}
	public LocalDateTime getCancelDateTime() {
		return cancelDateTime;
	}
	public void setCancelDateTime(LocalDateTime cancelDateTime) {
		this.cancelDateTime = cancelDateTime;
	}


}

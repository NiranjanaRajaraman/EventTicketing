package com.event.ticketing.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("QRCode")
public class QRCode {
	
	@Id
	private String _id;
	
	private Long qrCodeId;
    private Long ticketId;
    private String qrCodeData;
    private LocalDateTime generationDateTime;
    
	public Long getQrCodeId() {
		return qrCodeId;
	}
	public void setQrCodeId(Long qrCodeId) {
		this.qrCodeId = qrCodeId;
	}
	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public String getQrCodeData() {
		return qrCodeData;
	}
	public void setQrCodeData(String qrCodeData) {
		this.qrCodeData = qrCodeData;
	}
	public LocalDateTime getGenerationDateTime() {
		return generationDateTime;
	}
	public void setGenerationDateTime(LocalDateTime generationDateTime) {
		this.generationDateTime = generationDateTime;
	}

}

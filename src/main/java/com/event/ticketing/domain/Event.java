package com.event.ticketing.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Event")
public class Event {
	
	@Id
	private String _id;
	
	private Long eventId;
	private String eventName;
	private List<Time> eventTimings;
	private String eventVenue;
	private String eventDescription;
	private Long organizerId;
	
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public List<Time> getTimings() {
		return eventTimings;
	}
	public void setTimings(List<Time> timings) {
		this.eventTimings = timings;
	}
	public String getEventVenue() {
		return eventVenue;
	}
	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public List<Time> getEventTimings() {
		return eventTimings;
	}
	public void setEventTimings(List<Time> eventTimings) {
		this.eventTimings = eventTimings;
	}
	public Long getOrganizerId() {
		return organizerId;
	}
	public void setOrganizerId(Long organizerId) {
		this.organizerId = organizerId;
	}
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	
	
	

}

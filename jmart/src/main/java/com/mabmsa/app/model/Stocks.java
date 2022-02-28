package com.mabmsa.app.model;

import java.sql.Date;

public class Stocks {
	private String availability;
	private Integer count;
	

	private Date dateCreated;
	private Date dateModified;
	private Character isDeleted;
	private String description;
	public Stocks() {
	}
	public Stocks(String availability, Integer count, Date dateCreated, Date dateModified, Character isDeleted,
			String description) {
		super();
		this.availability = availability;
		this.count = count;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.isDeleted = isDeleted;
		this.description = description;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public Character getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Character isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}

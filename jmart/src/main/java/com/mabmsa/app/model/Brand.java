package com.mabmsa.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long brandId;
	private String name;
	
	private String dateCreated;
	private String dateModified;
	private Character isDeleted;
	private String description;
	

	


	public String getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}


	public String getDateModified() {
		return dateModified;
	}


	public void setDateModified(String dateModified) {
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

	public Brand() {
	}


	public Long getBrandId() {
		return brandId;
	}


	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Brand(Long brandId, String name, String dateCreated, String dateModified, Character isDeleted,
			String description) {
		super();
		this.brandId = brandId;
		this.name = name;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.isDeleted = isDeleted;
		this.description = description;
	}


}

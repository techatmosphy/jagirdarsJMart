package com.mabmsa.app.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	private String name;
	private String title;
	private Long brandId;

	private Date dateCreated;
	private Date dateModified;
	private Character isDeleted;
	private String description;
	
	
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

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}


	public Categories(Long categoryId, String name, String title, Long brandId, Date dateCreated, Date dateModified,
			Character isDeleted, String description) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.title = title;
		this.brandId = brandId;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.isDeleted = isDeleted;
		this.description = description;
	}

	public Categories() {
	}

	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", name=" + name + ", title=" + title + ", brandId=" + brandId
				+ "]";
	}

}

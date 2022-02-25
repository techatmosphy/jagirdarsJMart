package com.mabmsa.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto generated
	private Long id;
	private String name;
	private String description;
	private Date add_date;

	public Product() {
	}

	public Product(Long id, String name, String description, Date add_date) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.add_date = add_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAdd_date() {
		return add_date;
	}

	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}

}
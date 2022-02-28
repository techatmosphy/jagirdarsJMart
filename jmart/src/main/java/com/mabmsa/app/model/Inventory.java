package com.mabmsa.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto generated
	private Long id;
	private String name;
	private String location;
	private Date add_date;
	
	private String productName;
	private Double unitPrice;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double productPrice) {
		this.unitPrice = productPrice;
	}

	public Long getQtyInHand() {
		return qtyInHand;
	}

	public void setQtyInHand(Long qtyInHand) {
		this.qtyInHand = qtyInHand;
	}

	public Long getSoldQty() {
		return soldQty;
	}

	public void setSoldQty(Long soldQty) {
		this.soldQty = soldQty;
	}

	public Double getInventryValue() {
		return inventryValue;
	}

	public void setInventryValue(Double d) {
		this.inventryValue = d;
	}

	public Double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(Double salesValue) {
		this.salesValue = salesValue;
	}

	private Long qtyInHand;
	private Long soldQty;
	private Double inventryValue;
	private Double salesValue;
	

	public Inventory() {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getAdd_date() {
		return add_date;
	}

	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}

	public Inventory(Long id, String name, String location, Date add_date, String productName, Double unitPrice,
			Long qtyInHand, Long soldQty, Double inventryValue, Double salesValue) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.add_date = add_date;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.qtyInHand = qtyInHand;
		this.soldQty = soldQty;
		this.inventryValue = inventryValue;
		this.salesValue = salesValue;
	}

}

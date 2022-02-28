package com.mabmsa.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productItem")
public class ProductItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	@Column(name = "itemCode", nullable = false)
	private String itemCode;

	private String stockStatus;
	private String itemName;
	private String itemCount;
	private String productName;

	private String dateCreated;
	private String dateModified;
	private Character isDeleted;
	private String description;

	public ProductItem() {
	}

	public ProductItem(Long itemId, String itemCode, String stockStatus, String itemName, String itemCount,
			String productName, String dateCreated, String dateModified, Character isDeleted, String description) {
		super();
		this.itemId = itemId;
		this.itemCode = itemCode;
		this.stockStatus = stockStatus;
		this.itemName = itemName;
		this.itemCount = itemCount;
		this.productName = productName;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.isDeleted = isDeleted;
		this.description = description;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCount() {
		return itemCount;
	}

	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

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

//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}

//	public StockStatus getStockStatus() {
//		return stockStatus;
//	}

//	public void setStockStatus(StockStatus stockStatus) {
//		this.stockStatus = stockStatus;
//	}

//	@JsonBackReference
//	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "product_id")
//	private Product product;

//	@Column(name = "status", nullable = false)
//	private StockStatus stockStatus;

}

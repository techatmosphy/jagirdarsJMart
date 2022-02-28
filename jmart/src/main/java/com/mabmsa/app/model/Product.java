package com.mabmsa.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String productName;
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	private String productCode;
	private Integer productCount;

	private String dateCreated;
	private String dateModified;
	private Character isDeleted;
	private String description;
	private String imageLink;

	private String salePrice;
	private Double price;
	
	private Double tax;
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "tax_id")
//    private Tax tax;

 //   private List<Offers> offers;


	private Long categoryId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
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

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Product() {
	}

	public Product(Long productId, String productName, String productCode, Integer productCount, String dateCreated,
			String dateModified, Character isDeleted, String description, String imageLink, String salePrice,
			Double price, Double tax, Long categoryId) {
		super();
		this.productId = productId;
		productName = productName;
		this.productCode = productCode;
		this.productCount = productCount;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.isDeleted = isDeleted;
		this.description = description;
		this.imageLink = imageLink;
		this.salePrice = salePrice;
		this.price = price;
		this.tax = tax;
		this.categoryId = categoryId;
	}
    
//	private Stocks stocks;
//	

}

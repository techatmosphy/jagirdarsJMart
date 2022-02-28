package com.mabmsa.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockStatus")
public class StockStatus {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stockStatusId;

	public Long getStockStatusId() {
		return stockStatusId;
	}

	public void setStockStatusId(Long stockStatusId) {
		this.stockStatusId = stockStatusId;
	}

	public StockStatus() {
	}

	public StockStatus(Long stockStatusId) {
		super();
		this.stockStatusId = stockStatusId;
	}
	
}

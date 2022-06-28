package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock
{
	@Id
	int sid;
	String stockName;
	String stockValue;
	public Stock(int sid, String stockName, String stockValue) {
		super();
		this.sid = sid;
		this.stockName = stockName;
		this.stockValue = stockValue;
	}
	public Stock() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockValue() {
		return stockValue;
	}
	public void setStockValue(String stockValue) {
		this.stockValue = stockValue;
	}
	@Override
	public String toString() {
		return "Stock [sid=" + sid + ", stockName=" + stockName + ", stockValue=" + stockValue + "]";
	}
}
	
package com.zensar.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="market")
public class Market
{
	@Id
	int mid;
	String name;

	@OneToMany(mappedBy="market")
	private List<Stock> stock=new ArrayList<>();
	public Market(int mid, String name, List<Stock> stock) {
		super();
		this.mid = mid;
		this.name = name;
		this.stock = stock;
	}
	public Market() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Stock> getStock() {
		return stock;
	}
	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Market [mid=" + mid + ", name=" + name + ", stock=" + stock + "]";
	}
}

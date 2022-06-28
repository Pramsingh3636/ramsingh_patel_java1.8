package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry
{
	@Id
	int eid;
	String detail;
	
	@OneToOne
	@JoinColumn(name="custid")
	Customer customer;

	public Enquiry() {
		super();
	}

	public Enquiry(int eid, String detail, Customer customer) {
		super();
		this.eid = eid;
		this.detail = detail;
		this.customer = customer;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Enquiry [eid=" + eid + ", detail=" + detail + ", customer=" + customer + "]";
	}
}

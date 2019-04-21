package com.website.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", catalog = "findfood")
public class Customer implements Serializable{
	private static final long serialVersionID= 1L;
	
	private int customerID;
	private String fullname;
	private String address;
	private String phone;
	private String email;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String fullname, String address, String phone, String email) {

		this.fullname = fullname;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false)
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	@Column(name = "FULLNAME", length = 100)
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "ADDRESS", length = 100)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "PHONE", length = 100)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

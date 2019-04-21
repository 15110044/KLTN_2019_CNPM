package com.website.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cook", catalog="findfood")
public class Cook implements Serializable {
	private static final long serialVersionID= 1L;
	
	private int idCook;
	private String fname;
	private String lname;
	private String email;
	private byte[] password;
	private int phone;
	private String description;
	private byte[] avartaData;
	private String avatar64bit;
	private List<Product> products = new ArrayList();
	
	public Cook() {
	}

	public Cook(int idCook, String fname, String lname, String email, byte[] password, int phone, String description,
			byte[] avartaData, String avatar64bit, List<Product> products) {
		this.idCook = idCook;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.description = description;
		this.avartaData = avartaData;
		this.avatar64bit = avatar64bit;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="ID",unique=true, nullable=false)
	public int getIdCook() {
		return idCook;
	}


	public void setIdCook(int idCook) {
		this.idCook = idCook;
	}


	@Column(name="FIRSTNAME")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name="LASTNAME")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="PASSWORD")
	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	@Column(name="PHONE")
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="AVARTA_DATA",length = 16777215 )
	public byte[] getAvartaData() {
		return avartaData;
	}

	public void setAvartaData(byte[] avartaData) {
		this.avartaData = avartaData;
	}

	@Column(name="AVARTA_64",length = 16777215 )
	public String getAvatar64bit() {
		return avatar64bit;
	}

	public void setAvatar64bit(String avatar64bit) {
		this.avatar64bit = avatar64bit;
	}

	@OneToMany(fetch=FetchType.EAGER,mappedBy="cook")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	} 
	
	

}

package com.project.model;

import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.project.BackendRepairs.BackendRepairsApplication;

@Entity
@Table(name = "tho", catalog = "repairment")
@EntityListeners(BackendRepairsApplication.class)
public class Tho implements Serializable {
	private static final long serialVersionID = 1L;

	private int maTho;
	private String username;
	private String password;
	private String hoten;
	private String namsinh;
	private String cmnd;
	private String sdt;
	private String diachi;
	private byte[] hinh;
	private int rating;
	private List<ThoDV> thoDV= new ArrayList();
	
	public Tho() {
		// TODO Auto-generated constructor stub
	}
	

	public Tho(int maTho, String username, String password, String hoten, String namsinh, String cmnd, String sdt,
			String diachi, byte[] hinh, int rating, List<ThoDV> thoDV) {
		
		this.maTho = maTho;
		this.username = username;
		this.password = password;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.cmnd = cmnd;
		this.sdt = sdt;
		this.diachi = diachi;
		this.hinh = hinh;
		this.rating = rating;
		this.thoDV = thoDV;
	}
	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MATHO", unique = true, nullable = false)
	public int getMaTho() {
		return maTho;
	}


	public void setMaTho(int maTho) {
		this.maTho = maTho;
	}

	@Column(name = "USERNAME", length = 500)
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 500)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "HOTEN", length = 500)
	public String getHoten() {
		return hoten;
	}


	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	@Column(name = "NAMSINH", length = 500)
	public String getNamsinh() {
		return namsinh;
	}


	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}

	@Column(name = "CMND", length = 500)
	public String getCmnd() {
		return cmnd;
	}


	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	@Column(name = "SDT", length = 500)
	public String getSdt() {
		return sdt;
	}


	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Column(name = "DIACHI", length = 500)
	public String getDiachi() {
		return diachi;
	}


	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Column(name = "HINH", length = 500)
	public byte[] getHinh() {
		return hinh;
	}


	public void setHinh(byte[] hinh) {
		this.hinh = hinh;
	}

	@Column(name = "RATING", length = 500)
	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}

	@OneToMany(mappedBy = "tho")
	@LazyCollection(LazyCollectionOption.FALSE)
	public List<ThoDV> getThoDV() {
		return thoDV;
	}

	public void setThoDV(List<ThoDV> thoDV) {
		this.thoDV = thoDV;
	}
}

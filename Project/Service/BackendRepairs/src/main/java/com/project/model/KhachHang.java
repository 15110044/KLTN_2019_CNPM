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
@Table(name = "khachhang", catalog = "repairment")
@EntityListeners(BackendRepairsApplication.class)
public class KhachHang implements Serializable {
	private static final long serialVersionID = 1L;

	private int maKH;
	private String tenNguoiDung;
	private String sdt;
	private String matKhau;
	private String email;
	private byte[] hinh;
	private String hinh64bit;
	private List<YeuCau> dsyc = new ArrayList();

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(int maKH, String tenNguoiDung, String sdt, String matKhau, String email, byte[] hinh,
			String hinh64bit, List<YeuCau> dsyc) {

		this.maKH = maKH;
		this.tenNguoiDung = tenNguoiDung;
		this.sdt = sdt;
		this.matKhau = matKhau;
		this.email = email;
		this.hinh = hinh;
		this.hinh64bit = hinh64bit;
		this.dsyc = dsyc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MAKH", unique = true, nullable = false)
	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	@Column(name = "TENNGUOIDUNG", length = 100)
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}

	@Column(name = "SDT", length = 100)
	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Column(name = "MATKHAU", length = 100)
	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "HINH", length = 16777215)
	public byte[] getHinh() {
		return hinh;
	}

	public void setHinh(byte[] hinh) {
		this.hinh = hinh;
	}

	@Column(name = "HINH_64", length = 16777215)
	public String getHinh64bit() {
		return hinh64bit;
	}

	public void setHinh64bit(String hinh64bit) {
		this.hinh64bit = hinh64bit;
	}

	@OneToMany(mappedBy = "khachhang")
	@LazyCollection(LazyCollectionOption.FALSE)
	public List<YeuCau> getDsyc() {
		return dsyc;
	}

	public void setDsyc(List<YeuCau> dsyc) {
		this.dsyc = dsyc;
	}

}

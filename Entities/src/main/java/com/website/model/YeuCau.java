package com.website.model;

import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "yeucau", catalog = "repairment")
public class YeuCau implements Serializable {
	private static final long serialVersionID = 1L;

	private DichVuCungCap dichvucungcap;
	private KhachHang khachhang;
	private int maYeuCau;
	private String tinhTrang;
	private String ngayYeuCau;
	private String ghiChu;
	private String diaChi;
	private List<HinhYeuCau> hyc = new ArrayList();

	public YeuCau() {
		// TODO Auto-generated constructor stub
	}

	public YeuCau(DichVuCungCap dichvucungcap, KhachHang khachhang, int maYeuCau, String tinhTrang, String ngayYeuCau,
			String ghiChu, String diaChi,List<HinhYeuCau> hyc) {

		this.dichvucungcap = dichvucungcap;
		this.khachhang = khachhang;
		this.maYeuCau = maYeuCau;
		this.tinhTrang = tinhTrang;
		this.ngayYeuCau = ngayYeuCau;
		this.ghiChu = ghiChu;
		this.diaChi = diaChi;
		this.hyc=hyc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAYEUCAU", unique = true, nullable = false)
	public int getMaYeuCau() {
		return maYeuCau;
	}

	public void setMaYeuCau(int maYeuCau) {
		this.maYeuCau = maYeuCau;
	}

	@Column(name = "TINHTRANG", length = 100)
	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Column(name = "NGAYYEUCAU", length = 100)
	public String getNgayYeuCau() {
		return ngayYeuCau;
	}

	public void setNgayYeuCau(String ngayYeuCau) {
		this.ngayYeuCau = ngayYeuCau;
	}

	@Column(name = "GHICHU", length = 100)
	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "DIACHI", length = 100)
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MADVCC", nullable = false)
	public DichVuCungCap getDichvucungcap() {
		return dichvucungcap;
	}

	public void setDichvucungcap(DichVuCungCap dichvucungcap) {
		this.dichvucungcap = dichvucungcap;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MAKH", nullable = false)
	public KhachHang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "yeucau")
	public List<HinhYeuCau> getHyc() {
		return hyc;
	}

	public void setHyc(List<HinhYeuCau> hyc) {
		this.hyc = hyc;
	}
	

}

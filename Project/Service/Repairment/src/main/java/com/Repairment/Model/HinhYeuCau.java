package com.Repairment.Model;

import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.Repairment.RepairmentApplication;

@Entity
@Table(name = "hinhyeucau", catalog = "repairment")
@EntityListeners(RepairmentApplication.class)
public class HinhYeuCau implements Serializable {
	private static final long serialVersionID = 1L;

	private DichVuCungCap dichvucungcap;
	private YeuCau yeucau;
	private int id;
	private byte[] hinh_yc1;
	private String hinh_yc1_64bit;
	private byte[] hinh_yc2;
	private String hinh_yc2_64bit;

	public HinhYeuCau() {
		// TODO Auto-generated constructor stub
	}

	public HinhYeuCau(DichVuCungCap dichvucungcap, YeuCau yeucau, int id, byte[] hinh_yc1, String hinh_yc1_64bit,
			byte[] hinh_yc2, String hinh_yc2_64bit) {

		this.dichvucungcap = dichvucungcap;
		this.yeucau = yeucau;
		this.id = id;
		this.hinh_yc1 = hinh_yc1;
		this.hinh_yc1_64bit = hinh_yc1_64bit;
		this.hinh_yc2 = hinh_yc2;
		this.hinh_yc2_64bit = hinh_yc2_64bit;
	}

	public byte[] getHinh_yc1() {
		return hinh_yc1;
	}

	public void setHinh_yc1(byte[] hinh_yc1) {
		this.hinh_yc1 = hinh_yc1;
	}

	public String getHinh_yc1_64bit() {
		return hinh_yc1_64bit;
	}

	public void setHinh_yc1_64bit(String hinh_yc1_64bit) {
		this.hinh_yc1_64bit = hinh_yc1_64bit;
	}

	public byte[] getHinh_yc2() {
		return hinh_yc2;
	}

	public void setHinh_yc2(byte[] hinh_yc2) {
		this.hinh_yc2 = hinh_yc2;
	}

	public String getHinh_yc2_64bit() {
		return hinh_yc2_64bit;
	}

	public void setHinh_yc2_64bit(String hinh_yc2_64bit) {
		this.hinh_yc2_64bit = hinh_yc2_64bit;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MAHINHYC", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "MADVCC", nullable = false)
	public DichVuCungCap getDichvucungcap() {
		return dichvucungcap;
	}

	public void setDichvucungcap(DichVuCungCap dichvucungcap) {
		this.dichvucungcap = dichvucungcap;
	}

	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "MAYEUCAU", nullable = false)
	public YeuCau getYeucau() {
		return yeucau;
	}

	public void setYeucau(YeuCau yeucau) {
		this.yeucau = yeucau;
	}

}
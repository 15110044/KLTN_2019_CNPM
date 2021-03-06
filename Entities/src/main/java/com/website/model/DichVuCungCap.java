package com.website.model;
import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dichvucungcap", catalog = "repairment")
public class DichVuCungCap implements Serializable {
	private static final long serialVersionID = 1L;

	private int maDVCC;
	private String tenDV;
	private List<YeuCau> dsyc = new ArrayList();
	private List<HinhYeuCau> hyc= new ArrayList();
	
	public DichVuCungCap() {
		// TODO Auto-generated constructor stub
	}
	
	public DichVuCungCap(int maDVCC, String tenDV,List<YeuCau> dsyc,List<HinhYeuCau> hyc) {

		this.maDVCC = maDVCC;
		this.tenDV = tenDV;
		this.dsyc = dsyc;
		this.hyc=hyc;
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MADVCC", unique = true, nullable = false)
	public int getMaDVCC() {
		return maDVCC;
	}

	public void setMaDVCC(int maDVCC) {
		this.maDVCC = maDVCC;
	}
	
	@Column(name = "TENDV", length = 500)
	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dichvucungcap")
	public List<YeuCau> getDsyc() {
		return dsyc;
	}

	public void setDsyc(List<YeuCau> dsyc) {
		this.dsyc = dsyc;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dichvucungcap")
	public List<HinhYeuCau> getHyc() {
		return hyc;
	}

	public void setHyc(List<HinhYeuCau> hyc) {
		this.hyc = hyc;
	}
}

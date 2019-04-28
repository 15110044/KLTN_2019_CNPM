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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.project.BackendRepairs.BackendRepairsApplication;

@Entity
@Table(name = "thodv", catalog = "repairment")
@EntityListeners(BackendRepairsApplication.class)
public class ThoDV implements Serializable {
	private static final long serialVersionID = 1L;

	private int maThoDV;
	DichVuCungCap dichvucungcap;
	Tho tho;
	public ThoDV() {
		// TODO Auto-generated constructor stub
	}
	

	public ThoDV(int maThoDV, DichVuCungCap dichvucungcap, Tho tho) {
		
		this.maThoDV = maThoDV;
		this.dichvucungcap = dichvucungcap;
		this.tho = tho;
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MATHODV", unique = true, nullable = false)
	public int getMaThoDV() {
		return maThoDV;
	}

	public void setMaThoDV(int maThoDV) {
		this.maThoDV = maThoDV;
	}

	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "MATHO", nullable = false)
	public Tho getTho() {
		return tho;
	}

	public void setTho(Tho tho) {
		this.tho = tho;
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
}

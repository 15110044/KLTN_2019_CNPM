package com.website.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product", catalog = "findfood")
public class Product implements Serializable {
	private static final long serialVersionID = 1L;

	private int idProduct;
	private String nameProduct;
	private String description;

	private byte[] imagedata;
	private byte[] image2data;
	private byte[] image3data;

	private String imgEnc64;
	private String img2Enc64;
	private String img3Enc64;

	private double price;
	private Cook cook;
	private Category category;

	public Product() {

	}

	public Product(int idProduct, String nameProduct, String description, byte[] imagedata, byte[] image2data,
			byte[] image3data, String imgEnc64, String img2Enc64, String img3Enc64, double price, Cook cook,
			Category category) {
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.description = description;
		this.imagedata = imagedata;
		this.image2data = image2data;
		this.image3data = image3data;
		this.imgEnc64 = imgEnc64;
		this.img2Enc64 = img2Enc64;
		this.img3Enc64 = img3Enc64;
		this.price = price;
		this.cook = cook;
		this.category = category;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "PRODUCTNAME", length = 100)
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	@Column(name = "DESCRIPTION", length = 100)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "I1_DATA", length = 16777215)
	public byte[] getImagedata() {
		return imagedata;
	}

	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}

	@Column(name = "I1_DATA64", length = 16777215)
	public String getImgEnc64() {
		return imgEnc64;
	}

	public void setImgEnc64(String imgEnc64) {
		this.imgEnc64 = imgEnc64;
	}

	@Column(name = "I2_DATA", length = 16777215)
	public byte[] getImage2data() {
		return image2data;
	}

	public void setImage2data(byte[] image2data) {
		this.image2data = image2data;
	}

	@Column(name = "I3_DATA", length = 16777215)
	public byte[] getImage3data() {
		return image3data;
	}

	public void setImage3data(byte[] image3data) {
		this.image3data = image3data;
	}

	@Column(name = "I2_DATA64", length = 16777215)
	public String getImg2Enc64() {
		return img2Enc64;
	}

	public void setImg2Enc64(String img2Enc64) {
		this.img2Enc64 = img2Enc64;
	}

	@Column(name = "I3_DATA64", length = 16777215)
	public String getImg3Enc64() {
		return img3Enc64;
	}

	public void setImg3Enc64(String img3Enc64) {
		this.img3Enc64 = img3Enc64;
	}

	@Column(name = "PRICE")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COOK_ID", nullable = false)
	public Cook getCook() {
		return cook;
	}

	public void setCook(Cook cook) {
		this.cook = cook;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}

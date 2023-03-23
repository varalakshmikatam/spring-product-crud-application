package com.name.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productspring")
public class Product {
	@Id
	private Integer proid;
	private String name;
	private double price;
	private Integer quntity;
	private String descripton;
	private String quality;
	public Product() {
		super();
	}
	public Product(Integer proid, String name, double price, Integer quntity, String descripton, String quality) {
		super();
		this.proid = proid;
		this.name = name;
		this.price = price;
		this.quntity = quntity;
		this.descripton = descripton;
		quality = quality;
	}
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getQuntity() {
		return quntity;
	}
	public void setQuntity(Integer quntity) {
		this.quntity = quntity;
	}
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		quality = quality;
	}
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", name=" + name + ", price=" + price + ", quntity=" + quntity
				+ ", descripton=" + descripton + ", Quality=" + quality + "]";
	}
	

}

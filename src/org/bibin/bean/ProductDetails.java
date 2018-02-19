package org.bibin.bean;

public class ProductDetails {
	String id ;
	String name;
	Double price;
	int discount;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}

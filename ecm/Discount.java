package com.tks.ecm;

public class Discount {
	private double price;
	private double discount;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getDiscountPrice() {
		return price -(price*discount/100);
	}

}

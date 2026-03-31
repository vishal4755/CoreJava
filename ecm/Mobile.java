package com.tks.ecm;

public class Mobile {
	  private String model;
	    private double price;

	 
	    Mobile(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	    String getModel() {
	        return model;
	    }

	    double getPrice() {
	        return price;
	    }
	    void setModel(String model) {
	        this.model = model;
	    }

	    void setPrice(double price) {
	        this.price = price;
	    }

	    double discount() {
	        return price - (price * 10 / 100);
	    }

}

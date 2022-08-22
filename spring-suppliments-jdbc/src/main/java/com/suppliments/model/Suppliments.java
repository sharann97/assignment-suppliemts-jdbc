package com.suppliments.model;

public class Suppliments {
	
   private String productName;
   private Integer productId;
   private double price;
   private String type;
   
   public Suppliments() {
		super();
	}
   

public Suppliments(String productName, Integer productId, double price, String type) {
	super();
	this.productName = productName;
	this.productId = productId;
	this.price = price;
	this.type = type;
}


public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public Integer getProductId() {
	return productId;
}

public void setProductId(Integer productId) {
	this.productId = productId;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Suppliments [productName=" + productName + ", productId=" + productId + ", price=" + price + ", type="
			+ type + "]";
}
   
   
   
}
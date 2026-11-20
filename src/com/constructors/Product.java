package com.constructors;

public class Product {
	String productid;
	String productname;
	double price;
	int quantity;
	
	Product(String productid, String productname, double price, int quantity) {
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}
	Product(Product p) {
		this.productid = p.productid;
		this.productname = p.productname;
		this.price = p.price;
		this.quantity = p.quantity;
	}
	public void calculatetotal() {
		double total = price * quantity;
		System.out.println("productid :" + productid);
		System.out.println("productname :" + productname);
		System.out.println("price :" + price);
		System.out.println("quantity :" + quantity);
		System.out.println("total price :" + total);
		System.out.println();
	}
	public static void main(String[] args) {
		Product product1 = new Product("e101", "basmathi", 1700.00, 1);
		Product product2 = new Product(product1);
		product2.quantity = 500000000;
		System.out.println("product1");
		product1.calculatetotal();
		System.out.println("product2");
		product2.calculatetotal();
	}

}

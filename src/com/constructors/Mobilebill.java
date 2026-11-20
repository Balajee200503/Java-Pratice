package com.constructors;

public class Mobilebill {
	String mobilemodel;
	int quantity;
	double price;
	double deliverycharge;
	double finalbill;

//	public Mobilebill(String mobilemodel) {
//		System.out.println("one arg constructor called");
//		this.mobilemodel = mobilemodel;
//	}
//	public Mobilebill(String mobilemodel, int quantity) {
//		System.out.println("two arg constructor called");
//		this.mobilemodel = mobilemodel;
//		this.quantity = quantity;
//	}
//	public Mobilebill(String mobilemodel, int quantity, double price) {
//		System.out.println("three arg constructor called");
//		this.mobilemodel = mobilemodel;
//		this.quantity = quantity;
//		this.price = price;
//	}
//
//	public Mobilebill(String mobilemodel, int quantity, double price, double deliverycharge) {
//		System.out.println("four arg constructor called");
//		this.mobilemodel = mobilemodel;
//		this.quantity = quantity;
//		this.price = price;
//		this.deliverycharge = deliverycharge;
//  }

	public Mobilebill(String mobilemodel, int quantity, double price, double deliverycharge, double finalbill) {
		System.out.println("five arg constructor called");
		this.mobilemodel = mobilemodel;
		this.quantity = quantity;
		this.price = price;
		this.deliverycharge = deliverycharge;
		this.finalbill = finalbill;
	}

	void display() {
		System.out.println("mobile model:" + mobilemodel);
		System.out.println("quantity:" + quantity);
		System.out.println("price:" + price);
		System.out.println("deliverycharge: " + deliverycharge);
		System.out.println("finalbill:" + finalbill);
	}

	public static void main(String[] args) {
//		Mobilebill b1 = new Mobilebill("vivo");
//		Mobilebill b2 = new Mobilebill("vivo", 1);
//		Mobilebill b3 = new Mobilebill("vivo", 1, 2000000.00);
//		Mobilebill b4 = new Mobilebill("vivo", 1, 2000000.00, 15.01);
		Mobilebill b5 = new Mobilebill("vivo", 1, 2000000.00, 15.01, 1000000.00);
//		b1.display();
//		b2.display();
//		b3.display();
//		b4.display();
		b5.display();
	}
}

package com.constructors;

class vehicle1 {
	String model;

	vehicle1(String model) {
		this.model = model;
	}
}

class car extends vehicle1 {
	String brand;
	double price;

	car(String model, String brand, double price) {
		super(model);
		this.brand = brand;
		this.price = price;
	}
}

class electriccar extends car {
	double batterycapacity;

	electriccar(String model, String brand, double price, double batterycapacity) {
		super(model, brand, price);
		this.batterycapacity = batterycapacity;
	}

	void display() {
		System.out.println(" vehicle model: " + model);
		System.out.println("brand :" + brand);
		System.out.println("price :" + price);
		System.out.println("battery capacity :" + batterycapacity);
	}
}

public class vehicle {

	public static void main(String[] args) {
		electriccar e1 = new electriccar("electriccar", "tesla", 450000, 75);
		e1.display();

	}
}

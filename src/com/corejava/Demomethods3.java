package com.corejava;

public class Demomethods3 {
	//methods with parameters and with return type
	public static void main(String[] args) {
		Demomethods D1 = new Demomethods();
		Demomethods D2 = new Demomethods();
		Demomethods D3 = new Demomethods();
		Demomethods D4 = new Demomethods();
		addition(10,20);
		subtraction(20,30);
		multiplication(40,50);
		division(60,70);
		System.out.println("main method started");
		System.out.println("main method ended");
	}
		 static void addition(int a,int b) {
			int c = a + b;
			System.out.println("addition : " + " " + c);
			return ;
	}
		 static void subtraction(int d,int e) {
			int f = d-e;
			System.out.println("subtraction : " + " " + f);
			return ;
	}
		 static void multiplication(int j,int k) {
			int l = j * k;
			System.out.println("multiplication: " + " " + l);
			return ;
	}
		 static void division(double m,double n) {
				double o = m / n;
				System.out.println("division : " + " " + o);
				return ;
		 
	}

}

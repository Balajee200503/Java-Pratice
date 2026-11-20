package com.corejava;

public class methods {
static void method1() {
 System.out.println("method 1 called");
 method2();
}
static void method2 () {
	System.out.println("method 2 called");
}
void method3 () {
	System.out.println("method 3 called");
	method4();
	method1();
}
void method4 () {
	System.out.println("method 4 called");
}
	public static void main(String[] args) {
	methods m = new methods ();
	m.method3();
	}
}

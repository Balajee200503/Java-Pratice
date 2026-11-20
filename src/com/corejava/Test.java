package com.corejava;

public class Test {


void addition (int a ,int b) {
	 
	 int c = a + b ;
	 System.out.println(c);
	subtraction(50, c);
	 
 }
 void subtraction (int d ,int e) {
	 System.out.println( d - e);
	 int f = d - e;
	 multiplication(f,5);
	 
 }
 void multiplication (int g,int h) {
	 System.out.println( g * h);
	 int i = g - h;
	 division(21,21);
 }
 void division (int j,int k) {
	 System.out.println( j / k);
	 int l = j - k;
	 
 }
	public static void main(String[] args) {
Test t1 = new Test()	;
t1.addition(10, 20);
}
}

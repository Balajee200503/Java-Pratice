package com.corejava;

import java.util.Scanner;

public class Demomethods1 {
// methods with return type + with no parameters;
	public static void main(String[] args) {
		System.out.println("main method started");
		 Scanner sc = new Scanner(System.in);
		basicpay(30000);
		da(11400);
		hra(2400);
		transportma(4600);
		pftax(6850);
		takehomeamount(41650);
		System.out.println("main method ended");
		
	} 
	 static void basicpay (double bp) {
		 System.out.println("employee basic pay:" + bp);
	 }
		 static void da (double da) {
			 System.out.println("employee daily allowances:" + da);
	 }
		 static void hra(double hra) {
			 System.out.println("employee house rent allowance:" + hra);
	 }
		 static void transportma(double tma) {
			 System.out.println("employee transport&ma:" + tma);
	 }
	     static void pftax(double pftax) {
			 System.out.println("employee provident fund and tax:" + pftax);
	 }
		 static void takehomeamount(double tha) {
			 System.out.println("employee takehomeamount:" + tha);
	 }
//		 static void 
		 
}

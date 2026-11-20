package com.corejava;

public class Demomethods {
	
	public static void main(String[] args) {
	System.out.println("main method started");
    getageinfo(21);
    getfullname("balajee","korni");
    weightinfo(68);
    heightinfo(5.9);
    genderinfo('m');
    sscmarks(99,96,97,99,99,99);
	System.out.println("main method ended");
	}
    static void getageinfo(int age) {
	     System.out.println("age of the person:"+ age);
}
	static void getfullname(String fname,String lname) {
		 System.out.println("the person full name :" + fname +" "+lname);
	}
	 static void weightinfo(double weight) {
		 System.out.println("the person weight is :" + weight);
	}
	 static void heightinfo(double height) {
		 System.out.println("the person height is " + height);
	 }
	 static void genderinfo(char c) {
		 System.out.println("the person gender is :" + c);
	 }
	 static void sscmarks(int t,int h,int e,int m,int so,int sc) {
		 int sum = t + h + e + m + so + sc;
		 int avg = sum / 6;
		 System.out.println("avg of the ssc marks :" + avg);
	 }
}

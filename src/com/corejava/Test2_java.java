package com.corejava;

import java.util.Scanner;

public class Test2_java {
static int balance = 20;
  static void deposit (int amount) {
	balance = balance + amount;
	System.out.println(balance);
 }
  static void withdrawl (int amount ) {
	  balance  = balance - amount;
	  System.out.println(balance);
	 
  }
  
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter withdraw amount");
		int balance = sc.nextInt();
		System.out.println("show balance amount");
		
		int amount=sc.nextInt();
		deposit(amount);
		withdrawl(amount);
		

	}

}

package com.constructors;
import java.util.*;

import java.util.Scanner;

public class BankAccount {
	// initializing the data types ;
	 String accountnumber;
	 String customername;
	 String accounttype;
	 double balance;
	// initializing the parameterized constructor;
	BankAccount(String accountnumber, String customername, String accounttype, double balance) {
		this.accountnumber = accountnumber;
		this.customername = customername;
		this.accounttype = accounttype;
		this.balance = balance;
	}
	void BankAccountinfo() {
		System.out.println("**********BankAccount**********");
		System.out.println("enter bank account details");
		System.out.println("accountnumber:" + " " + accountnumber);
		System.out.println("customername:" + " " + customername);
		System.out.println("accounttype:" + " " + accounttype);
		System.out.println("balance:" + " " + balance);
		System.out.println("thank you  for choosing this our bank");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount("e101", "balu", "high value account", 180000000000.0);
		BankAccount b2 = new BankAccount("e102", "prabhas", "zero value account", 180000000000.0);
		b1.BankAccountinfo();
		b2.BankAccountinfo();
	}
}

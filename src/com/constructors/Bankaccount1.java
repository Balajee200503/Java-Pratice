package com.constructors;

//******************************copy constructors*************************// 

public class Bankaccount1 {
static String accountNumber;
 static String accountholdername;
 static double balance;
 static String branch;
 Bankaccount1(String accountNumber, String accountholdername, double balance, String branch) {
	 this.accountNumber = accountNumber;
	 this.accountholdername = accountholdername;
	 this.balance = balance;
	 this.branch = branch;
 }
  Bankaccount1(Bankaccount1 b) {
	 this.accountholdername = b.accountholdername;
	 this.accountNumber = b.accountNumber;
	 this.balance = b.balance;
	 this.branch = branch; 
 }
   public static void displayaccountdetails() {
	 System.out.println("*********** welcome to sbi bank*************");
	 System.out.println("accountnumber :" + accountNumber);
	 System.out.println("accountholdername :" + accountholdername);
	 System.out.println("balance :" + balance);
	 System.out.println("branch :" + branch );
	 System.out.println("********** thank you for choosing our bank********* ");
  }
 public static void main(String[] args) {
	 Bankaccount1 b = new Bankaccount1("balu","b101",2000.00,"kphb");
	 Bankaccount1 b1 = new Bankaccount1(b);
	 b.displayaccountdetails();
	 b1.displayaccountdetails();
	}

}

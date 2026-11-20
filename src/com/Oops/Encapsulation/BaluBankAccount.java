package com.Oops.Encapsulation;

public class BaluBankAccount {

	private long accountNumber;
	private Double balance;
	private String Name;
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}

//	public void setaccountNumber(long accountNumber){
//		this.accountNumber = accountNumber;
//	}
//	public long getaccountNumber() {
//		return accountNumber; 
//	}
//	public void setbalance(double balance) {
//		if(balance > 0) {
//		this.balance = balance;
//	}else {
//		System.out.println("invalid amount");
//		System.out.println("please try again");
//	}
//	}
//	public double getbalance() {
//		return balance;
//	}
//	public void setName(String Name) {
//		this.Name = Name  + "- " + "sbibank-57032";
//	}
//	public String getName() {
//		return Name;
//		
//	}
//	
//}




















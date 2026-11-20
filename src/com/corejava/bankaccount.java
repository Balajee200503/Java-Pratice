package com.corejava;

import java.util.Scanner;

public class bankaccount {
	//intialize the static block
	static double acccountnogenerator = 1000;
	// instance variable
	double accountno;
	String accountholdername;
	double balance;
	
	//initialize the instance block
	{
	acccountnogenerator++;
	accountno = acccountnogenerator;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    bankaccount b1 = new bankaccount();
    
    b1.accountno = 1000;
    b1.accountholdername= "balu";
    b1.balance = 500000000;
    
    System.out.println("acountno:" + " " + b1.accountno);
    System.out.println("accountholdername" + " " + b1.accountholdername);
    System.out.println("balance" +" "  + b1.balance);
    System.out.println();
    
    bankaccount b2 = new bankaccount();
    b2.accountno = 1001;
    b2.accountholdername= "ramu";
    b2.balance = 5000000;
    System.out.println("acountno:" + " " + b2.accountno);
    System.out.println("accountholdername" + " " + b2.accountholdername);
    System.out.println("balance" +" "  + b2.balance);
    System.out.println();
    

		
	}

}

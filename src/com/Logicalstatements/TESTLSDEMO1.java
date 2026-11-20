package com.Logicalstatements;

import java.util.Scanner;

public class TESTLSDEMO1 {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age : ");
		int age = sc.nextInt();
		
		if (age >=18) {
			System.out.println("!!!good day!!!");
		System.out.println("congractulations you are eligible for the vote");
		} else {
			System.out.println("pilla baccha naayala neeku endhuku ra bikeuu!!!");
			System.out.println("thank you");
		}
		
		System.out.println("main method ended");
		sc.close();
		
	}

}

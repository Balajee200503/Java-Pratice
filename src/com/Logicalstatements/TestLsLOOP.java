package com.Logicalstatements;

import java.util.Scanner;

public class TestLsLOOP {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = sc.nextInt();
		// calling a method to print a numbers
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}

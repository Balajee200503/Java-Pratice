package com.Loopingstatements;

import java.util.Scanner;

public class TestprintingTables {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("which table you have to print ");
		int n = sc.nextInt();
		System.out.println("how many times you have to print the table");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(n + " X " + i + " = " + i * n);
		}
	}
}

package com.Logicalstatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		int square = n * n;
		int sum = 0;

		while (square > 0) {
			sum = sum + (square % 10);
			square = square / 10;

		}
		if (sum == n) {
			System.out.println("it is neon number");
		} else

			System.out.println("it is  not neon number");
	}
}

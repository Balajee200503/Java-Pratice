package com.Logicalstatements;

import java.util.Scanner;

public class TESTLSDEMO4 {
//wap to print the percentage based marks
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks percentage");
		Double marksp = sc.nextDouble();

		if (marksp < 0 || marksp > 100) {
			System.out.println("invalid marks");
		} else if (marksp >= 95) {
			System.out.println("grade S");
			System.out.println("congratualtions boy you have a bright future ");
		} else if (marksp >= 90) {
			System.out.println("grade A");
			System.out.println("keep hardworking well champ");
		} else if (marksp >= 80) {
			System.out.println("grade B");
		} else if (marksp >= 70) {
			System.out.println("grade C");
		} else if (marksp >= 50) {
			System.out.println("grade D");
			System.out.println("you must need to study hard");
		} else if (marksp >= 35) {
			System.out.println("just passed");
			System.out.println("grade E");
		}
		System.out.println("main method ended");
		sc.close();
	}

}

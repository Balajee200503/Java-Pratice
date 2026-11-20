package com.Loopingstatements;

import java.util.Scanner;

public class Electricitybillprgm {

	public static void main(String[] args) {
		
		int rate = 0;
		int units;
		double totalbill = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("*********welcome to balu electricity***********");
		System.out.println("please choose your connection type");
		System.out.println("domestic");
		System.out.println("commercial");

		System.out.println("enter yor connection type:");
		String ctp = sc.next();

		System.out.println("enter no of units consumed");
		units = sc.nextInt();

		switch (ctp) {
		case "domestic" -> {
			
			if (units <= 100) {
				rate = 2;
			} else {
				rate = 3;
			}		
		}
		case "commercial" -> {
			
			 
			if(units <= 100 || units >= 300) {
				rate = 4;
			} else {
				rate =6;
			}
		}
		default -> System.out.println("invalid connection type!!!! please enter a valid connection");
		
		}
		totalbill = units * rate;
		
		System.out.println("********total electricity bill invoice******");
		System.out.println("enter connectiontype:"  + ctp );
		System.out.println(" no of units consumed:"  + units);
		System.out.println("rate charged : "+ rate);
		System.out.println("total electricity bill :"+ totalbill);
		System.out.println(" thank you ");
		sc.close();
	}

}

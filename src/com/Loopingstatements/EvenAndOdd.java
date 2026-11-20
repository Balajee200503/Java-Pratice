package com.Loopingstatements;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started");
		System.out.println("please enter the number");
		int n = sc.nextInt();
		int arr[] = {10,20,30,35,45,51,66,89,9,0};
		int even = 0;
		int odd = 0;
		 for(int i=0;i< arr.length;i++) {
			 if (arr[i] %2 ==0) {
				 even ++;
			 }
			 else {
				 odd ++;
			 }
			
		 }
		 System.out.println(even +  "  even numbers");
		 System.out.println(odd + " odd number");
	}

}

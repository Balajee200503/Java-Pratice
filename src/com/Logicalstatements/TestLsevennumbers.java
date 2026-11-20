package com.Logicalstatements;

import java.util.Scanner;

public class TestLsevennumbers {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = sc.nextInt();
	
for (int i=1;i<=n;i++) {
if(i%2==0) {	
	System.out.println(i);
}

}
}
}
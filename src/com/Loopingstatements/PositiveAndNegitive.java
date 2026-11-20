package com.Loopingstatements;

import java.util.Scanner;

public class PositiveAndNegitive {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc = new Scanner(System.in);

	int [] arr = {10,20,30,40,50,-10,-20,-30};
	int pos = 0;
	int neg = 0;
	for (int i=0;i < arr.length;i++) {
		if(arr[i] > 0) {
			pos ++;
		}
		else {
			neg ++;
		}
	}
	System.out.println("positive number" + pos);
	System.out.println("negitive number" + neg);
	}

}

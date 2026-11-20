package com.Logicalstatements;

import java.util.Scanner;

public class TestMagicNumber {
	static boolean magicNumber(int n){
		boolean status = false;
		int r=0;
		int sum = 0;
		if(n==1 ) {
			return true;
			
		}
	
		while(n > 9) {
			sum = 0;
			while (n > 0) {
				r = n % 10;
				n = n / 10;
				sum = sum + r;
			}
			n = sum;
		}
			if(sum == 1) {
				status =true;
		}
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean flag=magicNumber(n);
				if(flag) {
			System.out.println("the given number is magic number");
		}else {
			System.out.println("the given number is Not magic number");
		}
	}
}


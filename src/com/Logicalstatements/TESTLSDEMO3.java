package com.Logicalstatements;

import java.util.Scanner;

public class TESTLSDEMO3 {
//WAP TO ELIGIBLE FOR THE PASSPORTNAME  OR NOT....?
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
	System.out.println("enter a full name");
		String fname = sc.nextLine();
		if(fname.length() <= 15) {
			System.out.println(" congratulations !!! your name is eligible for the passport");
			
		}else {
			System.out.println("your name is too long,you must short your name");
		}
		System.out.println("main method ended");
	}

}

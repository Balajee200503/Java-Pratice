package com.Loopingstatements;

import java.util.Scanner;

public class MoveZeroesToLastArr {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int arr [] = {1,0,2,0,0,9,1,0,7,0};
		int index = 0;
		int pos= 0;
		
		for(int i=0;i < arr.length; i++) {
			if(arr[i]!= 0 ) {
				arr[pos] = arr[i];
				pos ++;
			}
		}
		for(int i = pos;i<arr.length;i++) {
				arr[i] =0;
		}
		for(int i =0;i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}

}

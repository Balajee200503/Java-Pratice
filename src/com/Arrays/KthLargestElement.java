package com.Arrays;

import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 4, 5, 7, 1, 3 };
		int k = 3;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println(k + " largest element :" + arr[k-1]);
	}

}

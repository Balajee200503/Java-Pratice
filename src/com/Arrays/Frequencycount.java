package com.Arrays;

public class Frequencycount {

	public static void main(String[] args) {
		
		        int arr[] = {1,2,1,3,1,2,3,4,5,6,1,4,2};

		        for (int i = 0; i < arr.length; i++) {

		            int count = 0;
		            boolean visited = false;

		            // Check whether the element appeared before
		            for (int j = 0; j < i; j++) {
		                if (arr[i] == arr[j]) {
		                    visited = true;
		                    break;
		                }
		            }

		            if (visited == false) {

		                // Count frequency
		                for (int j = 0; j < arr.length; j++) {
		                    if (arr[i] == arr[j]) {
		                        count++;
		                    }
		                }

		                System.out.println(arr[i] + " -> " + count);
		            }
		        }
		    }
	

	}



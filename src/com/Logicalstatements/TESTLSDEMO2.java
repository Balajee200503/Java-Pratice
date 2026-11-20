package com.Logicalstatements;

import java.util.Scanner;

public class TESTLSDEMO2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("are you hard working everyday for the girl");
		boolean areyouhardworkingeveryday = sc.nextBoolean();
		
		System.out.println("are you daily loving her");
		boolean areyoudailylovingher = sc.nextBoolean();
		
		System.out.println("do you think still she have feelings on you");
		boolean doyouthinkstillshehavefeelingsonyou = sc.nextBoolean();
		
		if(areyouhardworkingeveryday &&  areyoudailylovingher  || doyouthinkstillshehavefeelingsonyou) {
			System.out.println("congractulations she is loving you");
		}else {
			System.out.println("nee face nuvvu mirror lo chusuko ra bokuu!!!");
		}
		sc.close();
	}
}
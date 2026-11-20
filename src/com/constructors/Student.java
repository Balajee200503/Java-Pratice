package com.constructors;

import java.util.Scanner;

public class Student {
	 int sid = 123;
	 String name;
	
	
	  Student() {
		
		System.out.println(sid);
	}
	 
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Student s= new Student();
s.sid = 789;
 System.out.println(s.sid);
//Student s2  = new Student();
//s2.sid = 999;
	}

}

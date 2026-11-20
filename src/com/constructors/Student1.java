package com.constructors;

public class Student1 {
	static int count;

	Student1() {
		count++;
	}

	public static void main(String[] args) {

		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		System.out.println(count);

	}

}

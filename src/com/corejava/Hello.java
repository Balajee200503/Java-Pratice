package com.corejava;

class Hello {

	void main() throws ClassNotFoundException {
		
		
		System.out.println("main method started");
		System.out.println("hello world");
		System.out.println("java.lang.System");
		System.out.println("java.lang.string");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended");//create instance object loading sql to the jdbc loader
	}

}

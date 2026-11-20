package com.corejava;
public class Newmethods {
	 static void method1() {
		System.out.println("method1 called");
		method2 ();
	}
		  static void method2() {
		System.out.println("method2 called");
		
		}
		 void method3() {
		System.out.println("method3 called");
		method4 ();
		method1 ();
		}
		 void method4() {
		System.out.println("method4 called");
		}
	public static void main(String[] args) {
		methods m = new methods();
        m.method3 ();
	}

}

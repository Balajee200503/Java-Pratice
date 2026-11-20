package com.corejava;

import java.util.Scanner;

public class Bugtracker {
	static Scanner sc = new Scanner(System.in);
	int getbugid;
	String aplicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assigneddeveloper;

	static int bugid() {
		int bugid = sc.nextInt();
		return bugid;
	}

	static String aplicationname() {
		sc.nextLine();
		String applicationname = sc.nextLine();
		return applicationname;
	}

	static String bugtitle() {
		String bugtitle = sc.nextLine();
		return bugtitle;
	}

	static String severity() {
		String bugid = sc.nextLine();
		return bugid;
	}

	static String priority() {
		String priority = sc.nextLine();
		return priority;
	}

	static String status() {
		String status = sc.nextLine();
		return status;
	}

	static String assigneddeveloper() {
		String assigneddeveloper = sc.nextLine();
		return assigneddeveloper;
	}

	static void assignedtodeveloper(int id, String name) {
		if (name != null) {
			updatestatus("development");
		}

	}

	static void updatestatus(String string) {
//		status = string;

	}

	public static void main(String[] args) {
		Bugtracker b1 = new Bugtracker();
		b1.getbugid = b1.bugid();
		b1.aplicationname = b1.aplicationname();
		b1.bugtitle = b1.bugtitle();
		b1.severity = b1.severity();
		b1.priority = b1.priority();
		b1.status = b1.status();
		b1.assigneddeveloper = b1.assigneddeveloper();
		System.out.println(b1.getbugid);
		System.out.println(b1.aplicationname);
		System.out.println(b1.bugtitle);
		System.out.println(b1.severity);
		System.out.println(b1.priority);
		System.out.println(b1.status);
		System.out.println(b1.assigneddeveloper);

		b1.assignedtodeveloper(b1.getbugid, b1.assigneddeveloper);
		System.out.println(b1.getbugid);
		System.out.println(b1.aplicationname);
		System.out.println(b1.bugtitle);
		System.out.println(b1.severity);
		System.out.println(b1.priority);
		System.out.println(b1.status);
		System.out.println(b1.assigneddeveloper);

	}

}

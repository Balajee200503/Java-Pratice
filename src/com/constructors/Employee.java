package com.constructors;

public class Employee {

//initializing the data types to the employee
	  int eid;
	 String ename;
	 double esal;
//initializing the parameterized constructor;;
	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	void display() {
		System.out.println("**********employee details*******");
		System.out.println("employee id " + " " + eid);
		System.out.println("employee name " + " " + ename);
		System.out.println("employee sal" + " " + esal);
	}
	public static void main(String[] args)  {
			Employee e = new Employee (123,"balu",180000);

	 e.display();
	}

}

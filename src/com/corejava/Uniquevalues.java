package com.corejava;

public class Uniquevalues {
	int empid;
	String emp_name;
	double emp_salary;
    
	
	 void displaydetails() {
		 System.out.println("EMPLOYEE_ID:" + empid);
		 System.out.println("EMPLOYEE_NAME:" + emp_name);
		 System.out.println("EMPLOYEE_SALARY:" + emp_salary);
		 System.out.println();
	}
	public static void main(String[] args) {
      Uniquevalues u1 = new Uniquevalues();
      Uniquevalues u2 = new Uniquevalues();
      Uniquevalues u3 = new Uniquevalues();
       u1.empid = 80015;
       u1.emp_name = "balu";
       u1.emp_salary = 5000000;
       u2.empid = 80016;
       u2.emp_name = "ram";
       u2.emp_salary = 500000;
       u3.empid = 80017;
       u3.emp_name = "rahim";
       u3.emp_salary = 500000;
      u1.displaydetails();
      u2.displaydetails();
      u3.displaydetails();
	}

}

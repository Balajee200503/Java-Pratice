package com.corejava;

public class datatypes {
	int employeeID;
	int employeeage;
	double salary;
	String employeegrade;
	int yearsofexperience;
	Boolean employeeisactive;
	short numberofleaves;
	long employeephonenumber ;
	
	
	public static void main(String[] args) {
   datatypes e1 = new datatypes();
   
   e1.employeeID = 1234;
   e1.employeeage = 21;
   e1.salary = 350000.02;
   e1.employeegrade = "A";
   e1.yearsofexperience = 21;
   e1.employeeisactive = true;
   e1.numberofleaves =213;
   e1.employeephonenumber = 9347970070L;
   
   System.out.println("EMPLOYEE"+e1.employeeID);
   System.out.println(e1.employeeage);
   System.out.println(e1.salary);
   System.out.println(e1.employeegrade );
   System.out.println(e1.employeeisactive );
   System.out.println( e1.numberofleaves);
   System.out.println(e1.employeephonenumber);
	}

}

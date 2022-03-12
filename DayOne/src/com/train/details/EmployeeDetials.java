package com.train.details;

public class EmployeeDetials extends Employee {
	
	public void employeeId()
	{
		System.out.println(420);
		
	
	}
public void employeeName()
{System.out.println("Anuram");

}
	public static void main(String[] args) {


	EmployeeDetials e=new EmployeeDetials();
	e.employeeName();
	e.employeeId();
	e.add(12, 12);
	e.sub(12, 2);
	e.test();
	

}
}
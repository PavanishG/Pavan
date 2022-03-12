package com.train.details;

public class StudentDetails extends CalculatorClass {

	public void studId()
	{
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
	public void studName(String a)
	{
		System.out.println(a);
		System.out.println("raju");
		System.out.println("Pavan");
	}
	public static void main(String[] args) {
		StudentDetails sd= new StudentDetails();
		sd.studId();
		sd.studName("Na anupradha print pannu");
		sd.add(1, 1);
	}
}

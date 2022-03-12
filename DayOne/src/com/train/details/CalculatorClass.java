package com.train.details;

public class CalculatorClass {
	public static void main(String[] args) {
		CalculatorClass c= new CalculatorClass();
		c.add(7, 3);
		c.sub(7, 3);
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public int sub(int a, int b)
	{	
		int c= a-b;
		System.out.println(c);
		return c;
	
		
	}
	
}

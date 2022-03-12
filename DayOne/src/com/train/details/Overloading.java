package com.train.details;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.test(10);
		o.test("Pavanish");
	}
	
	public void test(int a)
	{
		System.out.println("result is :"+a);
	}
	
	public void test(String a)
	{
		System.out.println("result is :"+" ----> "+a);
	}

}

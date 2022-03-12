package com.train.details;

public class TestOverride extends Overriding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverride to = new TestOverride();	
		to.stud();
	}
	
	@Override
	public void stud() {
		System.out.println("Poda Deiii");
		super.stud();
		//upcasting
	}
}

package com.train.details;

public class Overriding1 extends Overriding{
	
	@Override
	public void stud() {
		System.out.println("pooja");
		super.stud();
	}
	public static void main(String[] args) {
		Overriding1 o = new Overriding1();//downcasting
		o.stud();
	}

}

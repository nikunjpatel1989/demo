package com.validator;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.name();
	}

	@Validator
	public void name() {
		System.out.println("Inside Name");

	}
}

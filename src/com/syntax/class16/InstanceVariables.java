package com.syntax.class16;

public class InstanceVariables {

	String name = "John";// Instance variable

	public static void main(String[] args) {

		String name = "Yunus";
		System.out.println(name);

		InstanceVariables object = new InstanceVariables();
		System.out.println(name);

		object.name = "Ali";
		System.out.println(name);
		System.out.println(object.name);

		// change value of local variable
		name = "Farid";
		System.out.println(name);

	}
}

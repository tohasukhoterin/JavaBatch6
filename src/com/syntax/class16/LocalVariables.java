package com.syntax.class16;

public class LocalVariables {

	void nameInside() {
		String name = "John";// local variable that visible only within method was declared

	}

	void anothorName() {
		String name = "John";
	}

	public static void main(String[] args) {
		// System.out.println(name);CE: name won't be visible to another method
		// since it's scope only within nameInside method

		LocalVariables obj = new LocalVariables();
		obj.nameInside();

		boolean flag = true;
		if (flag) {
			String answer = "yes";
		}
		// System.out.println(answer);CE: scope of variable answer is not visible
		// outside of the if block

		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println("");
		for (int i = 1; i <= 3; i++) {
			System.out.print(i);
		}

	}

}

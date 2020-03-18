package com.syntax.class07;

public class DoWhile {
	public static void main(String[] args) {
		int num = 1;
		while (num <= 5) {
			System.out.println("Hello");
			num++;
		}
		System.out.println("-----using do while-----");
		int num1 = 1;
		do {
			System.out.println("Bye");
			num1++;
		} while (num1 <= 5);
	}

}

package com.syntax.class15;

import java.util.Scanner;

public class MethodsTest {

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.sayWelcome();

		String s;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.print("Eneter the word: ");
		s = scan.nextLine();
		System.out.print("Enter the number: ");
		i = scan.nextInt();
		obj.sayWord(s, i);

	}
}

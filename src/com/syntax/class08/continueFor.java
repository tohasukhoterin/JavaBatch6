package com.syntax.class08;

public class continueFor {

	public static void main(String[] args) {
		for (int y = 1; y <= 5; y++) {
			if (y == 2) {
				System.out.println("I am skipping iteration");
				continue;
			}
			System.out.println("I am inside the loop");
			System.out.println(y);
		}
		System.out.println("******************************");
		// write a program that print numbers from 1 to 20
		// i do not want to print 5, 6, 7
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
				// continue пропускает двльнейшее выполнение кода в цикле в данной конкретной
				// итерации
			}
			System.out.println(i);
		}

	}

}

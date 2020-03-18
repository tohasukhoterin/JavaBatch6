package com.syntax.class10;

public class AdvancedFor {
	public static void main(String[] args) {
		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println("");
		System.out.println("-------------------");
		for (String fruit : fruits) {
			if (fruit.equals("Apple")) {
				System.out.println(fruit + " is your favorite fruit");
			} else {
				System.out.println(fruit);
			}
		}
	}
}

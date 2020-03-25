package com.syntax.class16;

public class MethodsRecap {

//create a method that accepts array of int and return max element.
	int getMax(int[] array) {
		
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
//create a method that accepts String and return each word from given String
	String[] getWords(String str) {
		String[] array=str.split(" ");
		return array;
	}
}

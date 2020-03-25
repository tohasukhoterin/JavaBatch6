package com.syntax.class16;

public class MethodsRecCall {
	public static void main(String[] args) {
		
		MethodsRecap obj=new MethodsRecap();
		
		int[] arr= {10, 20, 38, 12};
		System.out.println(obj.getMax(arr));
		
		String myString="It is a beatiful world";
		String[] words=obj.getWords(myString);
		for (String print:words) {
			System.out.println(print);
		}
	}

}

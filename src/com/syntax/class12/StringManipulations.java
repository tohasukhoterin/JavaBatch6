package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		String str = "Good Morning Students!";
		char let1 = str.charAt(0);
		System.out.println(let1);
		char let5 = str.charAt(4);
		System.out.println("Letter at index 4 is " + let5 + ".");
		// char let55=str.charAt(55); RunTime Exception
		// -->StringIndexOutOfBoundsException
		// System.out.println(let55);
		// get all characters 1 by 1 from String?
		char let;
		for (int i = 0; i < str.length(); i++) {
			let = str.charAt(i);
			System.out.print(let + " ");
		}
		System.out.println("");
		System.out.println("----------------INdexOf---------------");

		String name = "Syntax Technologies";
		int ind = name.indexOf("y");
		System.out.println(ind);

		ind = name.indexOf(" ");
		System.out.println(ind);

		ind = name.indexOf("Syntax");
		System.out.println(ind);

		ind = name.indexOf("!");
		System.out.println("Index of not existing character " + ind);

		ind = name.indexOf("Technologies");
		System.out.println("Index of substring Technologies " + ind);

		ind = name.lastIndexOf("o");
		System.out.println("Index of second o = " + ind);

		ind = name.indexOf("o", 13);
		System.out.println("Index of second o = " + ind);

		System.out.println("------------------SubString FUNCTION-------------------");
		String str10= "Today is a rainy day";
		
		String partialString= str10.substring(6);//start from 6 until the end of the string
		System.out.println(partialString);
		
		//rainy day
		partialString= str10.substring(11);
		System.out.println(partialString);
		
		//today
		partialString= str10.substring(0,5);//start from 0 end at index 5
		System.out.println(partialString);
		
		//rainy
		partialString= str10.substring(11,16);
		System.out.println(partialString);
		
	}

};

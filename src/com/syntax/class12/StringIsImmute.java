package com.syntax.class12;

public class StringIsImmute {

	public static void main(String[] args) {
		String s="Hello";
		String s1="World";
		
		s=s.concat(s1);
		s.concat(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.concat(s1));
	}

}

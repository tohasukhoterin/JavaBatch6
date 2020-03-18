package com.syntax.class12;

public class recap {

	public static void main(String[] args) {
		String str = "";// empty value
		System.out.println(str.isEmpty());

		String str1 = null;// no value at all
		// System.out.println(str1.isEmpty());
		System.out.println(" --------------------------------------------- ");

		String str2 = " Good Morning ";
		String str3 = "students";
		String str4 = "!";
		str2 = str2.concat(str3).concat(str4).trim();
		System.out.println(str2);
		
		System.out.println(" --------------------------------------------- ");
		String str6,str7;
		str6=" Hello ";
		str7="Syntax";
		str6=str6.concat(str7).trim();
		System.out.println(str6);
	}

}

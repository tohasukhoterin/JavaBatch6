package com.syntax.class12;

public class SplitFuncrion {

	public static void main(String[] args) {
			System.out.println("----------split() Function----------");
			
			String td="Today is my favorite Java class";
			String[] ar=td.split(" ");
			System.out.println(ar.length);
			System.out.println(ar[0]);
			System.out.println(ar[1]);
			System.out.println(ar[2]);
			System.out.println(ar[3]);
			System.out.println(ar[4]);
			System.out.println(ar[5]);
			System.out.println("--------------------");
			
			String[] ar1=td.split("my");
			System.out.println(ar1.length);
			System.out.println(ar1[0]);
			System.out.println(ar1[1]);
			System.out.println("--------------------");
			
			String[] stringar=td.split("a");
			//print all elements of the array 1 by 1
			//(elementType variableName : NameOfArray
			for (String ola:stringar) {
				System.out.print(ola+"|");
			}
			System.out.println();
			for (String pp:ar) {
				System.out.print(pp+"|");
			}
			
			
	}

}

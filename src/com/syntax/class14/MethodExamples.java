package com.syntax.class14;

public class MethodExamples {
	
	//want to create a method that will be greeting a person
	void greet() {
		System.out.println("Hello Sarmed");
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main (String[] args) {
		//how do I Call method greet? --> first we need to create an Object of the class
		//where that method belongs
		
		//className variableName = new ClassName();
		MethodExamples object1=new MethodExamples();
		object1.greet1("Sarmed");
		object1.greet1("Anton");
		object1.greet1("Denis");
		object1.greet();
		
	}
}

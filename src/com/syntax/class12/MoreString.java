package com.syntax.class12;

public class MoreString {

	public static void main(String[] args) {
		
		String me="I am a good tester";
		
		System.out.println("----------replace() Funcrion----------");
		
		String newme=me.replace("a", "c");
		System.out.println(newme);
		//if it finds matching char sequence --> then replace
		me=me.replace("good", "great");
		System.out.println(me);
		//if it is not finding matching sequence --> no replace
		me=me.replace("Great", "Awesome");
		System.out.println(me);
		
		String car="I have a Toyota";
		car=car.replace("Toyota", "Lexus");
		System.out.println(car);
		
		System.out.println("----------replaceALL() FUNCTION----------");
		String str="Phone number is 9173744685";
		str=str.replaceAll("[A-Za-z ]", "");
		System.out.println(str);
		
		String str1="Hello12347**&&*  !!!89";
		str1=str1.replaceAll("[0-9]", "A");
		System.out.println(str1);
		str1=str1.replaceAll("[^A-Za-z]", "A");
		System.out.println(str1);
		
		String str2="Hello123^&^&&^&*^!";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String str3="HEllo all students";
		str3=str3.replace(" ", "");
		System.out.println(str3);
		
		String str4="Java";
		str4=str4.replace("a", "e");
		System.out.println(str4);
		str4=str4.replaceFirst("e","a");
		System.out.println(str4);
	}
	

}

package com.syntax.class14;

public class DogProg {
	public static void maint(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Golden retriver";
		dog1.color = "Yellow";
		dog1.name = "Trevor";
		dog1.age = 10;

		Dog dog2 = new Dog();
		dog2.breed = "German Shepherd";
		dog2.color = "Mixed";
		dog2.name = "Kay";
		dog2.age = 12;

		dog1.eat();
		dog1.bark();
		dog2.eat();
		dog2.bark();
	}

}

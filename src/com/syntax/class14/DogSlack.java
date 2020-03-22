package com.syntax.class14;

public class DogSlack {

	String breed, color, name;
	int age;

	void eat() {
		System.out.println(breed + " can eat!");
	}

	void bark() {
		System.out.println(breed + " can bark!");
	}

	public static void main(String[] args) {

		DogSlack dog1 = new DogSlack();

		dog1.breed = "Golden Retriver";
		dog1.color = "Yellow";
		dog1.name = "Trevor";
		dog1.age = 3;

		dog1.eat();
		dog1.bark();

		DogSlack dog2 = new DogSlack();

		dog2.breed = "German Shephered";
		dog2.color = "Black";
		dog2.name = "Jack";
		dog2.age = 3;

		dog2.eat();
		dog2.bark();

	}

}
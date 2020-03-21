package com.syntax.class14;

public class MyGarage {

	public static void main(String[] args) {

		// build individual objects
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Yellow";

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.year = 2019;
		car2.color = "Blue";

		Car car3 = new Car();
		car3.make = "Cadillac";
		car3.model = "Escalade ESV";
		car3.year = 2016;
		car3.color = "Black";

		Car car4 = new Car();
		car4.make = "Nissan";
		car4.model = "Skyline GT-R V-Spec";
		car4.year = 2002;
		car4.color = "Blue";

		// printing BMW
		System.out.println(car1.make);
		// accessing behavior/method
		car1.drive();
		car1.stop();
		car1.makeNoise();
		car1.accelerate();

		System.out.println(car2.make);
		car2.drive();
		car2.stop();
		car2.makeNoise();
		car2.accelerate();

	}

}

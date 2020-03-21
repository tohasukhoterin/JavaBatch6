package com.syntax.class14;

public class Car {

	// define futures of the car
	String make;
	String model;
	String color;
	int year;

	// define behavior
	void drive() {
		System.out.println(make + " " + model + " Car can drive");
	}

	void accelerate() {
		System.out.println(make + " " + model + " Car can accelerate");
	}

	void makeNoise() {
		System.out.println(make + " " + model + " Car makes noise");
	}

	void stop() {
		System.out.println(make + " " + model + " Car can stop");
	}

}
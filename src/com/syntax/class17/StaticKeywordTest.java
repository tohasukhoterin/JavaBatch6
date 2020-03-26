package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		
		//access static members of another class
		StaticKeyword.brand="Samsung";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		
		//access instance members of another class
		StaticKeyword obj=new StaticKeyword();
		obj.color="white";
		obj.memory=512;
		obj.displaySpecs();
		
	}

}

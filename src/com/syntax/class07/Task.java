package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		int y=10;
		y=y++;//сначала записывает значение потом прибавляет 
		System.out.println(y);
		int x=10;
		x=++x;//сначала прибаляет потом записывает значение
		System.out.println(x);

	}

}

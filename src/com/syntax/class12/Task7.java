package com.syntax.class12;

import java.util.Scanner;

public class Task7 {
	public static void main (String[] args) {
		Scanner inp=new Scanner(System.in);
		int max,min,max2,s;
		System.out.println("Eneter the array size");
		s=inp.nextInt();
		int[] arr=new int[s];	
		for (int i=0; i<arr.length; i++) {
			System.out.println("Please enter "+(i+1)+" elemet of the array");
			arr[i]=inp.nextInt();
		}
		min=arr[0];
		for (int i=0; i<arr.length; i++) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		max=min;
		max2=min;
		for (int i=0; i<arr.length; i++) {
			if (max<arr[i]) {
				max2=max;
				max=arr[i];
				}
			else if (max2<arr[i]){
				max2=arr[i];
			}
			
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		System.out.println("2nd max:"+max2);
	}
}

package com.syntax.class03;
import java.util.Scanner;
public class Task01 {

	public static void main (String[] args){
		  String n;
		  String o;
		  Scanner scan=new Scanner(System.in);
		  n=scan.nextLine();
		  switch (n){
		    case "Shava":
		      o="Will take care of Java Assignment";
		      break;
		    case "Sandish":
		      o="Will take care of SDLC Assignment";
		      break;  
		    case "Weqas":
		      o="Will take care of Selenium Assignment";
		      break;
		    case "Asel":
		      o="Will take care of every Assignment";
		      break;  
		    default:
		      o="Invalid instructor selected";
		  }
		  System.out.println(o);
		}
		}

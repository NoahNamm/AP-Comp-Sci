/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
	String Sentance1 = a;
	System.out.println(Sentance1);
	}
	public static void toStringCombined(String a, String b){
		String Sentance1 = a;
		String Sentance2 = b;
		System.out.println(Sentance1+" "+Sentance2);
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentance!");
	String a;
	a = sc.nextLine();
	System.out.println("Write a sentance!");
	String b;
	b = sc.nextLine();
	toString(a);
	toStringCombined(a,b);
	}
	
}

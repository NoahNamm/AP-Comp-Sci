/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random; 

class starter {
	public static void main(String args[]) {
		int num1 = (int)(Math.random()*2);
		int num2 = (int)(Math.random()*2);
		
		if (num1==num2){
			System.out.println("The two numbers are the same. "+num1+" equals "+num2);
		}
		else
		System.out.println("The two numbers are not the same. "+num1+" does not equal "+num2);
		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input an integer.");
		
		int num1 = sc.nextInt();
		
		System.out.println("Please enter another integer.");
		
		int num2 = sc.nextInt();
		
		if (num1==num2){
			System.out.println("The two numbers are the same. "+num1+" equals "+num2);
		}
		else
		System.out.println("The two numbers are not the same. "+num1+" does not equal "+num2);
		
		
		
		 
	}
}

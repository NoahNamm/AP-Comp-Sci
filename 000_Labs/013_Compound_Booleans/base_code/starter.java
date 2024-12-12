/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter three integers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3){
		System.out.println(num1+" is the largest number.");
		}
		else if (num2>num3 && num2>num1){
		System.out.println(num2+" is the largest number.");
		}
		else{
		System.out.println(num3+" is the largest number.");
		}
		
		if(num1<num2&&num1<num3)
		System.out.println(num1+" is the smallest number.");
		
		else if (num2<num1&&num2<num3)
		System.out.println(num2+" is the smallest number.");
		 
		else 
		System.out.println(num3+" is the smallest number");
	}
}

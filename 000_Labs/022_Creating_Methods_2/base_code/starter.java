/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		int answer = a;
		while (b>1){
		answer = answer*a;
		b--;
		}
		return answer;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int base = sc.nextInt();
	System.out.println("What is your exponent number?");
	int exp = sc.nextInt();
	System.out.println("Your answer is "+pow(base,exp));
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int secret = (int)(Math.random()*1000)+1;
		System.out.println("I am thinking of a secret number 1-1000. Guess which number I am thinking of");
		int guess = sc.nextInt();
		while(true){
		if (guess == secret){
			System.out.println("You got it! The secret number was "+secret);
			break;
		}
		if (guess>1000||guess<1){
			System.out.println("The number is between 1-1000. Please guess again");
			guess = sc.nextInt();
		}
		System.out.println("Nope that's not correct. Guess again");
		guess = sc.nextInt();
		}
		
		
	}
}

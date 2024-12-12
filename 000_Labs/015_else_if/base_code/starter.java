/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*1000)+1;
		System.out.println("Guess a number that I am thinking of between 1-1000");
		
		int guess = sc.nextInt();
		
		if (guess==random)
		System.out.println("Your guess was correct! The number was"+random);
		else if (guess>random)
		System.out.println("Your guess was higher than the number. The number was "+random);
		else if (guess<random)
		System.out.println("Your guess was lower than the number. The number was "+random);
	}
}

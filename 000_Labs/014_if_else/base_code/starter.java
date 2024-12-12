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
	
	System.out.println("Gues the number I am thinkin of, enter a random integer");
	
	int guess = sc.nextInt();
	 
	if (random==guess)
	System.out.println("Your guess was correct! The number was "+random);
	else 
	System.out.println("Your guess was not the random number, the number was "+random);
	}
}

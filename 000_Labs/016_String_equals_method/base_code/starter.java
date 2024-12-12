/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Do you want to be a Wizard, Warrior, or a Rogue?");
	
	String answer = sc.nextLine();

	if (answer.equals("Wizard")||answer.equals("wizard"))
	System.out.println("You have chosen to become a Wizard!");
	
	else if (answer.equals("Warrior")||answer.equals("warrior"))
	System.out.println("You have chosen to become a Warrior!");
	
	else if (answer.equals("Rogue")||answer.equals("rogue"))
	System.out.println("You have chosen to become a Rogue!");
	
	else
	System.out.println("That is not an option");
	}
}

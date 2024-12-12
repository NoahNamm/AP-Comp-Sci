/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String ("Wizard");
	int strength = 5;
	int dexterity = 5;
	int intelligence = 5;
	int charizz = 5;
}

class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println("Your role is "+myCharacter.role);
		System.out.println("Your strength level is "+myCharacter.strength);
		System.out.println("Your dexterity level is "+myCharacter.dexterity);
		System.out.println("Your intelligence level is "+myCharacter.intelligence);
		System.out.println("Your charisma level is "+myCharacter.charizz);
		
	}
}

/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;

	public myCharacter(String role){
	if (role.equals("Wizard")||role.equals("wizard")){
	System.out.println("You chose the Wizard! HUZAH!");
	System.out.println("Your role is Wizard");
	System.out.println("Your strength trait is 0");
	System.out.println("Your dexterity trait is 0");
	System.out.println("Your intelligence is 0");
	System.out.println("Your constitution is 0");
	System.out.println("Your charisma is 0");
	}
	else if (role.equals("Warrior")||role.equals("warrior")){
		role = "Warrior";
	System.out.println("You chose the Warrior! For HONOR!");
	System.out.println("Your role is Warrior");
	System.out.println("Your strength trait is 0");
	System.out.println("Your dexterity trait is 0");
	System.out.println("Your intelligence is 0");
	System.out.println("Your constitution is 0");
	System.out.println("Your charisma is 0");
	}
	else if (role.equals("Rogue")||role.equals("rogue")){
	System.out.println("You chose Rogue! How unique");
	System.out.println("Your role is Rogue");
	System.out.println("Your strength trait is 0");
	System.out.println("Your dexterity trait is 0");
	System.out.println("Your intelligence is 0");
	System.out.println("Your constitution is 0");
	System.out.println("Your charisma is 0");
	}
	else {
	System.out.println("Your role is no role");
	System.out.println("Your strength trait is 0");
	System.out.println("Your dexterity trait is 0");
	System.out.println("Your intelligence is 0");
	System.out.println("Your constitution is 0");
	System.out.println("Your charisma is 0");
	}
	}
}


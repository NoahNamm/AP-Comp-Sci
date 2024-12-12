/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma; 
	
	public BaseClass() {
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public BaseClass(String r){
		if (r.equals("Warrior")||r.equals("warrior")){
			role = "warrior";
			strength = 8;
			dexterity = 6;
			intelligence = 3;
			constitution = 2;
			charisma = 3;
		}
		else if (r.equals("Wizard")||r.equals("wizard")){
			role = "wizard";
			strength = 2;
			dexterity = 2;
			intelligence = 8;
			constitution = 4;
			charisma = 4;
		}
		else if (r.equals("Rogue")||r.equals("rogue")){
			role = "rogue";
			strength = 4;
			dexterity = 8;
			intelligence = 3;
			constitution = 1;
			charisma = 4;
		}
		else {
			role = "No Role";
			strength = 0;
			dexterity = 0;
			intelligence = 0;
			constitution = 0;
			charisma = 0;
		}
		}
	public void myToString(){
		System.out.println("--------------------------");
		System.out.println("Your role is "+role);
		System.out.println("Your strength trait is at "+strength);
		System.out.println("Your dexterity trait is at "+dexterity);
		System.out.println("Your intelligence trait is at "+intelligence);
		System.out.println("Your constitution trait is at "+constitution);
		System.out.println("Your charisma trait is at "+charisma);
		System.out.println("--------------------------");
	}
}


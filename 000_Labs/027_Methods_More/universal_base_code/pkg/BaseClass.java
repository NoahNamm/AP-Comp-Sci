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
	int charisma; 
	
	public BaseClass() {
		role = "no role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public void myToString(){
		System.out.println("--------------------------");
		System.out.println("Your role is "+role);
		System.out.println("Your strength trait is at "+strength);
		System.out.println("Your dexterity trait is at "+dexterity);
		System.out.println("Your intelligence trait is at "+intelligence);
		System.out.println("Your charisma trait is at "+charisma);
		System.out.println("--------------------------");
	}
	public String setRole(String r){
		if (r.equals("Warrior")||r.equals("warrior")){
			role = "warrior";
		}
		else if (r.equals("Wizard")||r.equals("wizard")){
			role = "wizard";
		}
		else if (r.equals("Rogue")||r.equals("rogue")){
			role = "rogue";
		}
		else
			role = "No Role";
		return role;
	}
	public int setStrength(int s){
		if (s<0)
		strength = 0;
		else
		strength = s;
		return strength;
	}
	public int setDexterity(int d){
		if (d<0)
		dexterity =0;
		else 
		dexterity = d;
		return dexterity;
	}
	public int setIntelligence(int i){
		if (i<0)
		intelligence = 0;
		else
		intelligence = i;
		return intelligence;
	}
	public int setCharisma(int c){
		if (c<0)
		charisma = 0;
		else
		charisma = c;
		return charisma;
	}
	public boolean setAll(String r, int s, int d, int i, int c){
		if (r.equals("Warrior")||r.equals("warrior")){
			role = "warrior";
		}
		else if (r.equals("Wizard")||r.equals("wizard")){
			role = "wizard";
		}
		else if (r.equals("Rogue")||r.equals("rogue")){
			role = "rogue";
		}
		else
			role = "No Role";
			
		if (s<0||d<0||i<0||c<0)
		return false;
		else 
		strength = s;
		dexterity = d;
		intelligence = i;
		charisma = c;
		return true;
	}
}

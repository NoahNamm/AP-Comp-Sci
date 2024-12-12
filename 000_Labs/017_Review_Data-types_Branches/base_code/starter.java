/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a name for your character");
	String name = sc.nextLine();
	System.out.println("Please enter a title for your character");
	String title = sc.nextLine();
	
	System.out.println("Do you want to be a Wizard, Warrior, or a Rogue?");
	
	String role = sc.nextLine();

	if (role.equals("Wizard")||role.equals("wizard"))
	System.out.println("You have chosen to become a Wizard!");
	
	else if (role.equals("Warrior")||role.equals("warrior"))
	System.out.println("You have chosen to become a Warrior!");
	
	else if (role.equals("Rogue")||role.equals("rogue"))
	System.out.println("You have chosen to become a Rogue!");
	
	else
	System.out.println("That is not an option");
	
	int point = 20;
	System.out.println("You have 20 points to spend on the following stats, choose wisely!");
	//strength input
	System.out.println("Strength (1-10)");
	int strength = sc.nextInt();
	if (strength<=10&&strength>=0&&(point-strength>=0)){
	}
	else if (strength>10){
	System.out.println("Please enter a smaller number between 1 and 10");
	strength = sc.nextInt();
	}
	else if (point-strength<0){
	System.out.println("You do not have that many points to spend, please enter points that you do have between 0 and 10");
	strength = sc.nextInt();
	}
	point=point-strength;
	System.out.println("You now have "+point+" left to use.");
	//Dexterity input
	System.out.println("Dexterity (1-10)");
	int dexterity = sc.nextInt();
	if (dexterity<=10&&dexterity>=0&&(point-dexterity>=0)){
	}
	else if (dexterity>10){
	System.out.println("Please enter a smaller number between 1 and 10");
	dexterity = sc.nextInt();
	}
	else if (point-dexterity<0){
	System.out.println("You do not have that many points to spend, please enter points that you do have between 0 and 10");
	strength = sc.nextInt();
	}
	point=point-dexterity;
	System.out.println("You now have "+point+" left to use.");
	//Intelligence input
	System.out.println("Intelligence (1-10)");
	int intelligence = sc.nextInt();
	if (intelligence<=10&&intelligence>=0&&(point-intelligence>=0)){
	}
	else if (intelligence>10){
	System.out.println("Please enter a smaller number between 1 and 10");
	intelligence = sc.nextInt();
	}
	else if (point-intelligence<0){
	System.out.println("You do not have that many points to spend, please enter points that you do have between 0 and 10");
	intelligence = sc.nextInt();
	}
	point=point-intelligence;
	System.out.println("You now have "+point+" left to use.");
	//Charisma input
	System.out.println("Charisma (1-10)");
	int rizz = sc.nextInt();
	if (rizz<=10&&rizz>=0&&(point-rizz>=0)){
	}
	else if (rizz>10){
	System.out.println("Please enter a smaller number between 1 and 10");
	rizz = sc.nextInt();
	}
	else if (point-rizz<0){
	System.out.println("You do not have that many points to spend, please enter points that you do have between 0 and 10");
	strength = sc.nextInt();
	}
	point=point-rizz;
	System.out.println("You have "+point+" left to use for next time.");
	
	System.out.println("You are "+(name)+", the "+(title)+" of CVHS.");
	
	System.out.println("You are a "+(role)+" with the following stats:");
	
	System.out.println("Strength: "+strength);
	System.out.println("Dexterity: "+dexterity);
	System.out.println("Intelligence: "+intelligence);
	System.out.println("Charisma: "+rizz);
	System.out.println("Good luck on your quest "+name);
}
}
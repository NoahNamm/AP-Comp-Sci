/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a role for character 1");
		String role = sc.nextLine();
		
		System.out.println("Input a level of strength");
		int strength = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input a level of dexterity");
		int dexterity = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input a level of intelligence");
		int intelligence = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input a level of charisma");
		int charisma = sc.nextInt();
		sc.nextLine();
		
		BaseClass character1 = new BaseClass();
		
		character1.setRole(role);
		character1.setStrength(strength);
		character1.setDexterity(dexterity);
		character1.setIntelligence(intelligence);
		character1.setCharisma(charisma);

		System.out.println("Input a role for character 2");
		String role2 = sc.nextLine();
		
		System.out.println("Input a level of strength for character 2");
		int strength2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input a level of dexterity for character 2");
		int dexterity2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input a level of intelligence for character 2");
		int intelligence2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input a level of charisma for character 2");
		int charisma2 = sc.nextInt();
		sc.nextLine();
		
		BaseClass character2 = new BaseClass();
		character2.setAll(role2, strength2, dexterity2, intelligence2, charisma2);
		
		character1.myToString();
		character2.myToString();
		
	}
}

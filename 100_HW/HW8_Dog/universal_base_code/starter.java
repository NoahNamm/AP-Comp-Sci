/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog Jack = new Dog("Jack", 12);
		Dog Saam = new Dog("Saam", "prototyper");
		Jack.isSleeping();
		boolean jackBark;
		if (!Jack.isSleeping()){
			System.out.println("Jack: Bark!");
			jackBark = true;
		}
		else {
		System.out.println("Jack is sleeping.");
		jackBark = false;
		}
		
		Saam.isSleeping();
		if (!Saam.isSleeping()&&jackBark){
			System.out.println("Saam: Bark!");
		}
		else if (jackBark&&Saam.isSleeping())
			System.out.println("Saam: Bark!");
	}
}

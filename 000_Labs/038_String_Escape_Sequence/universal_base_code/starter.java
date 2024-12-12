/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Please state your greatest dislike.");
		String answer = sc.nextLine();
		
		if (answer.equals("Saam")){
			System.out.println("Yippee");
		}
		else
		System.out.println("Did you say \""+answer+"\" was your greatest dislike?\n \t How dare you. \\ GYYEEETT OUT");
		
	}
}

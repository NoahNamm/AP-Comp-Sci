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
	System.out.println("What class would you like to be?");
	String answer = sc.nextLine();
	myCharacter character1 = new myCharacter(answer);
	}
}

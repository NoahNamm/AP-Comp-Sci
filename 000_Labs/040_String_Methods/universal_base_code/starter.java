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
		BaseClass test = new BaseClass();
		System.out.println("Please enter your first and last name");
		String name = sc.nextLine();
		String lastName = new String (" ");
		for (int i = 0; i<name.length(); i++){
			if (name.substring(i, i+1).equals(" ")){
				lastName = name.substring(i+1);
			}
		}
		System.out.println("Your last name is "+lastName);

		
	}
}

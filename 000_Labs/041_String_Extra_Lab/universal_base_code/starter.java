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
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a phrase");
		String phrase = sc.nextLine();
		
		String finalSent = new String("");
		
		while (true){
			if (phrase.indexOf(" ") == -1){
				finalSent = phrase + " " + finalSent;
				break;
			}
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space);
			
			
			phrase = phrase.substring(space+1);
			finalSent = word + " " + finalSent;
		}
		System.out.print(finalSent);
	}
}
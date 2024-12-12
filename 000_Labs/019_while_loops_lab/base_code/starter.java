/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int said = 0;
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("And how many times should I say it?");
		int say = sc.nextInt();
		
		while (true){
			if (said >=say){
				break;
			}
			System.out.println(said+1 +". "+name);
			said=said+1;
		}
		

		
	}
}

/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a message you want to encode/decipher");
		String message = sc.nextLine();
		System.out.println("Please enter an integer for key");
		int key = sc.nextInt();
		
		System.out.println("Encode/decode lvl 1");
		
		System.out.println(Cipher.encode(message));
		
		System.out.println("encode/decode lvl 2");
		
		System.out.println(Cipher.keyedEncode(message, key));
		
		System.out.println("Deciphering completely using all keys");
		key = 0;
		while (key<37){
			key++;
			System.out.print("Key " + key+": ");
			System.out.println(Cipher.keyedEncode(message, key));
		}

	}
}

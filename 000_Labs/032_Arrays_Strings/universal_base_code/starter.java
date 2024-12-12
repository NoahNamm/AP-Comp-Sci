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
		String [] arr = new String [10];
		int i = 0;
		arr[0] = "We're no strangers to love";
		arr[1] = "You know the rules and so do I";
		arr[2] = "A full commitment's what I'm thinkin' of";
		arr[3] = "You wouldn't get this from any other guy";
		arr[4] = "I just wanna tell you how I'm feeling";
		arr[5] = "Gotta make you understand";
		arr[6] = "Never gonna give you up";
		arr[7] = "Never gonna let you down";
		arr[8] = "Never gonna run around and desert you";
		arr[9] = "Never gonna make you cry";
		
		while (i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
		
	}
}

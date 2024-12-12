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
		System.out.println("Please select a role");
		String r = sc.nextLine();
		BaseClass roleAttributes = new BaseClass(r);
		roleAttributes.myToString();


		
	}
}
